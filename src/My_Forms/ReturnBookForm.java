
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ReturnBookForm extends javax.swing.JFrame {

    My_Classes.Member member = new My_Classes.Member();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Book book = new My_Classes.Book();
    My_Classes.Issue_Book issue = new My_Classes.Issue_Book();

    boolean book_Exist = false;
    boolean member_Exist = false;

    public ReturnBookForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(108, 122, 137));
        jPanel1.setBorder(panelHeaderBorder);

        func.displayImage(90, 60, null, "/My_Images/organizer.png", jLabel_FormTitle);

        setBorderToJlabel(jLabel_BookName_, Color.white);
        setBorderToJlabel(jLabel_MemberFullName_, Color.white);

        func.customTable(jTable_IssuedBooks_);

        func.customTableHeader(jTable_IssuedBooks_, new Color(34, 167, 240), 15);

        populateJtableWithIssuedBooks("");
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_Retutn_ = new javax.swing.JButton();
        jDateChooser_IssueDate = new com.toedter.calendar.JDateChooser();
        jLabel_BookName_ = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_MemberFullName_ = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_BookId = new javax.swing.JSpinner();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_IssuedBooks_ = new javax.swing.JTable();
        jButton_Lost_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_Status_ = new javax.swing.JComboBox<>();
        jButton_Delete_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

        jLabel_FormTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("  Returnare carti");
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

        jButton_Retutn_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Retutn_.setText("Returnare");
        jButton_Retutn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Retutn_ActionPerformed(evt);
            }
        });

        jDateChooser_IssueDate.setEnabled(false);

        jLabel_BookName_.setFont(new java.awt.Font("SansSerif", 0, 12));
        jLabel_BookName_.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_BookName_.setText("Titlu");
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
        jLabel_MemberFullName_.setText("Nume:");
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

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel12.setText("Data returnarii:");

        jSpinner_BookId.setFont(new java.awt.Font("Tahoma", 0, 14));
        jSpinner_BookId.setEnabled(false);

        jSpinner_MemberID.setFont(new java.awt.Font("Tahoma", 0, 14));
        jSpinner_MemberID.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel13.setText("Note:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        jTable_IssuedBooks_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jTable_IssuedBooks_.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        jTable_IssuedBooks_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_IssuedBooks_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_IssuedBooks_);

        jButton_Lost_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Lost_.setText("Carte pierduta");
        jButton_Lost_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lost_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14));
        jLabel6.setText("Status carte:");

        jComboBox_Status_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jComboBox_Status_.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Toate", "Imprumutat", "Returnat", "Pierdut" }));
        jComboBox_Status_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Status_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Delete_.setText("Stergere");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
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
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_BookName_)
                                                        .addComponent(jLabel_MemberFullName_)
                                                        .addComponent(jSpinner_BookId,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner_MemberID,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton_Retutn_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(jButton_Lost_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(jDateChooser_Return_Date,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jDateChooser_IssueDate,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox_Status_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        175, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jSpinner_BookId,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_BookName_)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jSpinner_MemberID,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel_MemberFullName_)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jDateChooser_IssueDate,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jDateChooser_Return_Date,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton_Retutn_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton_Lost_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jComboBox_Status_,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

        this.dispose();
    }

    private void jButton_Retutn_ActionPerformed(java.awt.event.ActionEvent evt) {

        int _book_id = (int) jSpinner_BookId.getValue();
        int _member_id = (int) jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());
            Date rtnDate = dateFormat.parse(_return_date);

            String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());
            Date issDate = dateFormat.parse(_issue_date);

            if (rtnDate.before(issDate)) {
                JOptionPane.showMessageDialog(null, "Data returnarii trebuie sa fie dupa data imprumutului!",
                        "Data retrunare gresita",
                        2);
            } else {
                issue.updateIssue(_book_id, _member_id, "Returnat", _issue_date, _return_date, _note);

                jSpinner_BookId.setValue(0);
                jSpinner_MemberID.setValue(0);
                jLabel_BookName_.setText("Titlu");
                jLabel_MemberFullName_.setText("Nume utilizator");
                jDateChooser_IssueDate.setDate(new Date());
                jDateChooser_Return_Date.setDate(new Date());
                jTextArea_Note.setText("");
            }
        } catch (HeadlessException | NullPointerException | ParseException ex) {
            JOptionPane.showMessageDialog(null, "Selectati o carte", "Selectati cartea", 2);
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

    private void jTable_IssuedBooks_MouseClicked(java.awt.event.MouseEvent evt) {

        int index = jTable_IssuedBooks_.getSelectedRow();

        int book_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 0).toString());
        int member_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 1).toString());

        My_Classes.Book selectedBook;
        My_Classes.Member selectedMember;

        try {

            selectedBook = book.getBookById(book_id);

            jSpinner_BookId.setValue(selectedBook.getId());
            jLabel_BookName_.setText(selectedBook.getName());

            selectedMember = member.getMemberById(member_id);

            jSpinner_MemberID.setValue(selectedMember.getId());
            jLabel_MemberFullName_.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());

            String issued_date = jTable_IssuedBooks_.getValueAt(index, 3).toString();
            String return_date = jTable_IssuedBooks_.getValueAt(index, 4).toString();

            String note = jTable_IssuedBooks_.getValueAt(index, 5).toString();

            Date issDate = new SimpleDateFormat("yyyy-MM-dd").parse(issued_date);
            jDateChooser_IssueDate.setDate(issDate);

            Date rtnDate = new SimpleDateFormat("yyyy-MM-dd").parse(return_date);
            jDateChooser_Return_Date.setDate(rtnDate);

            jTextArea_Note.setText(note);

        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jButton_Lost_ActionPerformed(java.awt.event.ActionEvent evt) {

        int _book_id = (int) jSpinner_BookId.getValue();
        int _member_id = (int) jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());

            String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());

            issue.updateIssue(_book_id, _member_id, "Pierdut", _issue_date, _return_date, _note);

            int quantity = new My_Classes.Book().getBookById(_book_id).getQuantity();
            book.setQuantity_Minus_One(_book_id, quantity - 1);

            jSpinner_BookId.setValue(0);
            jSpinner_MemberID.setValue(0);
            jLabel_BookName_.setText("Titlu");
            jLabel_MemberFullName_.setText("Nume utilizator");
            jDateChooser_IssueDate.setDate(new Date());
            jDateChooser_Return_Date.setDate(new Date());
            jTextArea_Note.setText("");
        } catch (HeadlessException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Selectati o carte", "Selectati cartea", 2);
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jComboBox_Status_ActionPerformed(java.awt.event.ActionEvent evt) {

        String status = jComboBox_Status_.getSelectedItem().toString();
        if (status.equals("Toate")) {
            status = "";
        }
        populateJtableWithIssuedBooks(status);
    }

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {

        int index = jTable_IssuedBooks_.getSelectedRow();

        try {

            int _book_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 0).toString());
            int _member_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 1).toString());
            String _issued_date = jTable_IssuedBooks_.getValueAt(index, 3).toString();

            issue.removeFromIssuedTable(_book_id, _member_id, _issued_date);

            jSpinner_BookId.setValue(0);
            jSpinner_MemberID.setValue(0);
            jLabel_BookName_.setText("Titlu");
            jLabel_MemberFullName_.setText("Nume utilizator");
            jDateChooser_IssueDate.setDate(new Date());
            jDateChooser_Return_Date.setDate(new Date());
            jTextArea_Note.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Selectati elementul pe care doriti sa il stergeti" + ex.getMessage(), "Eroare stergere", 2);
        }

    }

    public void setBorderToJlabel(JLabel label, Color color) {
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(border);
    }

    public void populateJtableWithIssuedBooks(String _status) {
        ArrayList<My_Classes.Issue_Book> issBooksList = issue.issuedBooksList(_status);

        String[] colNames = { "Titlu", "Utilizator", "Status", "Data imprumut", "Data retur", "Note" };

        Object[][] rows = new Object[issBooksList.size()][colNames.length];

        for (int i = 0; i < issBooksList.size(); i++) {
            rows[i][0] = issBooksList.get(i).getBook_id();
            rows[i][1] = issBooksList.get(i).getMember_id();
            rows[i][2] = issBooksList.get(i).getStatus();
            rows[i][3] = issBooksList.get(i).getIssue_date();
            rows[i][4] = issBooksList.get(i).getReturn_date();
            rows[i][5] = issBooksList.get(i).getNote();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_IssuedBooks_.setModel(model);

    }

    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Lost_;
    private javax.swing.JButton jButton_Retutn_;
    private javax.swing.JComboBox<String> jComboBox_Status_;
    private com.toedter.calendar.JDateChooser jDateChooser_IssueDate;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_BookName_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_BookId;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTable jTable_IssuedBooks_;
    private javax.swing.JTextArea jTextArea_Note;

}
