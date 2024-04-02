package School;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String courseID;
    private Department department;
    private List<Instructor> instructors;
    private List<Student> students;

    public Course(String name, String courseID, Department department) {
        this.name = name;
        this.courseID = courseID;
        this.department = department;
        instructors = new ArrayList<>();
        students = new ArrayList<>();
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("**Khóa học:** " + name + "\n");
        sb.append("Mã số khóa học: " + courseID + "\n");
        sb.append("Khoa: " + department.getName() + "\n");
        sb.append("**Giảng viên:**\n");
        for (Instructor instructor : instructors) {
            sb.append(instructor + "\n");
        }
        sb.append("**Sinh viên:**\n");
        for (Student student : students) {
            sb.append(student + "\n");
        }
        return sb.toString();
    }
}
