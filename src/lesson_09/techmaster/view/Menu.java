package lesson_09.techmaster.view;

import lesson_09.techmaster.entities.Student;
import lesson_09.techmaster.entities.Techmaster;
import lesson_09.techmaster.service.StudentService;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void displayMenu(Scanner scanner, Techmaster techmaster){
        System.out.println("1 - Display the detailed information of the center");
        System.out.println("2 - Add student");
        System.out.println("3 - Update the classify of a student");
        System.out.println("4 - Delete a student");
        System.out.println("5 - Exist");
        System.out.println("Please choose an option: ");
        selectMenu(scanner, techmaster);
    }

    public void selectMenu(Scanner scanner, Techmaster techmaster){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println(techmaster);
                break;
            case 2:
                Student student = studentService.inputInfo(scanner);
                techmaster.getClassroom().getStudents().add(student);
                break;
            case 3:
                studentService.updateClassify(scanner,
                        techmaster);
                break;
            case 4:
                studentService.deleteStudent(scanner,techmaster);
                break;
            default:
                System.exit(0);

        }
    }
}
