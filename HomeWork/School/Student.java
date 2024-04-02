package School;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String studentID;
    private Department department;
    private List<Course> enrolledCourses;

    public Student(String name, String studentID, Department department) {
        this.name = name;
        this.studentID = studentID;
        this.department = department;
        enrolledCourses = new ArrayList<>();
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }

    public void transferCredits(Course fromCourse, Course toCourse) {
        // Logic for transferring credits between courses
        // ...
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("**Sinh viên:** " + name + "\n");
        sb.append("Mã số sinh viên: " + studentID + "\n");
        sb.append("Khoa: " + department.getName() + "\n");
        sb.append("**Khóa học đã đăng ký:**\n");
        for (Course course : enrolledCourses) {
            sb.append(course + "\n");
        }
        return sb.toString();
    }
}