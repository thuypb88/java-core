package lab_06.ManageHospital.service;

import lab_06.ManageHospital.entities.Doctor;
import lab_06.example_02.entities.Employee;

import java.util.Scanner;

public class DoctorService {
    public Doctor inputInfo(Scanner scanner){
        System.out.println("=========Enter doctor's information=========");
        System.out.print("Enter doctor's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter doctor's age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter doctor's medical specialty: ");
        String medSpecialty = scanner.nextLine();
        System.out.print("Enter doctor's working hours: ");
        double workingHours = Double.parseDouble(scanner.nextLine());
        Doctor doctor = new Doctor(name, age, medSpecialty, workingHours);
        return doctor;
    }
    public void displayInfo(Doctor doctor){
        System.out.println("======================");
        System.out.println("Doctors Information:");
        System.out.println("Doctor's name: " + doctor.getName());
        System.out.println("Doctor's age: " + doctor.getAge());
        System.out.println("Doctor's medical specialty: " + doctor.getMedSpecialty());
        System.out.println("Doctor's working hours: " + doctor.getWorkingHours());
    }
}
