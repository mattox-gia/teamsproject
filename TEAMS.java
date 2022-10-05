import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS {
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
        int ans = -1;

        
        while(ans != 0){
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
                sc.nextLine();
                
                Teacher t = new Teacher(teacherName, yearsOfExperience);
                teachers.add(t);



                
            }
            else if(ans == 3){ // adding course
                System.out.println("What subject: ");
                String subject = sc.nextLine();
                System.out.println("Pick a teacher: ");
                for(int i=0; i< teachers.size();i++){
                    System.out.println(i+" "+teachers.get(i));
                }
                System.out.println("Choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                if(choice > -1 && choice < teachers.size()){
                    Teacher t = teachers.get(choice);
                    Course c = new Course(subject, t);
                    courses.add(c);
                }

                

            }
            else if(ans == 4){
                System.out.println("edit student"); 
                for (int i =0; i<students.size(); i++){
                    System.out.println(i+" "+students.get(i));
                }
                System.out.println("Choice: 1");
                int choice = sc.nextInt();
                sc.nextLine();
                Student student = students.get(choice);

                System.out.println(" 1. Add Course");
                System.out.println("2. Remove Course");
                System.out.println("3. Modify name");
                System.out.print(" 4. Modify grade level");
                    
                    int a = sc.nextInt();
                    sc.nextLine();
                if(a == 1){
                    System.out.println("Pick a Class");
                    for (int i =0; i<courses.size(); i++){
                        System.out.println(i+" "+courses.get(i));}                
                    System.out.println();
                    choice = sc.nextInt();
                    sc.nextLine();
                    
                    if(choice > -1 && choice < courses.size()){
                        Course c = courses.get(choice).clone();
                        System.out.println("Enter grade for the course:");
                        int grade = sc.nextInt();
                        c.setGrade(grade);
                        sc.nextLine();
                        System.out.println("Currently taking it (y/n)?");
                        String yesNo = sc.nextLine();
                        if(yesNo.equals("y")){
                            c.setCurrent(true);
                        }
                        student.addCourse(c);
                    }


                }else if(a == 2){
                
                    ArrayList<Course> courses = student.getCourses();
                    System.out.println("Choose course: ");
                    for(int i = 0; i<courses.size();i++){
                        System.out.println(i+" "+courses.get(i));
                    }
                    System.out.println("Choice: ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    Course c = courses.get(choice);
                    student.removeCourse(c);
                    
                }else if(a == 3){
                    System.out.println("New name: ");
                    String name = sc.nextLine();
                    
                    student.setName(name);

                }else if (a == 4){
                    System.out.println("New grade level: ");
                    int grade = sc.nextInt();
                    sc.nextLine();

                    student.setGradeLevel(grade);

                }
            }else if(ans == 5){ //list students

                for(int i = 0; i<students.size();i++){
                    System.out.println(i+" "+students.get(i));
                }
            }

            else if(ans == 6){ //list courses
                
                for (int i =0; i<courses.size(); i++){
                    System.out.println(i+" "+courses.get(i));
                }
            }
            else if(ans == 7){ //search for student
                boolean studentFound =false;
                System.out.print("Enter Student Name: ");
                String st = sc.nextLine();
                for(int i = 0; i<students.size();i++){
                    Student student = students.get(i);
                    if(student.getName().equals(st)){
                        System.out.println(student);
                        studentFound =true;
                    }
                    

                }

                if(!studentFound){
                    System.out.println("No Student Found");
                }
            }
            else if(ans == 0){ //exit
                if(ans ==0){
                    try{
                        saveData();
                    }
                    catch(Exception e){

                    }
                }
                
                }
            }
            
            
        }
        

    

    // #### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData() throws Exception {
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

    // #### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception {
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }
}