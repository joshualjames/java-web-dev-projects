import java.util.ArrayList;

public class Course {
    private String subject;
    private String instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String subject, String instructor, ArrayList<Student> enrolledStudents) {
        this.subject = subject;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }
}
