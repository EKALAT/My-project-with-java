package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input book information from the user
        System.out.println("Enter book ID:");
        String bookID = scanner.nextLine();

        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter book author:");
        String author = scanner.nextLine();

        // Assume initially the book is available
        boolean available = true;

        Book abook = new Book(bookID, title, author, available);
        Member member1 = new Member("111", "KOUNG", "koong1234@gmail.com");

        member1.borrowBook(abook);
        member1.returnBook(abook);

        // Output information about the book
//        System.out.println("Book ID: " + abook.getBookID());
//        System.out.println("Book Title: " + abook.getTitle());
//        System.out.println("Book Author: " + abook.getAuthor());
//        System.out.println("Book Availability: " + abook.isAvailable());
        System.out.println(abook.toString());

        // Close the scanner
        scanner.close();
    }
}
