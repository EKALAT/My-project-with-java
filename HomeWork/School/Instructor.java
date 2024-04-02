package School;

public class Instructor {

    private String name;
    private Department department;

    public Instructor(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return " - Giảng viên: " + name + " (" + department.getName() + ")";
    }
}