package My_Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Func_Class {

    public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label) {

        ImageIcon imgIco;

        if (imagebyte != null) {
            imgIco = new ImageIcon(imagebyte);
        } else {
            try {

                imgIco = new ImageIcon(getClass().getResource(imagePath));
            } catch (Exception e) {

                imgIco = new ImageIcon(imagePath);
            }

        }

        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(image));

    }

    public void customTable(JTable table) {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(35);
        table.setShowGrid(false);
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.ORANGE);
    }

    public void customTableHeader(JTable table, Color back_Color, Integer fontSize) {
        table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));
        table.getTableHeader().setOpaque(false);
    }

    public String selectImage() {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selectati fotografia de profil");

        fileChooser.setCurrentDirectory(new File("C:\\images"));

        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", ".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);

        int fileState = fileChooser.showSaveDialog(null);
        String path = "";

        if (fileState == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }

        return path;
    }

    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {

            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public int countData(String tableName) {
        int total = 0;
        ResultSet rs;
        Statement st;

        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) as total FROM `" + tableName + "`");
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

}
