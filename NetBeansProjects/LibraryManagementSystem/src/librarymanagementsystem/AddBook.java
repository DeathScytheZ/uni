
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deathscythe
 */
public class AddBook extends javax.swing.JFrame {
    private BookService bookService;
    /**
     * Creates new form AddBook
     */
    public AddBook() throws SQLException {
        initComponents();
        bookService = new BookService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        publisherLabel = new javax.swing.JLabel();
        copiesLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        languageLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        language = new javax.swing.JTextField();
        genre = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        copies = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publisherLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        publisherLabel.setForeground(new java.awt.Color(255, 255, 255));
        publisherLabel.setText("Publisher:");
        jPanel1.add(publisherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, 43));

        copiesLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        copiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        copiesLabel.setText("Copies:");
        jPanel1.add(copiesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 287, 140, 43));

        genreLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Genre:");
        jPanel1.add(genreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 34, 140, 43));

        isbnLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        isbnLabel.setForeground(new java.awt.Color(255, 255, 255));
        isbnLabel.setText("ISBN:");
        jPanel1.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 204, 83, 49));

        yearLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year:");
        jPanel1.add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 204, 140, 43));

        languageLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        languageLabel.setForeground(new java.awt.Color(255, 255, 255));
        languageLabel.setText("Language:");
        jPanel1.add(languageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 289, -1, 47));

        authorLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorLabel.setText("Author:");
        jPanel1.add(authorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 120, -1, 43));

        titleLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title:");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 41, -1, 43));

        title.setBackground(new java.awt.Color(228, 187, 246));
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 36, 283, 47));

        isbn.setBackground(new java.awt.Color(228, 187, 246));
        isbn.setForeground(new java.awt.Color(0, 0, 0));
        isbn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 289, 283, 47));

        language.setBackground(new java.awt.Color(228, 187, 246));
        language.setForeground(new java.awt.Color(0, 0, 0));
        language.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(language, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 206, 283, 47));

        genre.setBackground(new java.awt.Color(228, 187, 246));
        genre.setForeground(new java.awt.Color(0, 0, 0));
        genre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 35, 283, 49));

        author.setBackground(new java.awt.Color(228, 187, 246));
        author.setForeground(new java.awt.Color(0, 0, 0));
        author.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 122, 283, 47));

        year.setBackground(new java.awt.Color(228, 187, 246));
        year.setForeground(new java.awt.Color(0, 0, 0));
        year.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 205, 283, 49));

        copies.setBackground(new java.awt.Color(228, 187, 246));
        copies.setForeground(new java.awt.Color(0, 0, 0));
        copies.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(copies, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 291, 283, 43));

        publisher.setBackground(new java.awt.Color(228, 187, 246));
        publisher.setForeground(new java.awt.Color(0, 0, 0));
        publisher.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 121, 283, 49));

        addButton.setBackground(new java.awt.Color(195, 136, 225));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Book");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 388, 231, 60));

        cancelButton.setBackground(new java.awt.Color(195, 136, 225));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 388, 231, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/photo_2024-12-19_09-51-59 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        HomePage home = new HomePage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String book_title = title.getText();
        String book_author = author.getText();
        String book_isbn = isbn.getText();
        String book_language = language.getText();
        String book_genre = genre.getText();
        String book_publisher = publisher.getText();
        int book_year = Integer.parseInt(year.getText());
        int book_copies = Integer.parseInt(copies.getText());
        Book book = new Book(book_title, book_author, book_isbn, book_language, book_genre, book_publisher, book_year, book_copies);
        try {
            bookService.addBook(book);
        } catch (SQLException ex) {
            Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddBook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField author;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField copies;
    private javax.swing.JLabel copiesLabel;
    private javax.swing.JTextField genre;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField language;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JTextField publisher;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JTextField title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField year;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
