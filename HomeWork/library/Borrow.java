package library;

import java.time.LocalDate;

public class Borrow {
    private String borrowId;
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Borrow(String borrowId, Book book, Member member, LocalDate borrowDate, LocalDate returnDate) {
        this.borrowId = borrowId;
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public boolean isOverdue() {
        LocalDate today = LocalDate.now();
        return today.isAfter(returnDate);
    }
}
