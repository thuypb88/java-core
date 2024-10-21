package lesson_08.lab_03;


import lesson_06.ManageHospital.entities.Doctor;
import lesson_06.ManageHospital.entities.Patient;
import lesson_06.ManageHospital.service.DoctorService;
import lesson_06.ManageHospital.service.PatientService;
import lesson_08.lab_03.entities.Worker;
import lesson_08.lab_03.service.WorkerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerService workerService = new WorkerService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("======= Worker Management ========");
            System.out.println("1. Add Worker");
            System.out.println("2. Up Salary");
            System.out.println("3. Down Salary");
            System.out.println("4. Display Information Salary");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine()) ;

            switch (choice){
                case 1:
                    Worker worker = workerService.inputInfo(scanner);
                    workerService.addWorker(worker);
                    workerService.displayAllWorkers();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
