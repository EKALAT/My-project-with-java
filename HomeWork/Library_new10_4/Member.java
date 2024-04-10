package Library_new10_4;

public class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> booksBorrowed;

    public Member(String memberId, String name, String email, List<Book> booksBorrowed) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.booksBorrowed = booksBorrowed;
    }
    public boolean borrowBook(Book book){
        return borrowBook;
    }
    public void returnBook(Book book){
        return returnBook;
    }
}
