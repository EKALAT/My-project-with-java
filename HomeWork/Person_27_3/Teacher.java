package Person_27_3;

public class Teacher extends Person {

    private String[] courses;
    private int numCourses;

    public Teacher(String name, String address, int numCourses) {
        super(name, address);
        this.courses = new String[numCourses];
        this.numCourses = numCourses;
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return true;
            }
        }
        return false;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] != null && courses[i].equals(course)) {
                courses[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", numCourses=" + numCourses +
                '}';
    }
}

