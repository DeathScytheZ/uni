package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;
/**
 *
 * @author deathscythe
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws SQLException {
        //Statement stmt = null;
        HomePage home = new HomePage();
        //AddBook add = new AddBook();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        home.setSize(screenSize.width, screenSize.height);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
        final String url = "jdbc:mysql://localhost:3306/LibraryDB";
        final String user = "root";
        final String password = "";
        //Connection conn = null;
        //try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //conn = DriverManager.getConnection(url, user, password);
            //System.out.println(conn);
            //System.out.println("Connected to the database!");
            //stmt = conn.createStatement();
            //String sql1 = "INSERT INTO books (title) VALUES ('first book')";
            //String sql2 = "INSERT INTO books (title) VALUES ('test book')";
            ///stmt.executeUpdate(sql1);
            //stmt.executeUpdate(sql2);
        //}catch(SQLException se){
            //se.printStackTrace();
        //}catch (Exception e) {
            //e.printStackTrace();
        //}finally{
            //try{
                //if (stmt != null) stmt.close();
                //if (conn != null) conn.close();
            //}catch (SQLException se) {
                //se.printStackTrace();
            //}
        //}
    }
}
   

