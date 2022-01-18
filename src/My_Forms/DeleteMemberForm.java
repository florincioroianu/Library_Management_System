
package My_Forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class DeleteMemberForm extends javax.swing.JFrame {

        My_Classes.Member member = new My_Classes.Member();

        public DeleteMemberForm() {
                initComponents();

                this.setLocationRelativeTo(null);

                Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 152, 117));
                jPanel1.setBorder(panelHeaderBorder);

                My_Classes.Func_Class func = new My_Classes.Func_Class();
                func.displayImage(90, 60, null, "/My_Images/members.png", jLabel_FormTitle);

                jLabel_EmptyID_.setForeground(Color.white);

        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel_FormTitle = new javax.swing.JLabel();
                jLabel_CloseForm_ = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField_ID = new javax.swing.JTextField();
                jButton_Delete_ = new javax.swing.JButton();
                jLabel_EmptyID_ = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

                jLabel_FormTitle.setBackground(new java.awt.Color(1, 152, 117));
                jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
                jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel_FormTitle.setText("Stergere utilizator");
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
                jLabel2.setText("ID-ul utilizatorului");

                jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14));

                jButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_Delete_.setText("Stergere");
                jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_Delete_ActionPerformed(evt);
                        }
                });

                jLabel_EmptyID_.setFont(new java.awt.Font("Tahoma", 0, 12));
                jLabel_EmptyID_.setForeground(new java.awt.Color(253, 0, 0));
                jLabel_EmptyID_.setText("* introduceti ID-ul (in cifre)");
                jLabel_EmptyID_.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel_EmptyID_MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel_FormTitle,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                320,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel_CloseForm_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton_Delete_,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addContainerGap())
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jTextField_ID,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                275,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel_EmptyID_,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                245,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
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
                                                                .addGap(41, 41, 41)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField_ID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel_EmptyID_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                31,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton_Delete_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
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
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 245,
                                                                Short.MAX_VALUE));

                pack();
        }

        private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {

                try {
                        Integer id = Integer.parseInt(jTextField_ID.getText());

                        int confirm = JOptionPane.showConfirmDialog(null,
                                        "Sigur doriti sa stergeti acest administrator?",
                                        "Confirmare necesara", JOptionPane.YES_NO_OPTION);

                        if (confirm == JOptionPane.YES_OPTION) {
                                member.removeMember(id);

                                jTextField_ID.setText("");

                                jLabel_EmptyID_.setForeground(Color.white);
                        }

                } catch (Exception e) {
                        jLabel_EmptyID_.setForeground(Color.red);
                }

        }

        private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

                this.dispose();

        }

        private void jLabel_EmptyID_MouseClicked(java.awt.event.MouseEvent evt) {

                jLabel_EmptyID_.setForeground(Color.white);
        }

        private javax.swing.JButton jButton_Delete_;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel_CloseForm_;
        private javax.swing.JLabel jLabel_EmptyID_;
        private javax.swing.JLabel jLabel_FormTitle;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField jTextField_ID;

}
