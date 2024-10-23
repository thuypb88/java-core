package lesson_09.techmaster.service;

import lesson_09.techmaster.entities.Classroom;
import lesson_09.techmaster.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomService {
    StudentService studentService = new StudentService();
    public Classroom inputInfo(Scanner scanner){
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.println("Enter student: ");
        while (true){
            Student student = studentService.inputInfo(scanner);
            students.add(student);
            System.out.println("Do you want to add another student? (Y/N)");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N"))
                break;
        }
        Classroom classroom = new Classroom(subject, students);
        return classroom;

    }
}
