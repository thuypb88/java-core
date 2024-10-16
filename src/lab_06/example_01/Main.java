package lab_06.example_01;

import lab_06.example_01.entities.Product;
import lab_06.example_01.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        Product product = productService.inputInfo(scanner);
        System.out.println(product);
        productService.calculateVAT(product.getPrice());
    }
}
