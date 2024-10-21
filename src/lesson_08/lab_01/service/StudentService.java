package lesson_08.lab_01.service;


import lesson_08.lab_01.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
    StudentService studentService;

    public Student inputInfo(Scanner scanner){
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student's address: ");
        String address = scanner.nextLine();
          return new Student(name,address);
  
    }

    public void displayInfo(Student student){
        System.out.println("======================");
        System.out.println("Student's Information:");
        System.out.println("Student's Id: " + student.getId());
        System.out.println("Student's name: " + student.getName());
        System.out.println("Student's address: " + student.getAddress());
     }
}

