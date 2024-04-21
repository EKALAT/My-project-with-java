package Library_kt;

public class Book {
    private String bookID;
    private String title;
    private String author;
    boolean available;

    public Book(String bookID, String title, String author, boolean available) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.available = available;
    }
    public String getBookID(){
        return this.bookID;
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
    public boolean checkAvailability(){
        return this.available;
    }
    public boolean isAvailable(){
        return this.available;
    }

    @Override
    public String toString() {
        return "BookID='" + this.bookID + "'\nTitle='" + this.title + "'\nAuthor ='" + this.author +
                "' \nAvailable =" + this.available;
    }
}
