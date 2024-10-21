package lesson_08.lab_03.service;

import lesson_08.lab_02.entities.Student;
import lesson_08.lab_03.entities.Worker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WorkerService {

    ArrayList<Worker> workerList = new ArrayList<>();
    ArrayList<String> salaryHistory = new ArrayList<>();
    WorkerService workerService;

    public Worker inputInfo(Scanner scanner){
        System.out.print("Enter Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age =  Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Salary: ");
        double salary =  Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Work location: ");
        String workLocation = scanner.nextLine();
        return new Worker(code, name, age, salary, workLocation);
    }
    public void addWorker(Worker worker) {
        workerList.add(worker);
    }
    public void displayAllWorkers() {
        if (workerList.isEmpty()) {
            System.out.println("No workers in the list.");
        } else {
            System.out.println("===================");
            System.out.println("List of workers:");
            for (Worker worker : workerList) {
                System.out.println("Code: " + worker.getCode() +
                        ", Name: " + worker.getName() +
                        ", Age: " + worker.getAge() +
                        ", Salary: " + String.format("%.2f", worker.getSalary())  +
                        ", Work Location: " + worker.getWorkLocation());
            }
        }
    }

    public Worker findWorkerByCode(String code){
        for(Worker worker : workerList){
            if(worker.getCode().equalsIgnoreCase(code)){
                return worker;
            }
        }
        return null;
    }

    public void updateSalary(String code, double newSalary, String status){
        Worker worker = findWorkerByCode(code);
        if(worker != null){
            worker.setSalary(newSalary);

            String history = String.format()
        }
    }

    public String getCurrentDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
    }

}
