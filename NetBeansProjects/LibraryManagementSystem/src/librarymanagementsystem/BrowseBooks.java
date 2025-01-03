/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author deathscythe
 */
public class BrowseBooks extends javax.swing.JFrame {
    
    /**
     * Creates new form BrowseBooks
     */
    public BrowseBooks(Book book) {
        initComponents();
        title.setText(book.getTitle());
        author.setText(book.getAuthor());
        isbn.setText(book.getIsbn());
        language.setText(book.getLanguage());
        genre.setText(book.getGenre());
        publisher.setText(book.getPublisher());
        year.setText(String.valueOf(book.getYear()));
        copies.setText(String.valueOf(book.getCopies()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        genreLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        languageLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        copiesLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        genre = new javax.swing.JLabel();
        language = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        publisher = new javax.swing.JLabel();
        copies = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genreLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Genre:");
        jPanel1.add(genreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 176, 171, -1));

        isbnLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        isbnLabel.setForeground(new java.awt.Color(255, 255, 255));
        isbnLabel.setText("ISBN:");
        jPanel1.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 120, 171, 38));

        yearLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year:");
        jPanel1.add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 339, 171, 38));

        languageLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        languageLabel.setForeground(new java.awt.Color(255, 255, 255));
        languageLabel.setText("Language:");
        jPanel1.add(languageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 227, 171, 38));

        authorLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorLabel.setText("Author:");
        jPanel1.add(authorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 76, 171, 38));

        titleLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title:");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 32, 171, 38));

        publisherLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        publisherLabel.setForeground(new java.awt.Color(255, 255, 255));
        publisherLabel.setText("Publisher:");
        jPanel1.add(publisherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 283, 171, 38));

        copiesLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        copiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        copiesLabel.setText("Copies:");
        jPanel1.add(copiesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 395, 171, 38));

        title.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("some book");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 32, 366, 38));

        author.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        author.setForeground(new java.awt.Color(255, 255, 255));
        author.setText("someone");
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 76, 366, 38));

        isbn.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        isbn.setForeground(new java.awt.Color(255, 255, 255));
        isbn.setText("03265080500");
        jPanel1.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 120, 366, 38));

        genre.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        genre.setForeground(new java.awt.Color(255, 255, 255));
        genre.setText("something, something else");
        jPanel1.add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 170, 366, 39));

        language.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        language.setForeground(new java.awt.Color(255, 255, 255));
        language.setText("English");
        jPanel1.add(language, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 227, 366, 38));

        year.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("1989");
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 339, 366, 38));

        publisher.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        publisher.setForeground(new java.awt.Color(255, 255, 255));
        publisher.setText("some publisher");
        jPanel1.add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 283, 366, 38));

        copies.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        copies.setForeground(new java.awt.Color(255, 255, 255));
        copies.setText("11");
        jPanel1.add(copies, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 395, 366, 38));

        okButton.setBackground(new java.awt.Color(153, 153, 153));
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel1.add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 465, 187, 52));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/360_F_917125159_XvccmUDmfINJs1n85nux2tEZlg3gu8Ty (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        HomePage home = new HomePage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Book book = null;
                new BrowseBooks(book).setVisible(true);       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel copies;
    private javax.swing.JLabel copiesLabel;
    private javax.swing.JLabel genre;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel isbn;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel language;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel publisher;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel year;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
