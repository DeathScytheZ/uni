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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

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

        publisherLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        publisherLabel.setForeground(new java.awt.Color(255, 255, 255));
        publisherLabel.setText("Publisher:");

        copiesLabel.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        copiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        copiesLabel.setText("Copies:");

        title.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("some book");

        author.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        author.setForeground(new java.awt.Color(255, 255, 255));
        author.setText("someone");

        isbn.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        isbn.setForeground(new java.awt.Color(255, 255, 255));
        isbn.setText("03265080500");

        genre.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        genre.setForeground(new java.awt.Color(255, 255, 255));
        genre.setText("something, something else");

        language.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        language.setForeground(new java.awt.Color(255, 255, 255));
        language.setText("English");

        year.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("1989");

        publisher.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        publisher.setForeground(new java.awt.Color(255, 255, 255));
        publisher.setText("some publisher");

        copies.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        copies.setForeground(new java.awt.Color(255, 255, 255));
        copies.setText("11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isbnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(languageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(publisherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(copiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(language, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(publisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(copies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publisherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel language;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JLabel publisher;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel year;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
