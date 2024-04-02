package School;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private String phone_number;
    private List<Student> students;
    private List<Department> departments;

    public School(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.students = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}