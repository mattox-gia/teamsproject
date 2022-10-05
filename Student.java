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
    name = n;
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

public Course getBestClass(){
 
    if(courses.size() == 0){
        return null;
    }
    Course c = courses.get(0);
    for(int i = 0; i<courses.size();i++){
        if( c.getGrade()<courses.get(i).getGrade()){
            c = courses.get(i);
        }
    }
    return c;
        
}
    
   
//for loop with courses and return one with highest grade}


public void removeCourse(Course c){
    courses.remove(c);
}

public void addCourse(Course c){
    courses.add(c);
}
public ArrayList<Course> getCourses(){
    return courses;
}

public String toString(){
    return "Name"+name+"\nGrade Level: "+gradeLevel+"\nGPA: "+gpa;
}

// public String addStudent(s){
//     System.out.println("Student Name: ");
//     students.add(s);
//     System.out.println("Grade Level: ")}

    
}



