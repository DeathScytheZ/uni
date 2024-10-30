package first_package;


public class Book{
    private static int book_count = 0;
    private int id;
    private String title;
    private String author;
    // private Date return_date;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.id = ++book_count; 
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public static int getNumberOfBooks(){
        return book_count;
    }

    public int getId(){
        return this.id;
    }

}