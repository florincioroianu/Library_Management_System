
package My_Forms;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class ManageAuthorsForm extends javax.swing.JFrame {

    

    My_Classes.Author author = new My_Classes.Author();

    public ManageAuthorsForm() {
        initComponents();

        
        this.setLocationRelativeTo(null);

        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 67));
        jPanel1.setBorder(panelHeaderBorder);

        
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60, null, "/My_Images/notepad.png", jLabel_FormTitle);

        
        func.customTable(jTable_Authors_);

        
        func.customTableHeader(jTable_Authors_, new Color(34, 167, 240), 16);

        
        jLabel_EmptyFirstName_.setVisible(false);
        jLabel_EmptyLastName_.setVisible(false);

        
        populateJtableWithAuthors();

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
        jTable_Authors_ = new javax.swing.JTable();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Expertise = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_About = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Administrare autori");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(1, 50, 67));
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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel2.setText("Nume:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14));
        jTextField_ID.setEditable(false);

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
        jButton_Delete_.setText("Stergere");
        jButton_Delete_.setPreferredSize(new java.awt.Dimension(120, 25));
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_Authors_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jTable_Authors_.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        jTable_Authors_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Authors_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Authors_);

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
        jLabel4.setText("Tip:");

        jTextField_Expertise.setFont(new java.awt.Font("Verdana", 0, 14)); 

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel5.setText("Despre:");

        jTextArea_About.setColumns(20);
        jTextArea_About.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jTextArea_About.setRows(5);
        jScrollPane2.setViewportView(jTextArea_About);

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
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField_ID,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Expertise))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28,
                                        Short.MAX_VALUE)
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
                                                .addComponent(jScrollPane1)
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
                                                .addGap(26, 26, 26)
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
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_Expertise,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38,
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

        
        jLabel_EmptyFirstName_.setVisible(false);

    }

    private void jTable_Authors_MouseClicked(java.awt.event.MouseEvent evt) {

        

        
        int index = jTable_Authors_.getSelectedRow();

        
        String id = jTable_Authors_.getValueAt(index, 0).toString();
        String firstName = jTable_Authors_.getValueAt(index, 1).toString();
        String lastName = jTable_Authors_.getValueAt(index, 2).toString();
        String expertise = jTable_Authors_.getValueAt(index, 3).toString();
        String about = jTable_Authors_.getValueAt(index, 4).toString();

        
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_Expertise.setText(expertise);
        jTextArea_About.setText(about);

    }

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        try {
            int id = Integer.parseInt(jTextField_ID.getText());

            
            int confirm = JOptionPane.showConfirmDialog(null, "Esti sigur ca stergi acest autor??",
                    "Confirmare", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                author.removeAuthor(id);
            }

            
            populateJtableWithAuthors();

            
            jLabel_EmptyLastName_.setVisible(false);
            jLabel_EmptyFirstName_.setVisible(false);

            
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Expertise.setText("");
            jTextArea_About.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID invalid - " + ex.getMessage(), "Eroare", 0);
        }

    }

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_About.getText();

        
        if (fname.trim().isEmpty()) {
            jLabel_EmptyFirstName_.setVisible(true);
        } else if (lname.trim().isEmpty()) {
            jLabel_EmptyLastName_.setVisible(true);
        } else 
        {
            try {
                int id = Integer.parseInt(jTextField_ID.getText());
                author.editAuthor(id, fname, lname, expertise, about);

                
                populateJtableWithAuthors();

                
                jLabel_EmptyLastName_.setVisible(false);
                jLabel_EmptyFirstName_.setVisible(false);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID invalid - " + ex.getMessage(), "Eroare", 0);
            }

        }

    }

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_About.getText();

        
        if (fname.trim().isEmpty()) {
            jLabel_EmptyFirstName_.setVisible(true);
        } else if (lname.trim().isEmpty()) {
            jLabel_EmptyLastName_.setVisible(true);
        } else 
        {
            author.addAuthor(fname, lname, expertise, about);

            
            populateJtableWithAuthors();

            
            jLabel_EmptyLastName_.setVisible(false);
            jLabel_EmptyFirstName_.setVisible(false);

        }

    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        
        this.dispose();

    }

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {

        jLabel_EmptyLastName_.setVisible(false);

    }

    
    public void populateJtableWithAuthors() {
        ArrayList<My_Classes.Author> authorsList = author.authorsList();

        
        String[] colNames = { "ID", "Nume", "Nume de familie", "Tip", "Despre" };

        
        Object[][] rows = new Object[authorsList.size()][colNames.length];

        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getFirstName();
            rows[i][2] = authorsList.get(i).getLastName();
            rows[i][3] = authorsList.get(i).getField_Of_Expertise();
            rows[i][4] = authorsList.get(i).getAbout();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Authors_.setModel(model);

    }

    
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Authors_;
    private javax.swing.JTextArea jTextArea_About;
    private javax.swing.JTextField jTextField_Expertise;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    
}
