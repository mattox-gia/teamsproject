import java.io.Serializable;

public class Teacher implements Serializable {
    private String teacher_name;
    
    private int yearsOfExperience;


public Teacher(String teacher_name, int yearsOfExperience){
    this.teacher_name = teacher_name;
  
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

public String toString(){
    return "Name: "+teacher_name;
}

}
