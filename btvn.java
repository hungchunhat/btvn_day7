package day7;

import java.util.ArrayList;

abstract class Student{
    String studentId;
    String name;
    String age;
    public abstract float calculateGPA();
}
class UStudent extends Student{
    String major;
    @Override
    public float calculateGPA() {
        return 3.2f;
    }
}
class GStudent extends Student{
    String researchTopic;
    @Override
    public float calculateGPA() {
        return 3.5f;
    }
}
class IStudent extends Student{
    String country;
    @Override
    public float calculateGPA() {
        return 3.0f;
    }
}
class University{
    private ArrayList<Student> students;
    public void addStudent(Student s){
        students.add(s);
    }
    public void displayAll(){
        for(Student s: students){
            System.out.println("ID: " + s.studentId);
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("GPA: " + s.calculateGPA());
        }
    }
}
public class btvn {
    public static void main(String[] args) {
    }
}
