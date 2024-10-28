package lesson_09.oop_exam.service;

import lesson_09.oop_exam.entities.Product;
import lesson_09.oop_exam.entities.SalesPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesPersonService {
    ArrayList<SalesPerson> salespeople = new ArrayList<>();
    ArrayList<SalesPersonService> SalesPersonService = new ArrayList<>();

    public SalesPerson inputInfo(Scanner scanner) {
        System.out.println("Enter sales name: ");
        String name = scanner.nextLine();

        System.out.println("Enter sales address: ");
        String address = scanner.nextLine();

        System.out.println("Enter sale phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter sales contract date: ");
        String contractDate = scanner.nextLine();
        // Create and add the new Salesperson
        return new SalesPerson(name, address, phoneNumber, contractDate);
    }
    public void addSalesperson(SalesPerson salesperson) {
        salespeople.add(salesperson);
    }
    public ArrayList<SalesPerson> getSalespeople() {
        return salespeople;
    }
    public void displaySales() {
        if (salespeople.isEmpty()) {
            System.out.println("No sale available.");
        } else {
            System.out.println("===================");
            System.out.println("Sales List:");
            for (SalesPerson salesPerson : salespeople) {
                System.out.println("EmployeeId: " + salesPerson.getId() +
                        ", Name: " + salesPerson.getName() +
                        ", Address: " + salesPerson.getAddress() +
                        ", Phone: " + salesPerson.getPhone()  +
                        ", Contract Date: " + salesPerson.getContractDate());
            }
        }
    }
}
