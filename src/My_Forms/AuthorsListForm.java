
package My_Forms;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class AuthorsListForm extends javax.swing.JFrame {

   
    My_Classes.Author author = new My_Classes.Author();
    public String formType = "";

    public AuthorsListForm() {
        initComponents();

        
        this.setLocationRelativeTo(null);

        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 67));
        jPanel1.setBorder(panelHeaderBorder);

        
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60, null, "/My_Images/notepad.png", jLabel_FormTitle);

        
        func.customTable(jTable_Authors_);

        
        func.customTableHeader(jTable_Authors_, new Color(34, 167, 240), 16);

        
        populateJtableWithAuthors();

    }

    
    @SuppressWarnings("unchecked")
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors_ = new javax.swing.JTable();
        jButton_Select_Author_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Lista autori");
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

        jButton_Select_Author_.setFont(new java.awt.Font("Verdana", 0, 16)); 
        jButton_Select_Author_.setText("Selectare autor");
        jButton_Select_Author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_Author_ActionPerformed(evt);
            }
        });

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
                                        .addComponent(jButton_Select_Author_, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516,
                                                Short.MAX_VALUE))
                                .addContainerGap(19, Short.MAX_VALUE)));
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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Select_Author_, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE)));

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

    private void jTable_Authors_MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        
        this.dispose();

    }

    private void jButton_Select_Author_ActionPerformed(java.awt.event.ActionEvent evt) {

        

        
        int index = jTable_Authors_.getSelectedRow();

        
        int id = Integer.parseInt(jTable_Authors_.getValueAt(index, 0).toString());
        String firstName = jTable_Authors_.getValueAt(index, 1).toString();
        String lastName = jTable_Authors_.getValueAt(index, 2).toString();

        String full_name = firstName + " " + lastName;

        if (formType.equals("edit"))
            EditBookForm.displayAuthorData(id, full_name);

        else
            AddBookForm.displayAuthorData(id, full_name);

        
        this.dispose();

    }

    
    public void populateJtableWithAuthors() {
        ArrayList<My_Classes.Author> authorsList = author.authorsList();

        
        String[] colNames = { "ID", "Nume", "Nume familie", "Tip", "Despre" };

        
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

    
    private javax.swing.JButton jButton_Select_Author_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Authors_;
    
}
