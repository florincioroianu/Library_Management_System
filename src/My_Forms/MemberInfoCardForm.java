
package My_Forms;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MemberInfoCardForm extends javax.swing.JFrame {

        My_Classes.Member member = new My_Classes.Member();
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        My_Classes.Author author = new My_Classes.Author();
        My_Classes.Genre genre = new My_Classes.Genre();

        public MemberInfoCardForm(int member_id) {
                initComponents();

                this.setLocationRelativeTo(null);

                Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 152, 117));
                jPanel1.setBorder(panelHeaderBorder);

                func.displayImage(90, 60, null, "/My_Images/members.png", jLabel_FormTitle);

                Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
                jLabel_Image.setBorder(JlabelImageBorder);

                func.displayImage(140, 150, null, "/My_Images/blank-profile.png", jLabel_Image);

                displayMemberInfo(member_id);

        }

        public void displayMemberInfo(int _member_id) {
                try {

                        My_Classes.Member SelectedMember = member.getMemberById(_member_id);

                        if (SelectedMember != null) {
                                jLabel_ID.setText("ID: " + String.valueOf(SelectedMember.getId()));
                                jLabel_FullName.setText("Nume: " + SelectedMember.getFirstName() + " "
                                                + SelectedMember.getLastName());
                                jLabel_Email.setText("Email: " + SelectedMember.getEmail());
                                jLabel_Phone.setText("Telefon: " + SelectedMember.getPhone());
                                jLabel_Gender.setText("Sex: " + SelectedMember.getGender());

                                byte[] image = SelectedMember.getPicture();

                                func.displayImage(145, 150, image, "", jLabel_Image);
                        }

                } catch (SQLException ex) {
                        Logger.getLogger(MemberInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel_FormTitle = new javax.swing.JLabel();
                jLabel_CloseForm_ = new javax.swing.JLabel();
                jLabel_Image = new javax.swing.JLabel();
                jLabel_ID = new javax.swing.JLabel();
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
                jLabel_FormTitle.setText("Informatii utilizator");
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

                jLabel_Image.setBackground(new java.awt.Color(204, 255, 204));
                jLabel_Image.setOpaque(true);

                jLabel_ID.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_ID.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_ID.setText("ID");

                jLabel_FullName.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_FullName.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_FullName.setText("Nume:");

                jLabel_Phone.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Phone.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Phone.setText("Telefon:");

                jLabel_Email.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Email.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Email.setText("Email:");

                jLabel_Gender.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Gender.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Gender.setText("Gen:");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel_FormTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                349,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel_CloseForm_,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel_Image,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                150,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel_FullName,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel_ID)
                                                                                                                .addComponent(jLabel_Phone)
                                                                                                                .addComponent(jLabel_Email)
                                                                                                                .addComponent(jLabel_Gender))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
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
                                                                .addGap(38, 38, 38)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel_ID)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_FullName)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Phone)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Email)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Gender))
                                                                                .addComponent(jLabel_Image,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                144,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(41, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }

        private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

                this.dispose();
        }

        private javax.swing.JLabel jLabel_CloseForm_;
        private javax.swing.JLabel jLabel_Email;
        private javax.swing.JLabel jLabel_FormTitle;
        private javax.swing.JLabel jLabel_FullName;
        private javax.swing.JLabel jLabel_Gender;
        private javax.swing.JLabel jLabel_ID;
        private javax.swing.JLabel jLabel_Image;
        private javax.swing.JLabel jLabel_Phone;
        private javax.swing.JPanel jPanel1;

}
