import java.io.Serializable;

public class Course implements Serializable, Cloneable {
    private String subject;
    private Teacher teacher;
    private int grade;
    private boolean current;

    public Course(String subject, Teacher teacher, int grade, boolean current){
        this.subject = subject;
        this.teacher = teacher;
        this.grade = grade;
        this.current = current;

    }
    
    public void setSubject(String s){
        subject = s;
    }

    public String getSubject(){
        return subject;
    }

    public void setTeacher(Teacher t){
        teacher = t;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setGrade(int g){
        grade = g;
    }

    public int getGrade(){
        return grade;
    }

    public String toString(){
        return subject+teacher+grade;
    }

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (Exception e) {
        }
        return null;
    }

   
}
