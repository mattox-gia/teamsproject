import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int gradeLevel;
    private ArrayList<Course> courses;
    private double gpa;
    

public Student(String name, int gradeLevel){
    this.name = name;
    this.gradeLevel = gradeLevel;
    courses = new ArrayList<>();
}

public void setName(String n){
    System.out.println("y");
}

public String getName(){
    return name;
}

public void setGradeLevel(int g){
    gradeLevel = g;
}

public int getGradeLevel(){
    return gradeLevel;
}

public double calculateGPA(){
    return gpa;
}

public String getBestClass(){
    return "y";
}

public void addCourse(String c){
    System.out.println("y");
}

public void removeCourse(String c){
    System.out.println("y");
}

public String toString(){
    return "Name"+name+"\nGrade Level: "+gradeLevel+"\nGPA: "+gpa;
}

// public String addStudent(s){
//     System.out.println("Student Name: ");
//     students.add(s);
//     System.out.println("Grade Level: ")}

    
}



