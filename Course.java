import java.io.Serializable;

public class Course implements Serializable, Cloneable {
    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }
}
