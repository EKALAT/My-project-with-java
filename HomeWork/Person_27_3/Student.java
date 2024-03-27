package Person_27_3;
public class Student extends Person {

    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address, int numCourses) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses = new String[numCourses];
        this.grades = new int[numCourses];
    }

    public void addCourseGrade(String course, int grade) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                grades[i] = grade;
                return;
            }
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] != null) {
                System.out.println(courses[i] + ": " + grades[i]);
            }
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] != null) {
                sum += grades[i];
                count++;
            }
        }
        return (double) sum / count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", numCourses=" + numCourses +
                '}';
    }
}
