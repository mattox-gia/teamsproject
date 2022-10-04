import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("students");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }


        //############## MAIN MENU STARTS HERE ##############
        int ans = 0;

        
        while(ans != -1){
            System.out.println("1.) Add Student");
            System.out.println("2.) Add Teacher");
            System.out.println("3.) Add Course");
            System.out.println("4.) Edit Student"); //sub choices
            System.out.println("5.) List Students");
            System.out.println("6.) List Courses");
            System.out.println("7.) Search for Student");
            System.out.println("0.) Exit");
            System.out.println();
            System.out.println("Choice: ");
            ans = sc.nextInt();
            sc.nextLine();

            if(ans == 1){
                System.out.println("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Grade Level: ");
                int gradeLevel = sc.nextInt();
                
                Student s = new Student(name, gradeLevel);
                students.add(s);


            }
            else if(ans == 2){ //adding teacher
                System.out.println("Enter Teacher Name: ");
                String teacherName = sc.nextLine();
                System.out.println("Enter years of experience: ");
                int yearsOfExperience = sc.nextInt();
                System.out.println("Enter subject: ");
                String subject = sc.nextLine();

                for(int i=0; i< teachers.size();i++){
                    System.out.print(i+" "+teachers.get(i));
                }

                System.out.println("Choice:");
                int choice = sc.nextInt();
                sc.nextLine();

                if(choice > -1 && choice < teachers.size()){
                    Teacher t = teachers.get(choice);
                    Course c = new Course(subject);
                    courses.add(c);
                }

                
            }
            else if(ans == 3){ // adding course
                System.out.println("add course");
            }
            else if(ans == 4){
                System.out.println("edit student"); 
         

                    System.out.println(" 1. Add Course");
                    System.out.println("2. Remove Course");
                    System.out.println("3. Modify name");
                    System.out.print(" 4. Modify grade level");
                    System.out.println("edit student"); 
                System.out.println("Pick a Class");
                //IF CHOOSES OPTION 1 and have a thing that asks for their option and scans it
                listCourses();
                System.out.println();
                ans = sc.nextInt();
                sc.NextLine();
                if(ans > -1 && ans < courses.size()){
                    Course c = courses.get(ans).clone();
                    System.out.println("Enter grade for the course:");
                    int grade = sc.nextInt();
                    c.setGrade(grade);
                    sc.nextLine();
                    System.out.println("Currently taking it (y/n)?");
                    String yesNo = sc.nextLine();
                    if(yesNo.equals("y")){
                        c.setCurrent(current: true);
                    }
                    student.addCourse(c);

                if(ans == 1){
                    System.out.print("adding cvourse to individual student");
                }
                    for(int i=0; i< teachers.size();i++){
                        System.out.print(i+" "+teachers.get(i));
                    }
    
                    System.out.println("Choice:");
                    int choice = sc.nextInt();
                    sc.nextLine();
                        Student s = students.get(choice);
                }
            }
            else if(ans == 5){ //list students
                System.out.print(students);
            }
            else if(ans == 6){ //list courses
                System.out.println("list courses");
            }
            else if(ans == 7){
                System.out.println("Search Student");
            }
            else if(ans == 0){
                System.out.println("exit");
            }
            
        }
        

    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData()throws Exception{
        FileOutputStream f1 = new FileOutputStream("students");
        ObjectOutputStream os = new ObjectOutputStream(f1);
        os.writeObject(students);
        os.close();
        f1.close();

        FileOutputStream f2 = new FileOutputStream("courses");
        os = new ObjectOutputStream(f2);
        os.writeObject(courses);
        os.close();
        f2.close();

        FileOutputStream f3 = new FileOutputStream("teachers");
        os = new ObjectOutputStream(f3);
        os.writeObject(teachers);
        os.close();
        f3.close();
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception{
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new  ObjectInputStream(fis);   
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }
}