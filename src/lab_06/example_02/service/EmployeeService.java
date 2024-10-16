package lab_06.example_02.service;

import lab_06.example_02.entities.Employee;

import java.util.Scanner;

public class EmployeeService {
    public Employee inputInfo(Scanner scanner){
        System.out.print("Moi ban nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Moi ban nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Moi ban nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Moi ban nhap noi lam viec: ");
        String placeWork = scanner.nextLine();
        System.out.print("Moi ban nhap so nam kinh nghiem: ");
        double exp = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, address, placeWork, exp);
        return employee;
    }
    public void displayInfo(Employee employee){
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
        System.out.println(employee.getPlaceWork());
        System.out.println(employee.getExp());

    }
}
