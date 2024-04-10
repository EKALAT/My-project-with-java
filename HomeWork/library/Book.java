package library;

public class

Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getBookId() {
        return bookId;
    }

    public boolean checkAvailability() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
