package library;

public class Book {
    private String bookID;
    private String title;
    private String author;
    boolean available;

    public Book(String bookID, String title, String author, boolean available) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean checkAvailability(){
        return available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "BookID='" + bookID + '\'' + "\n" +
                "Title='" + title + '\'' + "\n" +
                "Author='" + author + '\'' + "\n" +
                "Available=" + available;
    }
}
