package lab_06.example_01.service;

import lab_06.example_01.entities.Product;

import java.util.Scanner;

public class ProductService {
    public Product inputInfo(Scanner scanner){
        System.out.print("Moi ban nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Moi ban nhap gia sp: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Moi ban nhap ID sp: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return  product;
    }

    public void calculateVAT(double price){
        double vat = 0.1 * price;
        System.out.println("Thue sp cua ban la: " + vat);
    }
}
