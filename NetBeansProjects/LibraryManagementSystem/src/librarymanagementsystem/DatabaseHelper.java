/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



/**
 *
 * @author deathscythe
 */
public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/LibraryDB"; 
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    private Connection connection = null;
    public DatabaseHelper() throws SQLException {
        try {
            connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error connecting to the database.");
            throw e; 
        }
    }
    public boolean insertBook(Book book) throws SQLException {
        String query = "INSERT INTO books (title, author, isbn, language, genre, publisher, year, copies) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setString(3, book.getIsbn());
            statement.setString(4, book.getLanguage());
            statement.setString(5, book.getGenre());
            statement.setString(6, book.getPublisher());
            statement.setString(7, String.valueOf(book.getYear()));
            statement.setString(8, String.valueOf(book.getCopies()));

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0; 
        }
    }
    
    
    public List<Book> getAllBooks() throws SQLException {
    String query = "SELECT * FROM books";
    List<Book> books = new ArrayList<>();

    try (PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            Book book = new Book(
                resultSet.getString("title"),
                resultSet.getString("author"),
                resultSet.getString("isbn"),
                resultSet.getString("language"),
                resultSet.getString("genre"),
                resultSet.getString("publisher"),
                resultSet.getInt("year"),
                resultSet.getInt("copies")
            );
            books.add(book);
        }
    }
    return books;
    }

    public boolean insertStudent(Student student) throws SQLException {
        String query = "INSERT INTO students (student_id, first_name, last_name, year_of_study) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, String.valueOf(student.getStudentId()));
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setString(4, String.valueOf(student.getStudyYear()));
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0; 
        }
    }
    
    public Book searchBookByName(String bookName) throws SQLException {
        String sql = "SELECT * FROM books WHERE title = ?";
        Book book = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, bookName); // Search by exact title

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                book = new Book(
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("isbn"),
                    rs.getString("language"),
                    rs.getString("genre"),
                    rs.getString("publisher"),
                    rs.getInt("year"),
                    rs.getInt("copies")
                );
            }
        }
        return book;   
    }   
    
    public boolean borrowBook(int student_id, String isbn, int borrow_period) throws SQLException{
        LocalDate currentDate = LocalDate.now();
        java.sql.Date borrowDate = java.sql.Date.valueOf(currentDate);
        LocalDate dueDate = currentDate.plusDays(borrow_period);
        java.sql.Date sqlDueDate = java.sql.Date.valueOf(dueDate);
         String query = "INSERT INTO borrowed (student_id, isbn, borrow_date, return_date) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, student_id);
                statement.setString(2, isbn);
                statement.setDate(3, borrowDate);
                statement.setDate(4, sqlDueDate);
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Book borrowed successfully!");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to borrow book.");
                    return false;
                }
            }
    }
}
