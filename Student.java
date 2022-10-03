import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gradeLevel;
    private ArrayList<Course>courses;
    courses = new ArrayList<>();

public Student(String name, int gradeLevel, ArrayList<Course> courses){
    this.name = name;
    this.gradeLevel = gradeLevel;
    this.courses = courses;
}

public String addStudent(s){
    System.out.println("Student Name: ");
    students.add(s);
    System.out.println("Grade Level: ")
    
}


}
