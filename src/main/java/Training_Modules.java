
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sanju
 */
class Standard(){
    public static void welcome() {
         System.out.println("Welcome to java mini project");
         System.out.println("Basic Employee Training Modules");
         System.out.println(" ");
    }

    public static void intro() {
         System.out.println("1. To create a new course and add contents");
         System.out.println("2.Show the overall progression employees");
         System.out.println("3. To get the employee access and view course materials");
         System.out.println("4. Exit");
    }
}

class create_Modules(){
    Public static void addCourse(){
        Scanner sc = new Scanner(System.in);
        
        String Course_name;
        int progres;
        System.out.println("Enter the course name");
        Course_name = sc.nextLine();
        System.out.println("Enter the Progres");
        progres = sc.nextInt();
        
        Course_Module courses = new Course_Module(Course_name, progres);
        
        
    }
}
    
class Course_Topics (){
    addTopics(){
        
    }
}
public class Training_Modules {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Course_Module> courseList = new ArrayList<Course_Module>;
            boolean loop = true;
            int input = 0;

            Standard.welcome();
            while (loop) {
                Standard.intro();
                input = sc.nextInt();
                switch (input){
                case 1:
                        create_Modules.addCourse(courseList);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        loop = false;
                        break;
                }
            }
        }
    }
