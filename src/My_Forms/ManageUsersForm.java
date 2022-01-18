
package My_Forms;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class ManageUsersForm extends javax.swing.JFrame {

    

    My_Classes.Users user = new My_Classes.Users();

    public ManageUsersForm() {
        initComponents();

        
        this.setLocationRelativeTo(null);

        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(242, 217, 132));
        jPanel1.setBorder(panelHeaderBorder);

        
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60, null, "/My_Images/users.png", jLabel_FormTitle);

        
        func.customTable(jTable_Users_);

        
        func.customTableHeader(jTable_Users_, new Color(34, 167, 240), 16);

        
        
        
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white);
        jLabel_EmptyUserName_.setForeground(Color.white);
        jLabel_EmptyPassword_.setForeground(Color.white);

        
        populateJtableWithUsers();

    }

    
    @SuppressWarnings("unchecked")
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_FirstName = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users_ = new javax.swing.JTable();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jLabel_EmptyUserName_ = new javax.swing.JLabel();
        jLabel_EmptyPassword_ = new javax.swing.JLabel();
        jCheckBox_SetAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel_FormTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Administrare utilizatori");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); 
        jLabel_CloseForm_.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel2.setText("Nume:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jTextField_ID.setEnabled(false);

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 14)); 

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
        jButton_Delete_.setText("Eliminare");
        jButton_Delete_.setPreferredSize(new java.awt.Dimension(120, 25));
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_Users_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jTable_Users_.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        jTable_Users_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Users_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users_);

        jLabel_EmptyFirstName_.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyFirstName_.setText("* introduceti numele mic");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel3.setText("Nume de familie:");

        jTextField_LastName.setFont(new java.awt.Font("Verdana", 0, 14)); 

        jLabel_EmptyLastName_.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel_EmptyLastName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyLastName_.setText("* introduceti numele de familie");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel4.setText("Username:");

        jTextField_Username.setFont(new java.awt.Font("Verdana", 0, 14)); 

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel6.setText("Parola:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel7.setText("Reintroduceti parola:");

        jPasswordField_1.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jPasswordField_2.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel_EmptyUserName_.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel_EmptyUserName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyUserName_.setText("* introduceti username-ul");
        jLabel_EmptyUserName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyUserName_MouseClicked(evt);
            }
        });

        jLabel_EmptyPassword_.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel_EmptyPassword_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyPassword_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPassword_MouseClicked(evt);
            }
        });

        jCheckBox_SetAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jCheckBox_SetAdmin.setText("Grad de administrator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField_FirstName)
                                                        .addComponent(jTextField_LastName)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jButton_Add_,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        107,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jButton_Edit_,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        107,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton_Delete_,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        106,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel1)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jTextField_ID,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        110,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel_EmptyFirstName_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                240,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel_EmptyLastName_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                240,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 13, Short.MAX_VALUE)))
                                                .addGap(28, 28, 28))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_EmptyPassword_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jPasswordField_1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 335,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_Username,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 335,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel_EmptyUserName_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPasswordField_2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 336,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jCheckBox_SetAdmin,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 224,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
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
                                                .addGap(31, 31, 31)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534,
                                                        Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_ID,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addGap(5, 5, 5)
                                                .addComponent(jTextField_FirstName,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_EmptyFirstName_,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_LastName,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_EmptyLastName_,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_Username,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel_EmptyUserName_,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_EmptyPassword_,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jCheckBox_SetAdmin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                .addGap(20, 20, 20)))));

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

    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {

        
        jLabel_EmptyFirstName_.setForeground(Color.white);

    }

    private void jTable_Users_MouseClicked(java.awt.event.MouseEvent evt) {

        

        
        int index = jTable_Users_.getSelectedRow();

        
        String id = jTable_Users_.getValueAt(index, 0).toString();
        String firstName = jTable_Users_.getValueAt(index, 1).toString();
        String lastName = jTable_Users_.getValueAt(index, 2).toString();
        String username = jTable_Users_.getValueAt(index, 3).toString();
        String password = jTable_Users_.getValueAt(index, 4).toString();
        String userType = jTable_Users_.getValueAt(index, 5).toString();

        
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_Username.setText(username);
        jPasswordField_1.setText(password);
        jPasswordField_2.setText(password);

        if (userType.equals("admin")) {
            jCheckBox_SetAdmin.setSelected(true);
        } else {
            jCheckBox_SetAdmin.setSelected(false);
        }

    }

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        try {
            int id = Integer.parseInt(jTextField_ID.getText());

            
            int confirm = JOptionPane.showConfirmDialog(null, "Sigur doriti sa stergeti acest utilizator?",
                    "Confirmation Box", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                user.removeUser(id);
            }

            
            populateJtableWithUsers();

            
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Username.setText("");
            jPasswordField_1.setText("");
            jPasswordField_2.setText("");
            jCheckBox_SetAdmin.setSelected(false);

            
            hideLabels();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID invalid - " + ex.getMessage(), "error", 0);
        }

    }

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {

        

        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";

        if (jCheckBox_SetAdmin.isSelected()) {
            userType = "admin";
        }

        
        if (fname.trim().isEmpty())
        {
            jLabel_EmptyFirstName_.setForeground(Color.red);
        } else if (lname.trim().isEmpty())
        {
            jLabel_EmptyLastName_.setForeground(Color.red);
        } else if (username.trim().isEmpty())
        {
            
            jLabel_EmptyUserName_.setForeground(Color.red);
        } else if (password_1.trim().isEmpty())
        {
            
            jLabel_EmptyPassword_.setForeground(Color.red);
        } else if (!password_1.equals(password_2))
        {
            JOptionPane.showMessageDialog(null, "Rescrieti parola corect!", "password error", 0);
        }

        else 
        {
            try {
                
                
                int id = Integer.parseInt(jTextField_ID.getText());

                if (user.checkUsernameExists(id, username)) {
                    JOptionPane.showMessageDialog(null, "Username deja existent!",
                            "eroare username", 0);
                } else {
                    user.editUser(id, fname, lname, username, password_1, userType);

                    
                    populateJtableWithUsers();

                    
                    jTextField_ID.setText("");
                    jTextField_FirstName.setText("");
                    jTextField_LastName.setText("");
                    jTextField_Username.setText("");
                    jPasswordField_1.setText("");
                    jPasswordField_2.setText("");
                    jCheckBox_SetAdmin.setSelected(false);

                    
                    hideLabels();
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Selecteaza utilizatorul pe care doriti sa-l editati",
                        "No ID Selected",
                        0);
            }

            
            
        }

    }

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";

        if (jCheckBox_SetAdmin.isSelected()) {
            userType = "admin";
        }

        
        if (fname.trim().isEmpty())
        {
            jLabel_EmptyFirstName_.setForeground(Color.red);
        } else if (lname.trim().isEmpty())
        {
            jLabel_EmptyLastName_.setForeground(Color.red);
        } else if (username.trim().isEmpty())
        {
            
            jLabel_EmptyUserName_.setForeground(Color.red);
        } else if (password_1.trim().isEmpty())
        {
            
            jLabel_EmptyPassword_.setForeground(Color.red);
        } else if (!password_1.equals(password_2))
        {
            JOptionPane.showMessageDialog(null, "Rescrieti parola corect", "password error", 0);
        }

        
        else if (user.checkUsernameExists(0, username)) {
            JOptionPane.showMessageDialog(null, "Username deja existent", "Username error", 0);
        }

        else 
        {
            user.addUser(fname, lname, username, password_1, userType);

            
            populateJtableWithUsers();

            
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Username.setText("");
            jPasswordField_1.setText("");
            jPasswordField_2.setText("");
            jCheckBox_SetAdmin.setSelected(false);

            
            hideLabels();
        }

    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        
        this.dispose();

    }

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyLastName_.setForeground(Color.white);

    }

    private void jLabel_EmptyUserName_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyUserName_.setForeground(Color.white);

    }

    private void jLabel_EmptyPassword_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyPassword_.setForeground(Color.white);

    }

    
    public void hideLabels() {
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white);
        jLabel_EmptyPassword_.setForeground(Color.white);
        jLabel_EmptyUserName_.setForeground(Color.white);
    }

    
    public void populateJtableWithUsers() {
        ArrayList<My_Classes.Users> usersList = user.usersList();

        
        String[] colNames = { "ID", "Nume", "Nume de familie", "username", "parola", "tip" };

        
        Object[][] rows = new Object[usersList.size()][colNames.length];

        for (int i = 0; i < usersList.size(); i++) {
            rows[i][0] = usersList.get(i).getId();
            rows[i][1] = usersList.get(i).getFirstname();
            rows[i][2] = usersList.get(i).getLastname();
            rows[i][3] = usersList.get(i).getUsername();
            rows[i][4] = usersList.get(i).getPassword();
            rows[i][5] = usersList.get(i).getUserType();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Users_.setModel(model);

    }

    
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JCheckBox jCheckBox_SetAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPassword_;
    private javax.swing.JLabel jLabel_EmptyUserName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users_;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Username;
    
}
