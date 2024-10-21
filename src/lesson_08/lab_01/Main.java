package lesson_08.lab_01;

import lesson_08.lab_01.entities.Student;
import lesson_08.lab_01.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        ArrayList<Student> students = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            Student student = studentService.inputInfo(scanner);
            students.add(student);
            System.out.println("Do you want to add another student? (Y/N)");
            String choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("N")){
                exit = true;
                break;
            }
        }
        scanner.close();
        System.out.println(students);
    }

}
