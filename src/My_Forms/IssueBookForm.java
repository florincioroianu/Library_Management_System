
package My_Forms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class IssueBookForm extends javax.swing.JFrame {

    My_Classes.Member member = new My_Classes.Member();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Book book = new My_Classes.Book();
    My_Classes.Issue_Book issue = new My_Classes.Issue_Book();

    boolean book_Exist = false;
    boolean member_Exist = false;

    public IssueBookForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(108, 122, 137));
        jPanel1.setBorder(panelHeaderBorder);

        func.displayImage(90, 60, null, "/My_Images/organizer.png", jLabel_FormTitle);

        setBorderToJlabel(jLabel_BookName_, Color.white);
        setBorderToJlabel(jLabel_MemberFullName_, Color.white);

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_Issue_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jDateChooser_IssueDate = new com.toedter.calendar.JDateChooser();
        jButton_search_book_ = new javax.swing.JButton();
        jLabel_BookName_ = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_MemberFullName_ = new javax.swing.JLabel();
        jButton_search_member_ = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Available = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_BookId = new javax.swing.JSpinner();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

        jLabel_FormTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Imprumutare carte");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(108, 122, 137));
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
        jLabel5.setText("ID carte:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel11.setText("Data imprumutului:");

        jButton_Issue_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Issue_.setText("Imprumutare");
        jButton_Issue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Issue_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Cancel_.setText("Anulare");
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jButton_search_book_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_search_book_.setText(" Cautare carte");
        jButton_search_book_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_book_ActionPerformed(evt);
            }
        });

        jLabel_BookName_.setFont(new java.awt.Font("SansSerif", 0, 12));
        jLabel_BookName_.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_BookName_.setText("Titlu:");
        jLabel_BookName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel7.setText("ID utilizator:");

        jLabel_MemberFullName_.setFont(new java.awt.Font("SansSerif", 0, 12));
        jLabel_MemberFullName_.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_MemberFullName_.setText("Nume utilizator:");
        jLabel_MemberFullName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MemberFullName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseExited(evt);
            }
        });

        jButton_search_member_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_search_member_.setText("Cautare utilizator");
        jButton_search_member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_member_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel8.setText("Disponibilitate:");

        jLabel_Available.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel_Available.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_Available.setText("Da/Nu");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel12.setText("Data returnarii:");

        jSpinner_BookId.setFont(new java.awt.Font("Tahoma", 0, 14));

        jSpinner_MemberID.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel13.setText("Note:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_Available))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel_BookName_)
                                                        .addComponent(jLabel_MemberFullName_)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jSpinner_BookId,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                150,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jSpinner_MemberID,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                144,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton_search_member_)
                                                                        .addComponent(jButton_search_book_,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton_Issue_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 75,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jButton_search_book_)
                                        .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_BookName_)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(jButton_search_member_))
                                        .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_MemberFullName_)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel_Available))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_Issue_, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE));

        pack();
    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        this.dispose();
    }

    private void jButton_Issue_ActionPerformed(java.awt.event.ActionEvent evt) {

        int _book_id = (int) jSpinner_BookId.getValue();
        int _member_id = (int) jSpinner_MemberID.getValue();
        String _note = jTextArea1.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());
            String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());

            Date issDate = dateFormat.parse(_issue_date);
            Date rtnDate = dateFormat.parse(_return_date);

            if (!book_Exist) {
                JOptionPane.showMessageDialog(null, "Verificati mai intai existenta cartii", " ", 2);
            } else if (!member_Exist) {
                JOptionPane.showMessageDialog(null, "Verificati mai intai existenta utilizatorului",
                        "Check If The Member Exist", 2);
            }

            else if (!issue.checkBookAvailability(_book_id)) {
                JOptionPane.showMessageDialog(null, "Cartea nu este disponibila momentan", "Carte indisponibila", 2);
            }

            else if (rtnDate.before(issDate)) {
                JOptionPane.showMessageDialog(null, "Data returnarii trebuie sa fie dupa data imprumutului",
                        "Data returnare invalida",
                        2);
            } else {
                issue.addIssue(_book_id, _member_id, "Imprumutat", _issue_date, _return_date, _note);

                jSpinner_BookId.setValue(0);
                jSpinner_MemberID.setValue(0);
                jLabel_BookName_.setText("Titlu");
                jLabel_MemberFullName_.setText("Nume complet utilizator");
                jLabel_Available.setText("Da/Nu");
                jLabel_Available.setForeground(new Color(51, 102, 255));
                jDateChooser_IssueDate.setDate(new Date());
                jDateChooser_Return_Date.setDate(new Date());
                book_Exist = false;
                member_Exist = false;
            }
        } catch (HeadlessException | NullPointerException | ParseException ex) {
            JOptionPane.showMessageDialog(null, "Alegeti data imprumutului si returnarii", "Selectati data", 2);
        }

    }

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
    }

    private void jButton_search_book_ActionPerformed(java.awt.event.ActionEvent evt) {

        int book_id = (int) jSpinner_BookId.getValue();

        try {

            My_Classes.Book selectedBook = book.getBookById(book_id);

            if (selectedBook != null) {

                jLabel_BookName_.setText(selectedBook.getName());

                book_Exist = true;

                if (issue.checkBookAvailability(book_id)) {
                    jLabel_Available.setText("Da");
                    jLabel_Available.setForeground(Color.green);
                } else {
                    jLabel_Available.setText("Nu");
                    jLabel_Available.setForeground(Color.red);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Cartea nu exista", "", 2);
                jLabel_BookName_.setText("Titlu");
                book_Exist = false;
                jLabel_Available.setText("Da/Nu");
                jLabel_Available.setForeground(new Color(51, 102, 255));
            }

        } catch (SQLException ex) {
            Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jButton_search_member_ActionPerformed(java.awt.event.ActionEvent evt) {

        int member_id = (int) jSpinner_MemberID.getValue();

        try {

            My_Classes.Member selectedMember = member.getMemberById(member_id);

            if (selectedMember != null) {

                jLabel_MemberFullName_.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());

                member_Exist = true;
            } else {
                JOptionPane.showMessageDialog(null, "Acest utilizator nu exista", "Utilizator inexistent", 2);
                jLabel_MemberFullName_.setText("Nume:");
                member_Exist = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jLabel_BookName_MouseClicked(java.awt.event.MouseEvent evt) {

        int book_id = (int) jSpinner_BookId.getValue();
        BookInfoCardForm bookCardF = new BookInfoCardForm(book_id);
        bookCardF.setVisible(true);
    }

    private void jLabel_MemberFullName_MouseClicked(java.awt.event.MouseEvent evt) {

        int member_id = (int) jSpinner_MemberID.getValue();
        MemberInfoCardForm memberCardF = new MemberInfoCardForm(member_id);
        memberCardF.setVisible(true);
    }

    private void jLabel_BookName_MouseEntered(java.awt.event.MouseEvent evt) {

        setBorderToJlabel(jLabel_BookName_, new Color(51, 102, 255));
    }

    private void jLabel_BookName_MouseExited(java.awt.event.MouseEvent evt) {

        setBorderToJlabel(jLabel_BookName_, Color.white);
    }

    private void jLabel_MemberFullName_MouseEntered(java.awt.event.MouseEvent evt) {

        setBorderToJlabel(jLabel_MemberFullName_, new Color(51, 102, 255));
    }

    private void jLabel_MemberFullName_MouseExited(java.awt.event.MouseEvent evt) {

        setBorderToJlabel(jLabel_MemberFullName_, Color.white);
    }

    public void setBorderToJlabel(JLabel label, Color color) {
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(border);
    }

    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Issue_;
    private javax.swing.JButton jButton_search_book_;
    private javax.swing.JButton jButton_search_member_;
    private com.toedter.calendar.JDateChooser jDateChooser_IssueDate;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Available;
    private javax.swing.JLabel jLabel_BookName_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_BookId;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTextArea jTextArea1;

}
