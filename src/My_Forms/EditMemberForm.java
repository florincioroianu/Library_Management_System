
package My_Forms;

import My_Classes.Member;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class EditMemberForm extends javax.swing.JFrame {

    
    
    My_Classes.Member member = new My_Classes.Member();
    
    
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    
    
    String imagePath = null;
    
    public EditMemberForm() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        
        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 152, 117));
        jPanel1.setBorder(panelHeaderBorder);
        
        
        Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_Image.setBorder(JlabelImageBorder);
        
        
        
        
       func.displayImage(90, 60,null,"/My_Images/members.png", jLabel_FormTitle);
       
       
       
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
        jButton_Edit_ = new javax.swing.JButton();
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
        jButton_SelectProfilePicture_ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Editare utilizator");
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

        jButton_Edit_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton_Edit_.setText("Editare");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel8.setText("Fotografie de profil:");

        jButton_SelectProfilePicture_.setText("Alege fotografie");
        jButton_SelectProfilePicture_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectProfilePicture_ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel5.setText("ID utilizator");

        jTextField_Id.setFont(new java.awt.Font("Verdana", 0, 14)); 

        jButton_Search_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton_Search_.setText("Cautare");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        jLabel_Image.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image.setOpaque(true);

        jLabel_ImagePath.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); 
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_EmptyPhone_))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel_EmptyFirstName_))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_EmptyLastName_)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(8, 8, 8))
                                    .addComponent(jButton_SelectProfilePicture_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search_))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Phone_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyPhone_, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_SelectProfilePicture_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_ImagePath)
                                .addGap(0, 64, Short.MAX_VALUE))
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }

    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {

        
        jLabel_EmptyFirstName_.setVisible(false);

    }

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        
        
       jLabel_EmptyFirstName_.setVisible(false);
       jLabel_EmptyLastName_.setVisible(false);
       jLabel_EmptyPhone_.setVisible(false);
        
       
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String phone = jTextField_Phone_.getText();
        String email = jTextField_Email.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();

        
        if(fname.trim().isEmpty())
        {
            jLabel_EmptyFirstName_.setVisible(true);
        }
        else if(lname.trim().isEmpty())
        {
            jLabel_EmptyLastName_.setVisible(true);
        }
        else if(phone.trim().isEmpty())
        {
            jLabel_EmptyPhone_.setVisible(true);
        }
        else 
        {
           byte[] img = null;
           
           if(imagePath != null)
           {
               
               try {
                   
                   Integer id = Integer.parseInt(jTextField_Id.getText());
                   Path path = Paths.get(imagePath);
                   img = Files.readAllBytes(path);
                   member.editMember(id,fname, lname, phone, email, gender, img);
                   
               } catch (IOException | NumberFormatException ex) {
                   JOptionPane.showMessageDialog(null, "Introduceti ID ul de administrator si o fotografie","ID sau fotografie lipsa",2);
               }
               
           }else
           {
               JOptionPane.showMessageDialog(null, "Selectati fotografia de profil!","Nicio fotografie selectata",2);
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
        jLabel_ImagePath.setText(path);
        imagePath = path;
        
        
        func.displayImage(125, 80,null,path, jLabel_Image);
        
    }

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {
        
        
          Member SelectedMember;
        try {
            
            Integer id = Integer.parseInt(jTextField_Id.getText());
            
            SelectedMember = member.getMemberById(id);
            
            if(SelectedMember != null)
            {
                jTextField_Id.setText(String.valueOf(SelectedMember.getId()));
                jTextField_FirstName.setText(SelectedMember.getFirstName());
                jTextField_LastName.setText(SelectedMember.getLastName());
                jTextField_Phone_.setText(SelectedMember.getPhone());
                jTextField_Email.setText(SelectedMember.getEmail());
                jComboBox_Gender.setSelectedItem(SelectedMember.getGender());

                
                byte[] image = SelectedMember.getPicture();
                
               
               func.displayImage(125, 80,image,"", jLabel_Image);
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Niciun administrator nu are acest ID","Invalid ID",3); 
            }
            
        } catch (SQLException | NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(null, "Introduceti un ID valid","Invalid ID",3);
        }
          
    }

    private void jTextField_Phone_KeyTyped(java.awt.event.KeyEvent evt) {
        
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }

    
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JButton jButton_SelectProfilePicture_;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPhone_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Phone_;
    
}
