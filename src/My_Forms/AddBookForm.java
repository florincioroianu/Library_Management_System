
package My_Forms;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class AddBookForm extends javax.swing.JFrame {

        My_Classes.Member member = new My_Classes.Member();
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        My_Classes.Genre genre = new My_Classes.Genre();
        HashMap<String, Integer> genresMap = genre.getGenresMap();

        String imagePath = "";

        public AddBookForm() {
                initComponents();

                this.setLocationRelativeTo(null);

                Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211, 84, 0));
                jPanel1.setBorder(panelHeaderBorder);

                func.displayImage(90, 60, null, "/My_Images/book.png", jLabel_FormTitle);

                fillJcomboboxWithGenres();

                Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
                jLabel_Image.setBorder(JlabelImageBorder);

        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel_FormTitle = new javax.swing.JLabel();
                jLabel_CloseForm_ = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jTextField_ISBN = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jTextField_Name = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jTextField_Author = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jTextField_Publisher = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                jTextField_Price = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea_Description = new javax.swing.JTextArea();
                jLabel14 = new javax.swing.JLabel();
                jLabel_Image = new javax.swing.JLabel();
                jLabel_ImagePath = new javax.swing.JLabel();
                jButton_Select_Image_ = new javax.swing.JButton();
                jButton_Add_ = new javax.swing.JButton();
                jButton_Cancel_ = new javax.swing.JButton();
                jComboBox_Genre_ = new javax.swing.JComboBox<>();
                jSpinner_Quantity = new javax.swing.JSpinner();
                jButton_select_author_ = new javax.swing.JButton();
                jLabel_Author_ID = new javax.swing.JLabel();
                jLabel_Genre_ID = new javax.swing.JLabel();
                jButton_Clear_ = new javax.swing.JButton();
                jDateChooser_Date = new com.toedter.calendar.JDateChooser();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

                jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
                jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
                jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel_FormTitle.setText("Adaugare carte");
                jLabel_FormTitle.setOpaque(true);

                jLabel_CloseForm_.setBackground(new java.awt.Color(211, 84, 0));
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

                jLabel5.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel5.setText("ISBN:");

                jTextField_ISBN.setFont(new java.awt.Font("Verdana", 0, 14));

                jLabel6.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel6.setText("Titlu:");

                jTextField_Name.setFont(new java.awt.Font("Verdana", 0, 14));

                jLabel7.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel7.setText("Autor:");

                jTextField_Author.setFont(new java.awt.Font("Verdana", 0, 14));
                jTextField_Author.setEnabled(false);

                jLabel8.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel8.setText("Cantitate:");

                jLabel9.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel9.setText("Editura:");

                jTextField_Publisher.setFont(new java.awt.Font("Verdana", 0, 14));

                jLabel10.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel10.setText("Pret:");

                jTextField_Price.setFont(new java.awt.Font("Verdana", 0, 14));

                jLabel11.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel11.setText("Data adaugarii:");

                jLabel12.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel12.setText("Gen:");

                jLabel13.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel13.setText("Descriere:");

                jTextArea_Description.setColumns(20);
                jTextArea_Description.setRows(5);
                jScrollPane1.setViewportView(jTextArea_Description);

                jLabel14.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel14.setText("Coperta:");

                jLabel_Image.setBackground(new java.awt.Color(153, 204, 255));
                jLabel_Image.setOpaque(true);

                jLabel_ImagePath.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
                jLabel_ImagePath.setForeground(new java.awt.Color(0, 0, 204));
                jLabel_ImagePath.setText("");

                jButton_Select_Image_.setBackground(new java.awt.Color(0, 153, 102));
                jButton_Select_Image_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_Select_Image_.setForeground(new java.awt.Color(255, 255, 255));
                jButton_Select_Image_.setText("Selecteaza coperta");
                jButton_Select_Image_.setContentAreaFilled(false);
                jButton_Select_Image_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton_Select_Image_.setOpaque(true);
                jButton_Select_Image_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Select_Image_ActionPerformed(evt);
                        }
                });

                jButton_Add_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_Add_.setText("Adaugare");
                jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Add_ActionPerformed(evt);
                        }
                });

                jButton_Cancel_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_Cancel_.setText("Anulare");
                jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Cancel_ActionPerformed(evt);
                        }
                });

                jComboBox_Genre_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jComboBox_Genre_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox_Genre_ActionPerformed(evt);
                        }
                });

                jSpinner_Quantity.setFont(new java.awt.Font("Tahoma", 0, 14));

                jButton_select_author_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_select_author_.setText("Selectare autor");
                jButton_select_author_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_select_author_ActionPerformed(evt);
                        }
                });

                jLabel_Author_ID.setFont(new java.awt.Font("Verdana", 0, 14));

                jLabel_Genre_ID.setFont(new java.awt.Font("Verdana", 0, 14));

                jButton_Clear_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_Clear_.setText("Stergere date");
                jButton_Clear_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Clear_ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel_FormTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel_CloseForm_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel11)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jDateChooser_Date,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                155,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jSpinner_Quantity))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanel1Layout.createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel10)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                .addComponent(jTextField_Price,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                150,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                .addComponent(jLabel9)
                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                                .addComponent(jTextField_Publisher,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                150,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(9, 9, 9)
                                                                                                                                                                .addComponent(jLabel7))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(jTextField_Author,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                194,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                                .addGap(17, 17, 17)
                                                                                                                                                                                                .addComponent(jLabel12)
                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                                .addComponent(jComboBox_Genre_,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                193,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel_Genre_ID)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel_Author_ID,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                32,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(jButton_select_author_))))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(30, 30, 30)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addComponent(jLabel5))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jTextField_ISBN,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jTextField_Name,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                350,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                86, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                461,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel14)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton_Select_Image_,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                137,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel_Image,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                140,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_ImagePath,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                105,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(24, 24, 24))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton_Clear_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                220,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton_Add_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                220,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton_Cancel_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                220,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(164, 164, 164)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(148, 148, 148)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addComponent(jTextField_Name,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addComponent(jTextField_Author,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton_select_author_)
                                                                                                                .addComponent(jLabel_Author_ID))
                                                                                                .addGap(21, 21, 21)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel12)
                                                                                                                .addComponent(jComboBox_Genre_,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel_Genre_ID))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addComponent(jSpinner_Quantity,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(22, 22, 22)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel9)
                                                                                                                .addComponent(jTextField_Publisher,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addComponent(jTextField_Price,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel11)
                                                                                                                .addComponent(jDateChooser_Date,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jLabel_FormTitle,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                75,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel_CloseForm_,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(30, 30, 30)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(jLabel5)
                                                                                                                                .addComponent(jTextField_ISBN,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(jLabel13))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel14)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel_Image,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                125,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel_ImagePath))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton_Select_Image_)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                63, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton_Add_,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton_Cancel_,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton_Clear_,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(19, 19, 19)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }

        private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

                this.dispose();
        }

        private void jButton_Select_Image_ActionPerformed(java.awt.event.ActionEvent evt) {

                String path = func.selectImage();
                jLabel_ImagePath.setText(path);

                func.displayImage(140, 120, null, path, jLabel_Image);

                imagePath = path;

        }

        private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {

                My_Classes.Book book = new My_Classes.Book();
                String isbn = jTextField_ISBN.getText();

                if (!verif()) {
                        JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri sunt goale", "Date incomplete",
                                        2);
                } else if (book.isISBNexists(isbn)) {
                        JOptionPane.showMessageDialog(null, "Acest ISBN exista deja", "ISBN existent", 2);
                } else {
                        try {

                                String name = jTextField_Name.getText();
                                String publisher = jTextField_Publisher.getText();
                                String description = jTextArea_Description.getText();

                                Integer author_id = Integer.parseInt(jLabel_Author_ID.getText());
                                Integer genre_id = Integer.parseInt(jLabel_Genre_ID.getText());
                                Integer quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());

                                Double price = Double.parseDouble(jTextField_Price.getText());

                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String received_date = dateFormat.format(jDateChooser_Date.getDate());
                                Path path = Paths.get(imagePath);

                                byte[] img = Files.readAllBytes(path);
                                book.addBook(isbn, name, author_id, genre_id, quantity, publisher, price, received_date,
                                                description, img);

                        } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "Adaugati coperta!",
                                                "Coperta inexistenta", 2);
                        } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Date incorecte introduse!",
                                                "Date incorecte", 2);
                        } catch (NullPointerException ex) {
                                JOptionPane.showMessageDialog(null, "Selectati data corect!", "Data gresita", 2);
                        }
                }
        }

        private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {

                this.dispose();
        }

        private void jButton_select_author_ActionPerformed(java.awt.event.ActionEvent evt) {

                AuthorsListForm autorsForm = new AuthorsListForm();
                autorsForm.setVisible(true);
        }

        private void jComboBox_Genre_ActionPerformed(java.awt.event.ActionEvent evt) {

                try {
                        int genreId = genresMap.get(jComboBox_Genre_.getSelectedItem().toString());
                        jLabel_Genre_ID.setText(String.valueOf(genreId));
                        jLabel_Genre_ID.setVisible(false);
                } catch (Exception ex) {
                        System.out.println("Eroare de la jComboBox_Genre_ActionPerformed - " + ex.getMessage());
                }

        }

        private void jButton_Clear_ActionPerformed(java.awt.event.ActionEvent evt) {

                jTextField_ISBN.setText("");
                jTextField_Name.setText("");
                jTextField_Author.setText("");
                jLabel_Author_ID.setText("");
                jComboBox_Genre_.setSelectedIndex(0);
                jTextField_Price.setText("");
                jTextField_Publisher.setText("");
                jTextArea_Description.setText("");
                jSpinner_Quantity.setValue(0);
                jDateChooser_Date.setDate(new java.util.Date());
                jLabel_Image.setIcon(null);
                jLabel_ImagePath.setText("");
        }

        public static void displayAuthorData(int id, String fullName) {
                jTextField_Author.setText(fullName);
                jLabel_Author_ID.setText(String.valueOf(id));
        }

        public boolean verif() {
                if (jTextField_ISBN.getText().equals("") || jTextField_Author.getText().equals("") ||
                                jTextField_Price.getText().equals("") || jTextField_Name.getText().equals("") ||
                                jLabel_Genre_ID.getText().equals("")) {
                        return false;
                } else {
                        return true;
                }
        }

        public void fillJcomboboxWithGenres() {
                for (String genreName : genresMap.keySet()) {
                        jComboBox_Genre_.addItem(genreName);
                }
        }

        private javax.swing.JButton jButton_Add_;
        private javax.swing.JButton jButton_Cancel_;
        private javax.swing.JButton jButton_Clear_;
        private javax.swing.JButton jButton_Select_Image_;
        private javax.swing.JButton jButton_select_author_;
        private javax.swing.JComboBox<String> jComboBox_Genre_;
        private com.toedter.calendar.JDateChooser jDateChooser_Date;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private static javax.swing.JLabel jLabel_Author_ID;
        private javax.swing.JLabel jLabel_CloseForm_;
        private javax.swing.JLabel jLabel_FormTitle;
        private javax.swing.JLabel jLabel_Genre_ID;
        private javax.swing.JLabel jLabel_Image;
        private javax.swing.JLabel jLabel_ImagePath;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSpinner jSpinner_Quantity;
        private javax.swing.JTextArea jTextArea_Description;
        private static javax.swing.JTextField jTextField_Author;
        private javax.swing.JTextField jTextField_ISBN;
        private javax.swing.JTextField jTextField_Name;
        private javax.swing.JTextField jTextField_Price;
        private javax.swing.JTextField jTextField_Publisher;

}
