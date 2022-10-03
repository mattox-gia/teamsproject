import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gradeLevel;
    private ArrayList<Course> courses;
    

public Student(String name, int gradeLevel){
    name = name;
    gradeLevel = gradeLevel;
    courses = new ArrayList<>();
}

public String addStudent(s){
    System.out.println("Student Name: ");
    students.add(s);
    System.out.println("Grade Level: ")
    
}


}
