package lesson_08.lab_02;


import lesson_08.lab_02.entities.Student;
import lesson_08.lab_02.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            Student student = studentService.inputInfo(scanner);
            studentService.addStudent(student);
            System.out.print("Do you want to add another student? (Y/N)");
            String choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("N")){
                exit = true;
                break;
            }
        }
        studentService.displayAllStudents();
        studentService.calculateGradePercentage();
        scanner.close();
    }
}
