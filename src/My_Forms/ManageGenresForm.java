
package My_Forms;

import My_Classes.Genre;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ManageGenresForm extends javax.swing.JFrame {

    My_Classes.Genre genre = new My_Classes.Genre();

    public ManageGenresForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.gray);
        jPanel1.setBorder(panelHeaderBorder);

        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60, null, "/My_Images/hierarchy.png", jLabel_FormTitle);

        func.customTable(jTable_Genres_);

        func.customTableHeader(jTable_Genres_, new Color(42, 187, 155), 20);

        jLabel_EmptyName_.setVisible(false);

        populateJtableWithGenres();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Genres_ = new javax.swing.JTable();
        jLabel_EmptyName_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(java.awt.Color.gray);
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Administrare categorii");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(java.awt.Color.gray);
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16));
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18));
        jLabel2.setText("Nume:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 18));

        jTextField_Name.setFont(new java.awt.Font("Verdana", 0, 18));

        jButton_Add_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Add_.setText("Adaugare");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Edit_.setText("Editare");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Delete_.setText("Stergere");
        jButton_Delete_.setPreferredSize(new java.awt.Dimension(120, 25));
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_Genres_.setFont(new java.awt.Font("Tahoma", 0, 16));
        jTable_Genres_.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        jTable_Genres_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Genres_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Genres_);

        jLabel_EmptyName_.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel_EmptyName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyName_.setText("* introduceti genul");
        jLabel_EmptyName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyName_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 601,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jTextField_ID,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_Name,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 240,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jLabel_EmptyName_,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_ID,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_Name,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_EmptyName_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton_Add_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_Edit_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_Delete_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(20, 20, 20))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)
                                                .addContainerGap()))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void jLabel_EmptyName_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyName_.setVisible(false);

    }

    private void jTable_Genres_MouseClicked(java.awt.event.MouseEvent evt) {

        int index = jTable_Genres_.getSelectedRow();

        String id = jTable_Genres_.getValueAt(index, 0).toString();
        String name = jTable_Genres_.getValueAt(index, 1).toString();

        jTextField_ID.setText(id);
        jTextField_ID.setEditable(false);
        jTextField_Name.setText(name);

    }

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            int id = Integer.parseInt(jTextField_ID.getText());

            int confirm = JOptionPane.showConfirmDialog(null, "Esti sigur ca doresti sa stergi acest gen?",
                    "Confirmation Box", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                genre.removeGenre(id);
            }

            populateJtableWithGenres();

            jTextField_ID.setText("");
            jTextField_Name.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID invalid - " + ex.getMessage(), "error", 0);
        }

    }

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {

        String name = jTextField_Name.getText();

        if (name.trim().isEmpty()) {
            jLabel_EmptyName_.setVisible(true);
        } else {
            try {
                int id = Integer.parseInt(jTextField_ID.getText());
                genre.editGenre(id, name);

                jLabel_EmptyName_.setVisible(false);

                populateJtableWithGenres();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID invalid - " + ex.getMessage(), "error", 0);
            }

        }

    }

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {

        String name = jTextField_Name.getText();

        if (name.trim().isEmpty()) {
            jLabel_EmptyName_.setVisible(true);
        } else {
            genre.addGenre(name);

            jLabel_EmptyName_.setVisible(false);

            populateJtableWithGenres();
        }

    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        this.dispose();

    }

    public void populateJtableWithGenres() {
        ArrayList<My_Classes.Genre> genresList = genre.genreList();

        String[] colNames = { "ID", "Categorie" };

        Object[][] rows = new Object[genresList.size()][colNames.length];

        for (int i = 0; i < genresList.size(); i++) {
            rows[i][0] = genresList.get(i).getId();
            rows[i][1] = genresList.get(i).getName();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Genres_.setModel(model);

    }

    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Genres_;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;

}
