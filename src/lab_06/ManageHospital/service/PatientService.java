package lab_06.ManageHospital.service;

import lab_06.ManageHospital.entities.Doctor;
import lab_06.ManageHospital.entities.Patient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PatientService {
    public Patient inputInfo(Scanner scanner){
        System.out.println("=========Enter patient's information=========");
        System.out.print("Enter patient's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient's age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter patient's medical record Id: ");
        int medRecordId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter patient's admissionDate: ");
        String admissionDate = scanner.nextLine();
        Patient patient = new Patient(name, age, medRecordId, admissionDate);
        return patient;
    }
    public void displayInfo(Patient patient){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = null;

        System.out.println("Patient Information:");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Medical record Id: " + patient.getMedRecordId());
        System.out.println("Admission Date: " + LocalDate.parse(patient.getAdmissionDate(), formatter) );
    }
}
