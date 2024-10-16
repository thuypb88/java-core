package lab_06.example_03.service;

import lab_06.example_03.entities.Rectangle;

import java.util.Scanner;

public class RectangleService extends ShapeService{
    public Rectangle inputInfo(Scanner scanner){
        System.out.print("Length: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Width: ");
        int width = Integer.parseInt(scanner.nextLine());
        return new Rectangle(length, width);
    }

    @Override
    public void calculatePer(Scanner scanner) {
        Rectangle rectangle = inputInfo(scanner);
        System.out.println("Perimeter of a Rectangle: " + (rectangle.getLength() + rectangle.getLength()) * 2);
    }

    @Override
    public void calculateArea(Scanner scanner) {
        Rectangle rectangle = inputInfo(scanner);
        System.out.println("Area of a Rectangle: " + rectangle.getLength() * rectangle.getWidth());
    }
}
