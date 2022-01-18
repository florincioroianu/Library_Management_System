
package My_Forms;

import My_Classes.Member;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class MembersListForm extends javax.swing.JFrame {

        My_Classes.Member member = new My_Classes.Member();
        My_Classes.Func_Class func = new My_Classes.Func_Class();

        public MembersListForm() {
                initComponents();

                
                this.setLocationRelativeTo(null);

                
                Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 152, 117));
                jPanel1.setBorder(panelHeaderBorder);

                
                func.displayImage(90, 60, null, "/My_Images/members.png", jLabel_FormTitle);

                
                func.customTable(jTable_Members_);

                
                func.customTableHeader(jTable_Members_, new Color(36, 37, 42), 16);

                

                
                populateJtableWithMembers("");
        }

       
        @SuppressWarnings("unchecked")
        
        
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel_FormTitle = new javax.swing.JLabel();
                jLabel_CloseForm_ = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField_Search = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable_Members_ = new javax.swing.JTable();
                jButton_Search_ = new javax.swing.JButton();
                jLabel_Image = new javax.swing.JLabel();
                jLabel_FullName = new javax.swing.JLabel();
                jLabel_Phone = new javax.swing.JLabel();
                jLabel_Email = new javax.swing.JLabel();
                jLabel_Gender = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

                jLabel_FormTitle.setBackground(new java.awt.Color(1, 152, 117));
                jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); 
                jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel_FormTitle.setText("Lista utilizatori");
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
                jLabel2.setText("Date de cautare:");

                jTextField_Search.setFont(new java.awt.Font("Verdana", 0, 14)); 

                jTable_Members_.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {

                                }));
                jTable_Members_.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable_Members_MouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(jTable_Members_);

                jButton_Search_.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                jButton_Search_.setText("Cautare");
                jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Search_ActionPerformed(evt);
                        }
                });

                jLabel_Image.setBackground(new java.awt.Color(255, 255, 255));
                jLabel_Image.setOpaque(true);

                jLabel_FullName.setFont(new java.awt.Font("Verdana", 0, 14)); 
                jLabel_FullName.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Phone.setFont(new java.awt.Font("Verdana", 0, 14)); 
                jLabel_Phone.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Email.setFont(new java.awt.Font("Verdana", 0, 14)); 
                jLabel_Email.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Gender.setFont(new java.awt.Font("Verdana", 0, 14)); 
                jLabel_Gender.setForeground(new java.awt.Color(0, 51, 153));

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
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                750,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel_Image,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                130,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel_FullName)
                                                                                                                .addComponent(jLabel_Phone)
                                                                                                                .addComponent(jLabel_Email)
                                                                                                                .addComponent(jLabel_Gender)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jTextField_Search,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                275,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton_Search_,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                268,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 100, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
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
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField_Search,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton_Search_))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                370,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel_Image,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                96,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel_FullName)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Phone)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Email)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Gender)))
                                                                .addGap(57, 57, 57)));

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

        private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {
                
                String value = jTextField_Search.getText();
                
                String query = "SELECT * FROM `members` WHERE `firstName` LIKE'%" + value + "%' or `lastName` LIKE '%"
                                + value
                                + "%'";
                populateJtableWithMembers(query);
        }

        private void jTable_Members_MouseClicked(java.awt.event.MouseEvent evt) {
                
                Member SelectedMember;
                try {

                        Integer rowIndex = jTable_Members_.getSelectedRow(); 
                        
                        Integer id = Integer.parseInt(jTable_Members_.getModel().getValueAt(rowIndex, 0).toString());

                        SelectedMember = member.getMemberById(id);

                        if (SelectedMember != null) {
                                jLabel_FullName
                                                .setText("Nume:" + SelectedMember.getFirstName() + " "
                                                                + SelectedMember.getLastName());
                                jLabel_Phone.setText("Telefon:" + SelectedMember.getPhone());
                                jLabel_Email.setText("Email:" + SelectedMember.getEmail());
                                jLabel_Gender.setText("Gen:" + SelectedMember.getGender());

                                
                                byte[] image = SelectedMember.getPicture();
                                
                                
                                Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1,
                                                new Color(0, 0, 0));
                                jLabel_Image.setBorder(JlabelImageBorder);

                                
                                func.displayImage(125, 80, null, "/My_Images/blank-profile.png", jLabel_Image);
                                func.displayImage(125, 80, image, "", jLabel_Image);
                        } else {
                                JOptionPane.showMessageDialog(null, "Niciun administrator gasit cu acest ID",
                                                "ID invalid", 3);
                        }

                } catch (SQLException | NumberFormatException ex) {
                        
                        JOptionPane.showMessageDialog(null, "Introduceti un ID de administrator valid", "ID invalid",
                                        3);
                }
        }

        
        public void populateJtableWithMembers(String query) {

                ArrayList<My_Classes.Member> membersList = member.membersList(query);

                
                String[] colNames = { "ID", "Nume", "Nume de familie", "Telefon", "Email", "Gen" };

                
                Object[][] rows = new Object[membersList.size()][colNames.length];

                for (int i = 0; i < membersList.size(); i++) {
                        rows[i][0] = membersList.get(i).getId();
                        rows[i][1] = membersList.get(i).getFirstName();
                        rows[i][2] = membersList.get(i).getLastName();
                        rows[i][3] = membersList.get(i).getPhone();
                        rows[i][4] = membersList.get(i).getEmail();
                        rows[i][5] = membersList.get(i).getGender();
                }

                DefaultTableModel model = new DefaultTableModel(rows, colNames);
                jTable_Members_.setModel(model);

        }

        
        private javax.swing.JButton jButton_Search_;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel_CloseForm_;
        private javax.swing.JLabel jLabel_Email;
        private javax.swing.JLabel jLabel_FormTitle;
        private javax.swing.JLabel jLabel_FullName;
        private javax.swing.JLabel jLabel_Gender;
        private javax.swing.JLabel jLabel_Image;
        private javax.swing.JLabel jLabel_Phone;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable_Members_;
        private javax.swing.JTextField jTextField_Search;
        
}
