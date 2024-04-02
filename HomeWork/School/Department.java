package School;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Instructor> instructors;

    public Department(String name) {
        this.name = name;
        instructors = new ArrayList<>();
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("**Khoa:** " + name + "\n");
        sb.append("**Giảng viên:**\n");
        for (Instructor instructor : instructors) {
            sb.append(instructor + "\n");
        }
        return sb.toString();
    }
}