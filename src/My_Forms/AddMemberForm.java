
package My_Forms;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AddMemberForm extends javax.swing.JFrame {

    
    My_Classes.Member member = new My_Classes.Member();

    My_Classes.Func_Class func = new My_Classes.Func_Class();

    
    String imagePath = null;

    public AddMemberForm() {
        initComponents();

        
        this.setLocationRelativeTo(null);

        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 152, 117));
        jPanel1.setBorder(panelHeaderBorder);

        
        func.displayImage(90, 60, null, "/My_Images/members.png", jLabel_FormTitle);

        
        jLabel_EmptyFirstName_.setVisible(false);
        jLabel_EmptyLastName_.setVisible(false);
        jLabel_EmptyPhone_.setVisible(false);

    }

    
    @SuppressWarnings("unchecked")
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Phone_ = new javax.swing.JTextField();
        jLabel_EmptyPhone_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_SelectProfilePicture_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Adaugare utilizator");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(1, 152, 117));
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

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel2.setText("Nume:");

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 14)); 

        jButton_Add_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton_Add_.setText("Adaugare utilizator nou");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

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
        jLabel4.setText("Numar de telefon:");

        jTextField_Phone_.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jTextField_Phone_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Phone_KeyPressed(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Phone_KeyTyped(evt);
            }
        });

        jLabel_EmptyPhone_.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jLabel_EmptyPhone_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyPhone_.setText("* introduceti numarul de telefon");
        jLabel_EmptyPhone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPhone_MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel6.setText("Email:");

        jTextField_Email.setFont(new java.awt.Font("Verdana", 0, 14)); 

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel7.setText("Gen:");

        jComboBox_Gender.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barbat", "Femeie" }));
        jComboBox_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GenderActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel8.setText("Fotografie de profil:");

        jLabel_ImagePath.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 0, 204));
        jLabel_ImagePath.setText("Alege o fotografie");

        jButton_SelectProfilePicture_.setText("Selectare fotografie");
        jButton_SelectProfilePicture_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectProfilePicture_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 328,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel_EmptyLastName_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel_EmptyFirstName_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField_Phone_)
                                                        .addComponent(jTextField_LastName)
                                                        .addComponent(jTextField_FirstName,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField_Email)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(198, 198, 198))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox_Gender, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel_EmptyPhone_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                240,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel8)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel_ImagePath,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        161,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(
                                                                                        jButton_SelectProfilePicture_)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jButton_Add_,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
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
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Phone_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyPhone_, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_ImagePath)
                                        .addComponent(jButton_SelectProfilePicture_))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE));

        pack();
    }

    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {

        
        jLabel_EmptyFirstName_.setVisible(false);

    }

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {

        

        
        jLabel_EmptyFirstName_.setVisible(false);
        jLabel_EmptyLastName_.setVisible(false);
        jLabel_EmptyPhone_.setVisible(false);

        
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String phone = jTextField_Phone_.getText();
        String email = jTextField_Email.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();

        
        if (fname.trim().isEmpty()) {
            jLabel_EmptyFirstName_.setVisible(true);
        } else if (lname.trim().isEmpty()) {
            jLabel_EmptyLastName_.setVisible(true);
        } else if (phone.trim().isEmpty()) {
            jLabel_EmptyPhone_.setVisible(true);
        } else 
        {
            byte[] img = null;

            if (imagePath != null) {

                try {

                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    member.addMember(fname, lname, phone, email, gender, img);

                } catch (IOException ex) {
                    Logger.getLogger(AddMemberForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Selectati o fotografie de profil", "Nicio fotografie aleasa", 2);
            }
        }

    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        
        this.dispose();

    }

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyLastName_.setVisible(false);

    }

    private void jLabel_EmptyPhone_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyPhone_.setVisible(false);

    }

    private void jButton_SelectProfilePicture_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        String path = func.selectImage();
        if (!path.equals("")) {
            jLabel_ImagePath.setText(path);
            imagePath = path;
        }

    }

    private void jTextField_Phone_KeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void jTextField_Phone_KeyTyped(java.awt.event.KeyEvent evt) {
        
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    private void jComboBox_GenderActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_SelectProfilePicture_;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPhone_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Phone_;
    
}