/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.List;
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
        searchButton = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        deleteBook = new javax.swing.JButton();
        addBook = new javax.swing.JButton();
        listBooks = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        searchButton.setBackground(new java.awt.Color(153, 153, 153));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchBar.setForeground(new java.awt.Color(153, 153, 153));
        searchBar.setText("Search for books");
        searchBar.setMargin(new java.awt.Insets(2, 20, 2, 20));

        deleteBook.setBackground(new java.awt.Color(153, 153, 153));
        deleteBook.setForeground(new java.awt.Color(255, 255, 255));
        deleteBook.setText("Delete Book");

        addBook.setBackground(new java.awt.Color(153, 153, 153));
        addBook.setForeground(new java.awt.Color(255, 255, 255));
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        listBooks.setBackground(new java.awt.Color(153, 153, 153));
        listBooks.setForeground(new java.awt.Color(255, 255, 255));
        listBooks.setText(" Available Books");
        listBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBooksActionPerformed(evt);
            }
        });

        addStudent.setBackground(new java.awt.Color(153, 153, 153));
        addStudent.setForeground(new java.awt.Color(255, 255, 255));
        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(306, 306, 306))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudent))
                .addGap(91, 91, 91))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addStudent, deleteBook});

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
                } else {
                    JOptionPane.showMessageDialog(this, "No book found with that name.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error while searching: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

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
    private javax.swing.JButton deleteBook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listBooks;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
