package lesson_09.oop_exam.view;


import lesson_09.oop_exam.entities.Product;
import lesson_09.oop_exam.entities.SalesPerson;
import lesson_09.oop_exam.entities.SalesRecord;
import lesson_09.oop_exam.service.ProductService;
import lesson_09.oop_exam.service.SalesPersonService;
import lesson_09.oop_exam.service.SalesRecordService;

import java.util.Scanner;

public class Menu {
    ProductService productService = new ProductService();
    SalesPersonService salespersonService = new SalesPersonService();
    SalesRecordService salesRecordService = new SalesRecordService();

    public void displayMenu(Scanner scanner){
        System.out.println("===================");
        System.out.println("Menu");
        System.out.println("1. Add new product");
        System.out.println("2. Add new salesperson");
        System.out.println("3. Create sales record for salesperson");
        System.out.println("6. Sort sales records by salesperson name");
        System.out.println("7. Sort sales records by product category");
        System.out.println("8. Calculate revenue for each salesperson");
        System.out.println("9. Exit");
        System.out.println("Please choose an option: ");
        selectMenu(scanner);
    }
    public void selectMenu(Scanner scanner){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Product product = productService.inputInfo(scanner);
                productService.addProduct(product);
                productService.displayProducts();
                break;
            case 2:
                SalesPerson salesPerson = salespersonService.inputInfo(scanner);
                salespersonService.addSalesperson(salesPerson);
                salespersonService.displaySales();
                break;

            case 3:
                SalesRecord salesRecord = salesRecordService.inputInfo(scanner);
                salesRecordService.addSaleRecord(salesRecord);
                salesRecordService.displaySaleRecords();
                break;
            case 4:

                break;
            case 5:

                break;
            case 7:

                break;
            case 9:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                displayMenu(scanner);

        }
    }
}
