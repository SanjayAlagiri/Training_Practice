/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sanju
 */
public class Course_Module {

    private String Course_name;
    private int progres;

    Course_Module(String Course_name, int progres) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void setCourse_name(String Course_name) {
        this.Course_name = Course_name;
    }

    public void setProgres(int progres) {
        this.progres = progres;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public int getProgres() {
        return progres;
    }
    public static void display(){
        System.out.println(Course_name);
        System.out.println(progres);
    } 
    
}
