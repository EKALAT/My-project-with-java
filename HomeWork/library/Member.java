package library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> booksBorrowed;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.booksBorrowed = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        booksBorrowed.add(book);
    }

    public void returnBook(Book book) {
        booksBorrowed.remove(book);
    }
}
