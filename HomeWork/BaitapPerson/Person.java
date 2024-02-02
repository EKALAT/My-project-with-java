package BaitapPerson;
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
        System.out.println("Dia chi: " + getAddress());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ekalat", 20, "Khammouane");
        p1.display();
        Person p2 = new Person("Dung", 20, "Dong Hoi");
        p2.display();
        Person p3 = new Person("Long", 20, "Dong Hoi");
        p3.display();
    }
}
