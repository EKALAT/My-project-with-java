package Library_new10_4;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String bookID, String title, String author, String isbn, boolean available) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }
    public boolean checkAvailability(){
        return available;
    }
}
