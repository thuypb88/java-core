package lab_06.ManageHospital;

import lab_06.ManageHospital.entities.Doctor;
import lab_06.ManageHospital.entities.Patient;
import lab_06.ManageHospital.service.DoctorService;
import lab_06.ManageHospital.service.PatientService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("\nHospital Management System");
            System.out.println("1. Add a Doctor");
            System.out.println("2. Add a Patient");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    DoctorService doctorService = new DoctorService();
                    Doctor doctor = doctorService.inputInfo(scanner);
                    doctorService.displayInfo(doctor);
                    break;
                case 2:
                    PatientService patientService = new PatientService();
                    Patient patient = patientService.inputInfo(scanner);
                    patientService.displayInfo(patient);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

     scanner.close();
    }
}
