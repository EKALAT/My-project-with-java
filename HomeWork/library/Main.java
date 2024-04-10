package library;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("1", "Java Programming", "John Smith", "1234567890");
        Book book2 = new Book("2", "Python Basics", "Alice Johnson", "0987654321");

        // Creating members
        Member member1 = new Member("M1", "Jane Doe", "jane@example.com");
        Member member2 = new Member("M2", "Bob Smith", "bob@example.com");

        // Creating library
        Library library = new Library();

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Registering members to the library
        library.registerMember(member1);
        library.registerMember(member2);

        // Borrowing books
        library.borrowBook("1", "M1");
        library.borrowBook("2", "M2");

        // Returning books
        library.returnBook("1", "M1");
        library.returnBook("2", "M2");

        // Example of overdue book
        Book overdueBook = new Book("3", "Overdue Book", "Unknown Author", "9999999999");
        library.addBook(overdueBook);
        library.registerMember(member1);
        library.borrowBook("3", "M1");

        // Check if the book is overdue
        Borrow borrow = new Borrow("B1", overdueBook, member1, LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));
        if (borrow.isOverdue()) {
            System.out.println("The book is overdue!");
        } else {
            System.out.println("The book is not overdue.");
        }
    }
}
