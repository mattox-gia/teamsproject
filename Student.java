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
    if(courses.size() == 0){
        return 0;
    }
    
    double points = 0;
    for(int i=0;i<courses.size();i++){
        Course c = courses.get(i);
        int grade = c.getGrade();
        if(grade>=90){
            points+=4;
        }
        else if(grade>=80){
            points+=3;

        }
        else if(grade>=75){
            points+=2;
        }
        else if(grade>=70){
            points+=1;
        }

        
    }

    return gpa = points/courses.size();
    
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
    Course  c = getBestClass();
    if( c == null){
        return "Name: "+name+"\nGrade Level: "+gradeLevel+"\nGPA: "+calculateGPA();
    }else{
        return "Name: "+name+"\nGrade Level: "+gradeLevel+"\nGPA: "+calculateGPA() + " Best Class: "+c;
    }
}

// public String addStudent(s){
//     System.out.println("Student Name: ");
//     students.add(s);
//     System.out.println("Grade Level: ")}

    
}



