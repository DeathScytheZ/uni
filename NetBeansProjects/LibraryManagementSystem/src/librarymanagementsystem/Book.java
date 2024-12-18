/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author deathscythe
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private String language;
    private String genre;
    private String publisher;
    private int year;
    private int copies;
    
    public Book(String title, String author, String isbn, String language, String genre, String publisher, int year, int copies){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.language = language;
        this.genre = genre;
        this.publisher = publisher;
        this.year = year;
        this.copies = copies;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    
    public String getLanguage(){
        return this.language;
    }
    
    public String getGenre(){
        return this.genre;
    } 
    
    public String getPublisher(){
        return this.publisher;
    }
    public int getYear(){
        return this.year;
    }
    public int getCopies(){
        return this.copies;
    }
}
