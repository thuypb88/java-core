package lab_06.example_03.service;

import lab_06.example_03.entities.Rectangle;
import lab_06.example_03.entities.Square;

import java.util.Scanner;

public class SquareService extends ShapeService{
    public Square inputInfo(Scanner scanner){
        System.out.print("Side: ");
        int side = Integer.parseInt(scanner.nextLine());
        return new Square(side);
    }

    @Override
    public void calculatePer(Scanner scanner) {
        Square square = inputInfo(scanner);
        System.out.println("Perimeter of a Square: " + square.getSide() * 2);
    }

    @Override
    public void calculateArea(Scanner scanner) {
        Square square = inputInfo(scanner);
        System.out.println("Area of a Square: " + square.getSide() * square.getSide());
    }
}
