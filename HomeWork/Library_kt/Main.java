package Library_kt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID = ");
        String bookID = scanner.nextLine();
        System.out.println("Enter book title = ");
        String title = scanner.nextLine();
        System.out.println("Enter book author =");
        String author = scanner.nextLine();
        boolean available = true;
        Book abook = new Book(bookID, title, author, available);
        Member member1 = new Member("111", "KOUNG", "koong1234@gmail.com");
        member1.borrowBook(abook);
        member1.returnBook(abook);
        System.out.println(abook);
        scanner.close();
    }
}
