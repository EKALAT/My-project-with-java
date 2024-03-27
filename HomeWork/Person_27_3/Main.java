package Person_27_3;

public class Main {

    public static void main(String[] args) {

        // Tạo một sinh viên
        Student student1 = new Student("Ekalat", "Laos , Khammouane , TP.Thakhek", 3);
        student1.addCourseGrade("Toán", 9);
        student1.addCourseGrade("Lý", 8);
        student1.addCourseGrade("Hóa", 7);

        // Tạo một giáo viên
        Teacher teacher1 = new Teacher("Nguyễn Thị Lan", "456 Lê Lợi", 2);
        teacher1.addCourse("Toán");
        teacher1.addCourse("Lý");

        // Tạo thêm một giáo viên
        Teacher teacher2 = new Teacher("Trần Thị Mai", "123 Nguyễn Trãi", 2);
        teacher2.addCourse("Toán");
        teacher2.addCourse("Tin học");

        // In thông tin sinh viên
        System.out.println("**Thông tin sinh viên:**");
        student1.printInfo();

        // In điểm của sinh viên
        System.out.println("\n**Điểm của sinh viên:**");
        student1.printGrades();

        // In thông tin giáo viên
        System.out.println("\n**Thông tin giáo viên 1:**");
        teacher1.printInfo();

        // In thông tin giáo viên mới
        System.out.println("\n**Thông tin giáo viên 2:**");
        teacher2.printInfo();
    }
}