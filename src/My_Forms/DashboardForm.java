
package My_Forms;

import My_Classes.Book;
import My_Classes.Func_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class DashboardForm extends javax.swing.JFrame {

    Border buttonBorder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    Border buttonBorder0 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(36, 37, 42));

    My_Classes.Func_Class func = new Func_Class();
    My_Classes.Book book = new Book();

    JLabel[] labels_tab = new JLabel[5];

    public DashboardForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        func.displayImage(jLabel_Dashboard_Logo.getWidth(), jLabel_Dashboard_Logo.getHeight(), null,
                "/My_Images/book_dash_logo.png", jLabel_Dashboard_Logo);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);

        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(235, 125, 22));
        jPanel_4_header.setBorder(panelHeader_1_Border);

        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(26, 138, 32));
        jPanel_2_header.setBorder(panelHeader_2_Border);

        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115, 40, 125));
        jPanel_3_header.setBorder(panelHeader_3_Border);

        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(58, 83, 155));
        jPanel_4_header.setBorder(panelHeader_4_Border);

        addBorders();

        buttonsHoverEffect();

        displayCount();

        labels_tab[0] = jLabel_Image_1;
        labels_tab[1] = jLabel_Image_2;
        labels_tab[2] = jLabel_Image_3;
        labels_tab[3] = jLabel_Image_4;
        labels_tab[4] = jLabel_Image_5;

        book.displayBooksCover(labels_tab);

    }

    public void addBorders() {

        Component[] comps = jPanel_Menu.getComponents();

        for (Component comp : comps) {

            if (comp instanceof JButton) {
                JButton button = (JButton) comp;

                button.setBorder(buttonBorder0);
            }
        }
    }

    public void buttonsHoverEffect() {

        Component[] comps = jPanel_Menu.getComponents();

        for (Component comp : comps) {

            if (comp instanceof JButton) {
                JButton button = (JButton) comp;

                button.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseEntered(MouseEvent evt) {
                        button.setBorder(buttonBorder1);
                    }

                    @Override
                    public void mouseExited(MouseEvent evt) {
                        button.setBorder(buttonBorder0);
                    }

                });
            }
        }

    }

    public void displayCount() {
        jLabel_BooksCount.setText(String.valueOf(func.countData("books")));
        jLabel_AuthorsCount.setText(String.valueOf(func.countData("author")));
        jLabel_MembersCount.setText(String.valueOf(func.countData("members")));

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_AddMember_ = new javax.swing.JButton();
        jButton_EditMember_ = new javax.swing.JButton();
        jButton_DeleteMember_ = new javax.swing.JButton();
        jButton_Members_List_ = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton_Manage_Genres_ = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton_Manage_Authors_ = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton_AddBook_ = new javax.swing.JButton();
        jButton_EditBook_ = new javax.swing.JButton();
        jButton_DeleteBook_ = new javax.swing.JButton();
        jButton_Books_List_ = new javax.swing.JButton();
        jLabel_CirculationTitle_ = new javax.swing.JLabel();
        jButton_IssueBook_ = new javax.swing.JButton();
        jButton_ReturnBook_ = new javax.swing.JButton();
        jLabel_some_awsome_name_here_ = new javax.swing.JLabel();
        jButton_ManageUsers_ = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_MembersCount = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Image_1 = new javax.swing.JLabel();
        jLabel_Image_2 = new javax.swing.JLabel();
        jLabel_Image_3 = new javax.swing.JLabel();
        jLabel_Image_4 = new javax.swing.JLabel();
        jLabel_Image_5 = new javax.swing.JLabel();
        jpanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_AuthorsCount = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_1_header1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_BooksCount = new javax.swing.JLabel();
        jLabel_WelcomeUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Menu.setBackground(new java.awt.Color(36, 37, 42));

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Biblioteca");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
                jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_HeaderLayout.setVerticalGroup(
                jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                .addGroup(jPanel_HeaderLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel_Dashboard_Logo,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel1)))
                                .addContainerGap(20, Short.MAX_VALUE)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Utilizatori");

        jButton_AddMember_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_AddMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddMember_.setText("Adauga utilizator");
        jButton_AddMember_.setContentAreaFilled(false);
        jButton_AddMember_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddMember_ActionPerformed(evt);
            }
        });

        jButton_EditMember_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_EditMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditMember_.setText("Editeaza utilizator");
        jButton_EditMember_.setContentAreaFilled(false);
        jButton_EditMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditMember_ActionPerformed(evt);
            }
        });

        jButton_DeleteMember_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_DeleteMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteMember_.setText("Sterge utilizator");
        jButton_DeleteMember_.setContentAreaFilled(false);
        jButton_DeleteMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteMember_ActionPerformed(evt);
            }
        });

        jButton_Members_List_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Members_List_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Members_List_.setText("Lista utilizatori");
        jButton_Members_List_.setContentAreaFilled(false);
        jButton_Members_List_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Members_List_ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Categorii");

        jButton_Manage_Genres_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Manage_Genres_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Genres_.setText("Administrare categorii");
        jButton_Manage_Genres_.setContentAreaFilled(false);
        jButton_Manage_Genres_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Genres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Genres_ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Autori");

        jButton_Manage_Authors_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Manage_Authors_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Authors_.setText("Administrare autori");
        jButton_Manage_Authors_.setContentAreaFilled(false);
        jButton_Manage_Authors_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Authors_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Authors_ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Carti");

        jButton_AddBook_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_AddBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddBook_.setText("Adaugare carte");
        jButton_AddBook_.setContentAreaFilled(false);
        jButton_AddBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddBook_ActionPerformed(evt);
            }
        });

        jButton_EditBook_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_EditBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditBook_.setText("Editare carte");
        jButton_EditBook_.setContentAreaFilled(false);
        jButton_EditBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditBook_ActionPerformed(evt);
            }
        });

        jButton_DeleteBook_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_DeleteBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteBook_.setText("Stergere carte");
        jButton_DeleteBook_.setContentAreaFilled(false);
        jButton_DeleteBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteBook_ActionPerformed(evt);
            }
        });

        jButton_Books_List_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_Books_List_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Books_List_.setText("Lista carti");
        jButton_Books_List_.setContentAreaFilled(false);
        jButton_Books_List_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Books_List_ActionPerformed(evt);
            }
        });

        jLabel_CirculationTitle_.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel_CirculationTitle_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CirculationTitle_.setText("Operatii");

        jButton_IssueBook_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_IssueBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_IssueBook_.setText("Imprumutare carte");
        jButton_IssueBook_.setContentAreaFilled(false);
        jButton_IssueBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_IssueBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IssueBook_ActionPerformed(evt);
            }
        });

        jButton_ReturnBook_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton_ReturnBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ReturnBook_.setText("Returnare carte");
        jButton_ReturnBook_.setContentAreaFilled(false);
        jButton_ReturnBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ReturnBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnBook_ActionPerformed(evt);
            }
        });

        jLabel_some_awsome_name_here_.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel_some_awsome_name_here_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_some_awsome_name_here_.setText("|");

        jButton_ManageUsers_.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton_ManageUsers_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ManageUsers_.setText("Administrare utilizatori");
        jButton_ManageUsers_.setContentAreaFilled(false);
        jButton_ManageUsers_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageUsers_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageUsers_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
                jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ManageUsers_, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGroup(jPanel_MenuLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanel_MenuLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel_CirculationTitle_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                                .addComponent(jButton_IssueBook_)
                                                                .addGap(11, 11, 11)
                                                                .addComponent(jLabel_some_awsome_name_here_)
                                                                .addGap(13, 13, 13)
                                                                .addComponent(jButton_ReturnBook_))))
                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel_MenuLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jButton_Manage_Authors_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel_MenuLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jButton_Books_List_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_DeleteBook_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_EditBook_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_AddBook_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel13,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_Members_List_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_DeleteMember_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_EditMember_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton_AddMember_,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel8,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel11,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel12,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jButton_Manage_Genres_)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_MenuLayout.setVerticalGroup(
                jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Manage_Genres_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Manage_Authors_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_AddMember_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_EditMember_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_DeleteMember_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Members_List_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_AddBook_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_EditBook_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_DeleteBook_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Books_List_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_CirculationTitle_, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_MenuLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_IssueBook_)
                                        .addComponent(jButton_ReturnBook_)
                                        .addComponent(jLabel_some_awsome_name_here_))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_ManageUsers_)));

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));

        jPanel_2_header.setBackground(new java.awt.Color(65, 160, 10));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Utilizatori");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
                jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(145, Short.MAX_VALUE)));
        jPanel_2_headerLayout.setVerticalGroup(
                jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel_2_headerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));

        jLabel_MembersCount.setFont(new java.awt.Font("SansSerif", 1, 36));
        jLabel_MembersCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MembersCount.setText("11389");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
                jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_2_header, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        jPanel_2Layout.setVerticalGroup(
                jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_2Layout.createSequentialGroup()
                                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        jPanel_4.setBackground(new java.awt.Color(44, 130, 201));

        jPanel_4_header.setBackground(new java.awt.Color(68, 108, 179));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ultimele carti adaugate");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
                jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_4_headerLayout.setVerticalGroup(
                jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel_4_headerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));

        jLabel_Image_1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_1.setOpaque(true);

        jLabel_Image_2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_2.setOpaque(true);

        jLabel_Image_3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_3.setOpaque(true);

        jLabel_Image_4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_4.setOpaque(true);

        jLabel_Image_5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_5.setOpaque(true);

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
                jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_4_header, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_4Layout.setVerticalGroup(
                jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_4Layout.createSequentialGroup()
                                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 11, Short.MAX_VALUE)));

        jpanel_3.setBackground(new java.awt.Color(155, 89, 182));

        jPanel_3_header.setBackground(new java.awt.Color(125, 60, 155));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Autori");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
                jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(145, Short.MAX_VALUE)));
        jPanel_3_headerLayout.setVerticalGroup(
                jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel_3_headerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));

        jLabel_AuthorsCount.setFont(new java.awt.Font("SansSerif", 1, 36));
        jLabel_AuthorsCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AuthorsCount.setText("18");

        javax.swing.GroupLayout jpanel_3Layout = new javax.swing.GroupLayout(jpanel_3);
        jpanel_3.setLayout(jpanel_3Layout);
        jpanel_3Layout.setHorizontalGroup(
                jpanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_3_header, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jpanel_3Layout.setVerticalGroup(
                jpanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpanel_3Layout.createSequentialGroup()
                                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        jPanel_3.setBackground(new java.awt.Color(255, 178, 41));

        jPanel_1_header1.setBackground(new java.awt.Color(246, 145, 16));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carti");

        javax.swing.GroupLayout jPanel_1_header1Layout = new javax.swing.GroupLayout(jPanel_1_header1);
        jPanel_1_header1.setLayout(jPanel_1_header1Layout);
        jPanel_1_header1Layout.setHorizontalGroup(
                jPanel_1_header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_1_header1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(145, Short.MAX_VALUE)));
        jPanel_1_header1Layout.setVerticalGroup(
                jPanel_1_header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel_1_header1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));

        jLabel_BooksCount.setFont(new java.awt.Font("SansSerif", 1, 36));
        jLabel_BooksCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BooksCount.setText("00532");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
                jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_1_header1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.DEFAULT_SIZE, 280,
                                        Short.MAX_VALUE)));
        jPanel_3Layout.setVerticalGroup(
                jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_3Layout.createSequentialGroup()
                                .addComponent(jPanel_1_header1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 160, Short.MAX_VALUE))
                        .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_3Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(63, Short.MAX_VALUE))));

        jLabel_WelcomeUsername.setFont(new java.awt.Font("SansSerif", 3, 14));
        jLabel_WelcomeUsername.setText("Bine ai revenit username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel_3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jPanel_2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(jpanel_3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanel_4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(38, 38, 38))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_WelcomeUsername,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 280,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_WelcomeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jpanel_3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

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

    private void jButton_Manage_Genres_ActionPerformed(java.awt.event.ActionEvent evt) {

        ManageGenresForm mngGenresF = new ManageGenresForm();
        mngGenresF.setVisible(true);
    }

    private void jButton_Manage_Authors_ActionPerformed(java.awt.event.ActionEvent evt) {

        ManageAuthorsForm mngAuthorsF = new ManageAuthorsForm();
        mngAuthorsF.setVisible(true);
    }

    private void jButton_AddMember_ActionPerformed(java.awt.event.ActionEvent evt) {

        AddMemberForm addMbrF = new AddMemberForm();
        addMbrF.setVisible(true);
    }

    private void jButton_EditMember_ActionPerformed(java.awt.event.ActionEvent evt) {

        EditMemberForm editMbrF = new EditMemberForm();
        editMbrF.setVisible(true);
    }

    private void jButton_DeleteMember_ActionPerformed(java.awt.event.ActionEvent evt) {

        DeleteMemberForm deleteMbrF = new DeleteMemberForm();
        deleteMbrF.setVisible(true);
    }

    private void jButton_Members_List_ActionPerformed(java.awt.event.ActionEvent evt) {

        MembersListForm membersListF = new MembersListForm();
        membersListF.setVisible(true);
    }

    private void jButton_AddBook_ActionPerformed(java.awt.event.ActionEvent evt) {

        AddBookForm addBookf = new AddBookForm();
        addBookf.setVisible(true);
    }

    private void jButton_EditBook_ActionPerformed(java.awt.event.ActionEvent evt) {

        EditBookForm editBookf = new EditBookForm();
        editBookf.setVisible(true);
    }

    private void jButton_DeleteBook_ActionPerformed(java.awt.event.ActionEvent evt) {

        DeleteBookForm deleteBookf = new DeleteBookForm();
        deleteBookf.setVisible(true);
    }

    private void jButton_Books_List_ActionPerformed(java.awt.event.ActionEvent evt) {

        BooksListForm booksListf = new BooksListForm();
        booksListf.setVisible(true);
    }

    private void jButton_IssueBook_ActionPerformed(java.awt.event.ActionEvent evt) {

        IssueBookForm issBookf = new IssueBookForm();
        issBookf.setVisible(true);
    }

    private void jButton_ReturnBook_ActionPerformed(java.awt.event.ActionEvent evt) {

        ReturnBookForm rtnBookf = new ReturnBookForm();
        rtnBookf.setVisible(true);
    }

    private void jButton_ManageUsers_ActionPerformed(java.awt.event.ActionEvent evt) {

        ManageUsersForm mngUsersf = new ManageUsersForm();
        mngUsersf.setVisible(true);
    }

    private javax.swing.JButton jButton_AddBook_;
    private javax.swing.JButton jButton_AddMember_;
    private javax.swing.JButton jButton_Books_List_;
    private javax.swing.JButton jButton_DeleteBook_;
    private javax.swing.JButton jButton_DeleteMember_;
    private javax.swing.JButton jButton_EditBook_;
    private javax.swing.JButton jButton_EditMember_;
    public javax.swing.JButton jButton_IssueBook_;
    public javax.swing.JButton jButton_ManageUsers_;
    private javax.swing.JButton jButton_Manage_Authors_;
    private javax.swing.JButton jButton_Manage_Genres_;
    private javax.swing.JButton jButton_Members_List_;
    public javax.swing.JButton jButton_ReturnBook_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AuthorsCount;
    private javax.swing.JLabel jLabel_BooksCount;
    public javax.swing.JLabel jLabel_CirculationTitle_;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JLabel jLabel_Image_1;
    private javax.swing.JLabel jLabel_Image_2;
    private javax.swing.JLabel jLabel_Image_3;
    private javax.swing.JLabel jLabel_Image_4;
    private javax.swing.JLabel jLabel_Image_5;
    private javax.swing.JLabel jLabel_MembersCount;
    public javax.swing.JLabel jLabel_WelcomeUsername;
    public javax.swing.JLabel jLabel_some_awsome_name_here_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1_header1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JPanel jpanel_3;

}
