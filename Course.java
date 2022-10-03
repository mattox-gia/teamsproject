import java.io.Serializable;

public class Course implements Serializable, Cloneable {
    private String subject;
    private Teacher teacher;
    private int grade;
    private boolean current;

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }

   
}
