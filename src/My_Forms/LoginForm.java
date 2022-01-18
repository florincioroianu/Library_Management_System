
package My_Forms;

import My_Classes.DB;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), null, "/My_Images/book_login_logo.png",
                jLabel_Logo);

        Border jlabelBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_Login_.setBorder(jlabelBorder);

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPassword_Pass = new javax.swing.JPasswordField();
        jLabel_Login_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Logo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Logo.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Utilizator:");

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTextField_Username.setForeground(new java.awt.Color(0, 102, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setText("Parola:");

        jPassword_Pass.setFont(new java.awt.Font("Tahoma", 0, 18));
        jPassword_Pass.setForeground(new java.awt.Color(0, 102, 204));

        jLabel_Login_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Login_.setFont(new java.awt.Font("SansSerif", 0, 24));
        jLabel_Login_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Login_.setText("Conectare");
        jLabel_Login_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Login_.setOpaque(true);
        jLabel_Login_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Login_MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Login_MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Login_MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_Login_MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_Login_MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Username)
                                        .addComponent(jPassword_Pass)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(0, 360, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel_Login_, javax.swing.GroupLayout.PREFERRED_SIZE, 402,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPassword_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel_Login_, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 228,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(124, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void jLabel_Login_MouseClicked(java.awt.event.MouseEvent evt) {

        String username = jTextField_Username.getText();
        String password = String.valueOf(jPassword_Pass.getPassword());

        if (username.trim().equals("") || password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Introduceti username-ul si parola", "Campuri goale", 2);
        } else {
            My_Classes.Users user = new My_Classes.Users().tryLogin(username, password);

            if (user != null) {

                DashboardForm dash_f = new DashboardForm();

                if (user.getUserType().equals("admin")) {
                    dash_f.jButton_ManageUsers_.setVisible(false);
                } else if (user.getUserType().equals("user")) {
                    dash_f.jLabel_CirculationTitle_.setVisible(false);
                    dash_f.jButton_ReturnBook_.setVisible(false);
                    dash_f.jLabel_some_awsome_name_here_.setVisible(false);
                    dash_f.jButton_IssueBook_.setVisible(false);
                    dash_f.jButton_ManageUsers_.setVisible(false);
                }

                dash_f.jLabel_WelcomeUsername.setText("Bine ai revenit, " + user.getUsername() + "");

                dash_f.setVisible(true);

                this.dispose();
            }

            else {
                JOptionPane.showMessageDialog(null, "Date de conectare invalide!", "Date incorecte", 0);
            }

        }

    }

    private void jLabel_Login_MouseEntered(java.awt.event.MouseEvent evt) {

        jLabel_Login_.setBackground(new Color(236, 240, 241));
    }

    private void jLabel_Login_MouseExited(java.awt.event.MouseEvent evt) {

        jLabel_Login_.setBackground(Color.white);
    }

    private void jLabel_Login_MousePressed(java.awt.event.MouseEvent evt) {

        jLabel_Login_.setBackground(new Color(108, 122, 137));
    }

    private void jLabel_Login_MouseReleased(java.awt.event.MouseEvent evt) {

        jLabel_Login_.setBackground(new Color(236, 240, 241));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {

            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Login_;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword_Pass;
    private javax.swing.JTextField jTextField_Username;

}
