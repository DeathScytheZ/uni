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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        publisherLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        publisherLabel.setForeground(new java.awt.Color(255, 255, 255));
        publisherLabel.setText("Publisher:");

        copiesLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        copiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        copiesLabel.setText("Copies:");

        genreLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Genre:");

        isbnLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        isbnLabel.setForeground(new java.awt.Color(255, 255, 255));
        isbnLabel.setText("ISBN:");

        yearLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year:");

        languageLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        languageLabel.setForeground(new java.awt.Color(255, 255, 255));
        languageLabel.setText("Language:");

        authorLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorLabel.setText("Author:");

        titleLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title:");

        title.setBackground(new java.awt.Color(51, 51, 51));
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        isbn.setBackground(new java.awt.Color(51, 51, 51));
        isbn.setForeground(new java.awt.Color(255, 255, 255));
        isbn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        language.setBackground(new java.awt.Color(51, 51, 51));
        language.setForeground(new java.awt.Color(255, 255, 255));
        language.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        genre.setBackground(new java.awt.Color(51, 51, 51));
        genre.setForeground(new java.awt.Color(255, 255, 255));
        genre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        author.setBackground(new java.awt.Color(51, 51, 51));
        author.setForeground(new java.awt.Color(255, 255, 255));
        author.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        year.setBackground(new java.awt.Color(51, 51, 51));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        copies.setBackground(new java.awt.Color(51, 51, 51));
        copies.setForeground(new java.awt.Color(255, 255, 255));
        copies.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        publisher.setBackground(new java.awt.Color(51, 51, 51));
        publisher.setForeground(new java.awt.Color(255, 255, 255));
        publisher.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        addButton.setBackground(new java.awt.Color(153, 153, 153));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Book");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(153, 153, 153));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(languageLabel)
                            .addComponent(titleLabel)
                            .addComponent(authorLabel)
                            .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(language, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbn)
                            .addComponent(author, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publisherLabel)
                            .addComponent(genreLabel)
                            .addComponent(yearLabel)
                            .addComponent(copiesLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publisher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {copiesLabel, genreLabel, publisherLabel, yearLabel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherLabel)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearLabel)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(copiesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {isbn, language, title});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {copiesLabel, genreLabel, publisherLabel, yearLabel});

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
