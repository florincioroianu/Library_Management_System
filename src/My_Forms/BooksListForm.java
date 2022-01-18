
package My_Forms;

import My_Classes.Member;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class BooksListForm extends javax.swing.JFrame {

        My_Classes.Book book = new My_Classes.Book();
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        My_Classes.Author author = new My_Classes.Author();
        My_Classes.Genre genre = new My_Classes.Genre();

        public BooksListForm() {
                initComponents();

                this.setLocationRelativeTo(null);

                Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211, 84, 0));
                jPanel1.setBorder(panelHeaderBorder);

                func.displayImage(90, 60, null, "/My_Images/book.png", jLabel_FormTitle);

                func.customTable(jTable_Books_);

                func.customTableHeader(jTable_Books_, new Color(36, 37, 42), 16);

                populateJtableWithBooks("");
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel_FormTitle = new javax.swing.JLabel();
                jLabel_CloseForm_ = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable_Books_ = new javax.swing.JTable();
                jLabel_Image = new javax.swing.JLabel();
                jLabel_ISBN = new javax.swing.JLabel();
                jLabel_Name = new javax.swing.JLabel();
                jLabel_Author = new javax.swing.JLabel();
                jLabel_Genre = new javax.swing.JLabel();
                jLabel_Price = new javax.swing.JLabel();
                jLabel_Publisher = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jTextField_Search = new javax.swing.JTextField();
                jButton_SearchByNameOrDescription_ = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jButton_SearchBetweenTwoDates_ = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                jLabel5 = new javax.swing.JLabel();
                jDateChooser2 = new com.toedter.calendar.JDateChooser();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

                jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
                jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
                jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel_FormTitle.setText("Lista carti");
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

                jTable_Books_.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {

                                }));
                jTable_Books_.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable_Books_MouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(jTable_Books_);

                jLabel_Image.setBackground(new java.awt.Color(255, 255, 255));
                jLabel_Image.setEnabled(false);
                jLabel_Image.setOpaque(true);

                jLabel_ISBN.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_ISBN.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Name.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Author.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Author.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Genre.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Genre.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Price.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Price.setForeground(new java.awt.Color(0, 51, 153));

                jLabel_Publisher.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Publisher.setForeground(new java.awt.Color(0, 51, 153));

                jLabel2.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel2.setText("Introduceti datele");

                jTextField_Search.setFont(new java.awt.Font("Verdana", 0, 14));

                jButton_SearchByNameOrDescription_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_SearchByNameOrDescription_.setText("Cautare");
                jButton_SearchByNameOrDescription_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_SearchByNameOrDescription_ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
                jLabel1.setForeground(new java.awt.Color(0, 0, 204));
                jLabel1.setText("Cautare dupa nume sau descriere");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jTextField_Search,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                207,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton_SearchByNameOrDescription_,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel1))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(12, Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField_Search,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton_SearchByNameOrDescription_))
                                                                .addContainerGap()));

                jLabel3.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel3.setText("De la:");

                jButton_SearchBetweenTwoDates_.setFont(new java.awt.Font("Tahoma", 0, 14));
                jButton_SearchBetweenTwoDates_.setText("Cautare");
                jButton_SearchBetweenTwoDates_.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton_SearchBetweenTwoDates_ActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
                jLabel4.setForeground(new java.awt.Color(0, 0, 204));
                jLabel4.setText("Cautare dupa data publicarii");

                jLabel5.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel5.setText("pana la:");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jDateChooser1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel5)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jDateChooser2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                140,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(36, 36, 36)
                                                                                                .addComponent(jButton_SearchBetweenTwoDates_,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jButton_SearchBetweenTwoDates_)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jDateChooser1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(2, 2, 2)
                                                                                                                                .addComponent(jLabel3))))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel5)
                                                                                                .addComponent(jDateChooser2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));

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
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel3,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addContainerGap())
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                950,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                30,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel_Image,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                130,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel_ISBN)
                                                                                                                .addComponent(jLabel_Author)
                                                                                                                .addComponent(jLabel_Genre)
                                                                                                                .addComponent(jLabel_Publisher)
                                                                                                                .addComponent(jLabel_Price)
                                                                                                                .addComponent(jLabel_Name,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                160,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(52, 52, 52)))));
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
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                370,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(36, 36, 36)
                                                                                                                .addComponent(jLabel_Image,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                145,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel_ISBN)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel_Name)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel_Author)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel_Genre)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel_Publisher)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel_Price)))
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1202,
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

        private void jButton_SearchByNameOrDescription_ActionPerformed(java.awt.event.ActionEvent evt) {

                String value = jTextField_Search.getText();

                String query = "SELECT * FROM `books` WHERE `name` LIKE '%" + value + "%' OR `publisher` LIKE '%"
                                + value
                                + "%' or `description` LIKE '%" + value + "%'";
                populateJtableWithBooks(query);
        }

        private void jTable_Books_MouseClicked(java.awt.event.MouseEvent evt) {

                My_Classes.Book SelectedBook;
                try {

                        Integer rowIndex = jTable_Books_.getSelectedRow();

                        Integer id = Integer.parseInt(jTable_Books_.getModel().getValueAt(rowIndex, 0).toString());

                        SelectedBook = book.getBookById(id);

                        if (SelectedBook != null) {
                                jLabel_ISBN.setText("ISBN:" + SelectedBook.getIsbn());
                                jLabel_Name.setText("Titlu:" + SelectedBook.getName());

                                jLabel_Author.setText("Autor:"
                                                + author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName() + ""
                                                + author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());

                                jLabel_Genre.setText("Categorie:"
                                                + genre.getGenreById(SelectedBook.getGenre_id()).getName());

                                jLabel_Publisher.setText("Editura:" + SelectedBook.getPublisher());
                                jLabel_Price.setText("Pret:" + String.valueOf(SelectedBook.getPrice()) + "RON");

                                byte[] image = SelectedBook.getCover();

                                jLabel_Image.setEnabled(true);
                                Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1,
                                                new Color(0, 0, 0));
                                jLabel_Image.setBorder(JlabelImageBorder);
                                func.displayImage(125, 130, image, "", jLabel_Image);
                        } else {
                                JOptionPane.showMessageDialog(null, "Niciun utilizator gasit", "Invalid ID", 3);
                        }

                } catch (Exception ex) {

                        JOptionPane.showMessageDialog(null, "Introduceti un ID valid", "Invalid ID", 3);
                }

        }

        private void jButton_SearchBetweenTwoDates_ActionPerformed(java.awt.event.ActionEvent evt) {

                try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String date1 = dateFormat.format(jDateChooser1.getDate());
                        String date2 = dateFormat.format(jDateChooser2.getDate());

                        String query = "SELECT * FROM `books` WHERE `date_received` BETWEEN '" + date1 + "' AND '"
                                        + date2 + "'";
                        populateJtableWithBooks(query);
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Selecteaza doua date valide", "No Dates Selected", 2);
                }

        }

        public void populateJtableWithBooks(String query) {

                ArrayList<My_Classes.Book> booksList = book.booksList(query);

                String[] colNames = { "ID", "ISBN", "Titlu", "Autor", "Categorie", "Cantitate", "Editura", "Pret",
                                "Data publicarii" };

                Object[][] rows = new Object[booksList.size()][colNames.length];

                for (int i = 0; i < booksList.size(); i++) {
                        rows[i][0] = booksList.get(i).getId();
                        rows[i][1] = booksList.get(i).getIsbn();
                        rows[i][2] = booksList.get(i).getName();
                        rows[i][3] = author.getAuthorById(booksList.get(i).getAuthor_id()).getFirstName() + " "
                                        + author.getAuthorById(booksList.get(i).getAuthor_id()).getLastName();
                        rows[i][4] = booksList.get(i).getGenre_id();
                        rows[i][5] = booksList.get(i).getQuantity();
                        rows[i][6] = booksList.get(i).getPublisher();
                        rows[i][7] = booksList.get(i).getPrice();
                        rows[i][8] = booksList.get(i).getDate_received();
                }

                DefaultTableModel model = new DefaultTableModel(rows, colNames);
                jTable_Books_.setModel(model);

        }

        private javax.swing.JButton jButton_SearchBetweenTwoDates_;
        private javax.swing.JButton jButton_SearchByNameOrDescription_;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private com.toedter.calendar.JDateChooser jDateChooser2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel_Author;
        private javax.swing.JLabel jLabel_CloseForm_;
        private javax.swing.JLabel jLabel_FormTitle;
        private javax.swing.JLabel jLabel_Genre;
        private javax.swing.JLabel jLabel_ISBN;
        private javax.swing.JLabel jLabel_Image;
        private javax.swing.JLabel jLabel_Name;
        private javax.swing.JLabel jLabel_Price;
        private javax.swing.JLabel jLabel_Publisher;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable_Books_;
        private javax.swing.JTextField jTextField_Search;

}
