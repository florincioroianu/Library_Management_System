
package My_Forms;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class BookInfoCardForm extends javax.swing.JFrame {

        My_Classes.Book book = new My_Classes.Book();
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        My_Classes.Author author = new My_Classes.Author();
        My_Classes.Genre genre = new My_Classes.Genre();

        public BookInfoCardForm(int book_id) {
                initComponents();

                this.setLocationRelativeTo(null);

                Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211, 84, 0));
                jPanel1.setBorder(panelHeaderBorder);

                func.displayImage(90, 60, null, "/My_Images/book.png", jLabel_FormTitle);

                Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
                jLabel_Image.setBorder(JlabelImageBorder);

                func.displayImage(125, 130, null, "/My_Images/blank-profile.png", jLabel_Image);

                displayBookInfo(book_id);

        }

        public void displayBookInfo(int _book_id) {
                try {

                        My_Classes.Book SelectedBook = book.getBookById(_book_id);

                        if (SelectedBook != null) {
                                jLabel_ISBN.setText("ISBN: " + SelectedBook.getIsbn());
                                jLabel_Name.setText("Titlu: " + SelectedBook.getName());

                                jLabel_Author.setText("Autor: "
                                                + author.getAuthorById(SelectedBook.getAuthor_id()).getFirstName() + ""
                                                + author.getAuthorById(SelectedBook.getAuthor_id()).getLastName());

                                jLabel_Genre.setText("Categorie: "
                                                + genre.getGenreById(SelectedBook.getGenre_id()).getName());

                                jLabel_Publisher.setText("Editura: " + SelectedBook.getPublisher());
                                jLabel_Price.setText("Pret: " + String.valueOf(SelectedBook.getPrice()));
                                jLabel_Quantity.setText(
                                                "Cantitate disp: " + String.valueOf(SelectedBook.getQuantity()));
                                jLabel_Date_Rcv.setText("Data adaugarii: " + SelectedBook.getDate_received());
                                jTextArea_Description.setText("Descriere: " + SelectedBook.getDescription());

                                byte[] image = SelectedBook.getCover();

                                func.displayImage(140, 210, image, "", jLabel_Image);
                        }

                } catch (SQLException ex) {
                        Logger.getLogger(BookInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel_FormTitle = new javax.swing.JLabel();
                jLabel_CloseForm_ = new javax.swing.JLabel();
                jLabel_Image = new javax.swing.JLabel();
                jLabel_ISBN = new javax.swing.JLabel();
                jLabel_Name = new javax.swing.JLabel();
                jLabel_Author = new javax.swing.JLabel();
                jLabel_Genre = new javax.swing.JLabel();
                jLabel_Price = new javax.swing.JLabel();
                jLabel_Publisher = new javax.swing.JLabel();
                jLabel_Quantity = new javax.swing.JLabel();
                jLabel_Date_Rcv = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea_Description = new javax.swing.JTextArea();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(420, 611));

                jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
                jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24));
                jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
                jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel_FormTitle.setText("Informatii carte");
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

                jLabel_Image.setBackground(new java.awt.Color(204, 255, 204));
                jLabel_Image.setOpaque(true);

                jLabel_ISBN.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_ISBN.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_ISBN.setText("ISBN");

                jLabel_Name.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Name.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Name.setText("Titlu:");

                jLabel_Author.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Author.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Author.setText("Autor:");

                jLabel_Genre.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Genre.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Genre.setText("Categorie:");

                jLabel_Price.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Price.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Price.setText("Pret:");

                jLabel_Publisher.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Publisher.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Publisher.setText("Editura:");

                jLabel_Quantity.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Quantity.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Quantity.setText("Cantitate disponibila:");

                jLabel_Date_Rcv.setFont(new java.awt.Font("Verdana", 0, 14));
                jLabel_Date_Rcv.setForeground(new java.awt.Color(0, 51, 153));
                jLabel_Date_Rcv.setText("Data publicarii:");

                jTextArea_Description.setColumns(20);
                jTextArea_Description.setRows(5);
                jTextArea_Description.setEnabled(false);
                jScrollPane1.setViewportView(jTextArea_Description);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel_FormTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                382,
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
                                                                                                .addComponent(jLabel_Image,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                150,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel_Date_Rcv)
                                                                                                                                                .addComponent(jLabel_ISBN)
                                                                                                                                                .addComponent(jLabel_Author)
                                                                                                                                                .addComponent(jLabel_Genre)
                                                                                                                                                .addComponent(jLabel_Publisher)
                                                                                                                                                .addComponent(jLabel_Price)
                                                                                                                                                .addComponent(jLabel_Quantity))
                                                                                                                                .addGap(0, 140, Short.MAX_VALUE))
                                                                                                                .addComponent(jLabel_Name,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addComponent(jScrollPane1))
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
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
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
                                                                                                .addComponent(jLabel_Price)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel_Quantity)
                                                                                                .addGap(15, 15, 15)
                                                                                                .addComponent(jLabel_Date_Rcv))
                                                                                .addComponent(jLabel_Image,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                120,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
        }

        private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {

                this.dispose();
        }

        private javax.swing.JLabel jLabel_Author;
        private javax.swing.JLabel jLabel_CloseForm_;
        private javax.swing.JLabel jLabel_Date_Rcv;
        private javax.swing.JLabel jLabel_FormTitle;
        private javax.swing.JLabel jLabel_Genre;
        private javax.swing.JLabel jLabel_ISBN;
        private javax.swing.JLabel jLabel_Image;
        private javax.swing.JLabel jLabel_Name;
        private javax.swing.JLabel jLabel_Price;
        private javax.swing.JLabel jLabel_Publisher;
        private javax.swing.JLabel jLabel_Quantity;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea jTextArea_Description;

}
