package lesson_09.oop_exam.service;


import lesson_09.oop_exam.entities.Product;
import lesson_09.oop_exam.entities.SalesPerson;
import lesson_09.oop_exam.entities.SalesRecord;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesRecordService {
    private static final int MAX_PRODUCTS = 5;
    ArrayList<SalesRecord> salesRecords = new ArrayList<>();
    ProductService productService = new ProductService();
    SalesPersonService salesPersonService = new SalesPersonService();
    ArrayList<SalesPerson> salesPeople = new ArrayList<>();


    public SalesRecord inputInfo(Scanner scanner) {
        ArrayList<Product> products = new ArrayList<>();
        System.out.println("Enter salesperson ID to create a sales record:");
        String employeeId = scanner.nextLine();
        SalesPerson salesPerson = checkSalesExists(employeeId);
        if (salesPerson == null) {
            return null; // Exit if the salesperson does not exist
        }
        SalesRecord existingRecord =  checkExistingSalesRecord(salesPerson.getId());
        if(existingRecord != null){
            System.out.println("Using existing sales record.");
            return existingRecord;
        }
        else {
            System.out.println("Enter product:");
            int count = 0;
            while (count < MAX_PRODUCTS) {
                Product product = productService.inputInfo(scanner);
                if (product == null) {
                    System.out.println("Failed to add product.");
                } else if (products.contains(product)) {
                    System.out.println("Product already added to this sales record.");
                } else {
                    products.add(product);
                    count++;
                    System.out.println("Added product to sales record: " + product.getName());
                }
                if (count < MAX_PRODUCTS) {
                    System.out.println("Do you want to add another product? (Y/N)");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
            System.out.println("Enter sale date:");
            String saleDate = scanner.nextLine();
            return new SalesRecord(salesPerson, products, saleDate);
        }
    }
    public void addSaleRecord(SalesRecord salesRecord) {
        salesRecords.add(salesRecord);
    }
    public SalesPerson findSalespersonById(String id) {
            for (SalesPerson sales : salesPeople) {
            if (sales.getId().equals(id)) {
                return sales;
            }
        }
        return null;
    }

    public SalesPerson checkSalesExists(String employeeId) {
        SalesPerson salesPerson = findSalespersonById(employeeId);
        if (salesPerson != null) {
            System.out.println("Salesperson found: " + salesPerson.getName());
        } else {
            System.out.println("Salesperson with ID " + employeeId + " does not exist in the system.");
        }
        return salesPerson;
    }

    public SalesRecord checkExistingSalesRecord(String employeeId) {
        SalesRecord existingRecord = findSalesRecordByEmployeeId(employeeId);
        if (existingRecord != null) {
            System.out.println("Sales record already exists for Salesperson ID: " + employeeId);
            System.out.println("Existing Sales Record: " + existingRecord);
        }
        return existingRecord; // Return the existing record if found, or null if not
    }
    private SalesRecord findSalesRecordByEmployeeId(String employeeId) {
            for (SalesRecord record : salesRecords) {
            if (record.getSalesPerson().getId().equals(employeeId)) {
                return record; // Return the sales record if a match is found
            }
        }
        return null; // Return null if no matching sales record is found
    }
    public void displaySaleRecords() {

        if (salesRecords.isEmpty()) {
            System.out.println("No sale record available.");
        } else {
            System.out.println("===================");
            System.out.println("Sale record List:");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = null;

            for (SalesRecord salesRecord : salesRecords) {
                System.out.println("Sale Person: " + salesRecord.getSalesPerson() +
                        ", Products: " + salesRecord.getProducts() +
                        ", Sale date: " + LocalDate.parse(salesRecord.getSaleDate(), formatter)) ;
                }
            }
    }

}
