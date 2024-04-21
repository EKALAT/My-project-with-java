package Library_kt;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberID;
    private String name;
    private String email;
    private List<Book>booksBorrowed;

    public Member(String memberID, String name, String email) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.booksBorrowed = new ArrayList<>();
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean borrowBook(Book book){
        if(book.checkAvailability()){
            book.available = false;
            this.booksBorrowed.add(book);
            System.out.println("Muon sach thanh cong");
            return true;
        }else{
            System.out.println("Muon sach ko thanh cong");
            return false;
        }
    }
    public void returnBook(Book book){
        book.available = true;
        this.booksBorrowed.remove(book);
        System.out.println("Tra sach thanh cong");
    }
}
