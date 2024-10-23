package lesson_09.techmaster.service;

import lesson_09.techmaster.entities.Classroom;
import lesson_09.techmaster.entities.Techmaster;

import java.util.Scanner;

public class TechmasterService {
    ClassroomService classroomService = new ClassroomService();
    public Techmaster inputInfo(Scanner scanner){
        System.out.println("Enter manager: ");
        String manager = scanner.nextLine();
        System.out.println("Enter teacher: ");
        String teacher = scanner.nextLine();
        System.out.println("Enter classroom information");
        Classroom classroom = classroomService.inputInfo(scanner);
        return new Techmaster(manager, teacher, classroom);
    }
}
