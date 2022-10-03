import java.io.Serializable;

public class Course implements Serializable, Cloneable {
    private String subject;
    private Teacher teacher;
    private int grade;
    private boolean current;

    public Course(String subject, String teacher, int grade, boolean current){
        subject = subject;
        teacher = teacher;
        grade = grade;
        current = current;

    }

    public toString(String subject, String teacher, int grade){
        return ...
    }

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }

   
}
