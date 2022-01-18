
package My_Forms;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class DeleteBookForm extends javax.swing.JFrame {

  
    My_Classes.Member member = new My_Classes.Member();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Genre genre = new My_Classes.Genre();
    HashMap<String, Integer> genresMap = genre.getGenresMap();

    String imagePath = "";

    public DeleteBookForm() {
        initComponents();

        
        this.setLocationRelativeTo(null);

        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211, 84, 0));
        jPanel1.setBorder(panelHeaderBorder);

        
        func.displayImage(90, 60, null, "/My_Images/book.png", jLabel_FormTitle);

    }

    
    @SuppressWarnings("unchecked")
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_Remove_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jSpinner_ID = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

        jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Stergere carte");
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

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); 
        jLabel5.setText("Introduceti ID-ul cartii");

        jButton_Remove_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton_Remove_.setText("Stergere");
        jButton_Remove_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton_Cancel_.setText("Anulare");
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jSpinner_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 393,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton_Remove_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner_ID)
                                                .addGap(48, 48, 48)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jSpinner_ID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Remove_, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        
        this.dispose();
    }

    private void jButton_Remove_ActionPerformed(java.awt.event.ActionEvent evt) {

        
        My_Classes.Book book = new My_Classes.Book();
        Integer id = (Integer) jSpinner_ID.getValue();

        try {
            
            int confirm = JOptionPane.showConfirmDialog(null, "Sunteti sigur ca doriti sa stergeti cartea?",
                    "Confirmare necesara", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                book.removeBook(id);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Eroare de stergere", 2);
        }

    }

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {
        
        this.dispose();
    }

    
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Remove_;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner_ID;
    
}
