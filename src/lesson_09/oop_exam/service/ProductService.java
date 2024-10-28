package lesson_09.oop_exam.service;

import lesson_08.lab_03.entities.Worker;
import lesson_09.oop_exam.entities.Product;
import lesson_09.oop_exam.entities.Category;

import java.util.Scanner;
import java.util.ArrayList;

public class ProductService {
    ArrayList<ProductService> productServices = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();

    public Product inputInfo(Scanner scanner) {

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product category (ELECTRONICS, HOME_APPLIANCE, COMPUTER, OFFICE_SUPPLIES): ");
        Category category = getCategoryFromInput(scanner);

        System.out.print("Enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter product quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        return new Product(name, category, price, quantity);

    }

    private Category getCategoryFromInput(Scanner scanner) {
        Category category = null;
        while (category == null) {
            try {
                String categoryInput = scanner.nextLine().toUpperCase();
                category = Category.valueOf(categoryInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid category. Please enter one of the following: ELECTRONICS, HOME_APPLIANCE, COMPUTER, OFFICE_SUPPLIES.");
                System.out.println("Enter product category again: ");
            }
        }
        return category;
    }


    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No product available.");
        } else {
            System.out.println("===================");
            System.out.println("Product List:");
            for (Product product : products) {
                System.out.println("ProductId: " + product.getProductId() +
                        ", Name: " + product.getName() +
                        ", Category: " + product.getCategory() +
                        ", Price: " + String.format("%.2f", product.getPrice())  +
                        ", Quantity: " + product.getQuantity());
            }
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
