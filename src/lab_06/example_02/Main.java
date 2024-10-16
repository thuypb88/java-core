package lab_06.example_02;

import lab_06.example_02.entities.Employee;
import lab_06.example_02.service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService eService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        Employee employee = eService.inputInfo(scanner);
        eService.displayInfo(employee);
    }
}
