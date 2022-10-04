import java.io.Serializable;

public class Teacher implements Serializable {
    private String teacher_name;
    private String subject;
    private int yearsOfExperience;


public Teacher(String teacher_name, String subject, int yearsOfExperience){
    this.teacher_name = teacher_name;
    this.subject = subject;
    this.yearsOfExperience = yearsOfExperience;
}

public void setTeacherName(String t){
     teacher_name = t;
}

public String getTeacherName(){
    return teacher_name;
}

public void setYearsOfExp(int y){
    yearsOfExperience = y;
}

public int getYearsOfExp(){
    return yearsOfExperience;
}

public void addCourse(String course){
    System.out.print("add course");
}

public void removeCourse(String course){
    System.out.print("remove course");
}

}
