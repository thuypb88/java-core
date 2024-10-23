package lesson_09.oop_exam.view;


import java.util.Scanner;

public class Menu {
    public void displayMenu(Scanner scanner){
        System.out.println("1 - Add new product");
        System.out.println("2 - Display all products");
        System.out.println("3 - Add new sales person");
        System.out.println("4 - Display all sales people");
        System.out.println("5 - Add new sales list");
        System.out.println("6 - Display all sales list");
        System.out.println("7 - Sort sales list by sales person");
        System.out.println("8 - Sort sales list by product category");
        System.out.println("9 - Display revenue for each sales person");
        System.out.println("10 - Exist");
        System.out.println("Please choose an option: ");
        selectMenu(scanner);
    }
    public void selectMenu(Scanner scanner){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            default:
                System.exit(0);

        }
    }
}
