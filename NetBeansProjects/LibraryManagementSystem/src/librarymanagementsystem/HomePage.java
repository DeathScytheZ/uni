/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author deathscythe
 */
public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        
        searchBar.setText("Search for books");
        searchBar.setForeground(Color.GRAY);

        searchBar.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (searchBar.getText().equals("Search for books")) {
                searchBar.setText("");
                searchBar.setForeground(Color.BLACK);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (searchBar.getText().isEmpty()) {
                searchBar.setText("Search for books");
                searchBar.setForeground(Color.GRAY);
            }
        }
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addBook = new javax.swing.JButton();
        listBooks = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        borrowButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBar.setForeground(new java.awt.Color(153, 153, 153));
        searchBar.setText("Search for books");
        searchBar.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 65, 530, 59));

        searchButton.setBackground(new java.awt.Color(195, 157, 243));
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 65, 100, 59));

        addBook.setBackground(new java.awt.Color(195, 157, 243));
        addBook.setForeground(new java.awt.Color(0, 0, 0));
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        jPanel1.add(addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 284, 67));

        listBooks.setBackground(new java.awt.Color(195, 157, 243));
        listBooks.setForeground(new java.awt.Color(0, 0, 0));
        listBooks.setText(" Available Books");
        listBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBooksActionPerformed(evt);
            }
        });
        jPanel1.add(listBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 169, 302, 67));

        addStudent.setBackground(new java.awt.Color(195, 157, 243));
        addStudent.setForeground(new java.awt.Color(0, 0, 0));
        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        jPanel1.add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 284, 71));

        borrowButton.setBackground(new java.awt.Color(195, 157, 243));
        borrowButton.setForeground(new java.awt.Color(0, 0, 0));
        borrowButton.setText("Borrow Book");
        borrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowButtonActionPerformed(evt);
            }
        });
        jPanel1.add(borrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 267, 302, 71));

        quitButton.setBackground(new java.awt.Color(195, 157, 243));
        quitButton.setForeground(new java.awt.Color(0, 0, 0));
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 302, 71));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/photo_2024-12-19_09-51-59.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        AddBook add = null;
        try {
            add = new AddBook();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
                add.setLocationRelativeTo(null);
                add.setVisible(true); 
    }//GEN-LAST:event_addBookActionPerformed

    private void listBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBooksActionPerformed
        BookList blist = new BookList();
        blist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listBooksActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        AddStudent addstd = null;
        try {
            addstd = new AddStudent();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        addstd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addStudentActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchQuery = searchBar.getText().trim(); 
        if (!searchQuery.isEmpty()) {
            BookService bookService = null;
            try {
                bookService = new BookService(); 
            } catch (SQLException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Book book = bookService.searchBook(searchQuery);
                if (book != null) {
                    BrowseBooks browse = new BrowseBooks(book);
                    browse.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No book found with that name.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error while searching: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void borrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowButtonActionPerformed
        BorrowBook borrow = null;
        try {
            borrow = new BorrowBook();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        borrow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_borrowButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton borrowButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listBooks;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
