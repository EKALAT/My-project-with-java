package School;

public class Main {

    public static void main(String[] args) {
        // Tạo trường học
        School school = new School("Trường Đại học ABC", "123 Đường XYZ", "0123456789");

        // Tạo khoa
        Department khoaCNTT = new Department("Công nghệ thông tin");
        Department khoaQTKD = new Department("Quản trị kinh doanh");

        // Tạo giảng viên
        Instructor giangVien1 = new Instructor("Nguyễn Văn A", khoaCNTT);
        Instructor giangVien2 = new Instructor("Trần Thị B", khoaQTKD);

        // Tạo khóa học
        Course monHocLapTrinh = new Course("Lập trình Java", "CNTT101", khoaCNTT);
        Course monHocQuanTriDuAn = new Course("Quản trị dự án", "QTKD202", khoaQTKD);

        // Gán giảng viên cho khóa học
        monHocLapTrinh.addInstructor(giangVien1);
        monHocQuanTriDuAn.addInstructor(giangVien2);

        // Tạo sinh viên
        Student sinhVien1 = new Student("Lê Văn C", "SV12345", khoaCNTT);
        Student sinhVien2 = new Student("Đặng Thị D", "SV54321", khoaQTKD);

        // Cho sinh viên đăng ký khóa học
        sinhVien1.enroll(monHocLapTrinh);
        sinhVien1.enroll(monHocQuanTriDuAn);
        sinhVien2.enroll(monHocLapTrinh);

        // In thông tin trường học
        System.out.println(school);

        // Ví dụ sử dụng chức năng chuyển đổi tín chỉ
        sinhVien1.transferCredits(monHocLapTrinh, monHocQuanTriDuAn);

        // In thông tin sinh viên sau khi chuyển đổi tín chỉ
        System.out.println(sinhVien1);
    }
}