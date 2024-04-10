package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void borrowBook(String bookId, String memberId) {
        Book bookToBorrow = null;
        Member borrowingMember = null;

        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                bookToBorrow = book;
                break;
            }
        }

        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                borrowingMember = member;
                break;
            }
        }

        if (bookToBorrow != null && borrowingMember != null && bookToBorrow.checkAvailability()) {
            borrowingMember.borrowBook(bookToBorrow);
            bookToBorrow.setAvailable(false);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available for borrowing or member not found.");
        }
    }

    public void returnBook(String bookId, String memberId) {
        Book bookToReturn = null;
        Member returningMember = null;

        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                bookToReturn = book;
                break;
            }
        }

        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                returningMember = member;
                break;
            }
        }

        if (bookToReturn != null && returningMember != null) {
            returningMember.returnBook(bookToReturn);
            bookToReturn.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book or member not found.");
        }
    }
}
