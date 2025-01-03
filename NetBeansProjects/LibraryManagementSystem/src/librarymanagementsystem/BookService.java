/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author deathscythe
 */
public class BookService {
    private DatabaseHelper dbHelper;
    public BookService() throws SQLException{
        dbHelper = new DatabaseHelper();
    }
    public boolean addBook(Book book) throws SQLException{
        return dbHelper.insertBook(book);
    };
    
    public List<Book> getAllBooks() throws SQLException {
        return dbHelper.getAllBooks();
    }
    
    public boolean addStudent(Student student) throws SQLException{
        return dbHelper.insertStudent(student);
    };
    
    public Book searchBook(String bookName) throws SQLException {
        return dbHelper.searchBookByName(bookName);
    }
    
    public boolean borrowBook(int student_id, String isbn, int borrow_period) throws SQLException{
        return dbHelper.borrowBook(student_id, isbn, borrow_period);
    }
}
