package lesson_09.oop_exam;
import lesson_09.oop_exam.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true){
            menu.displayMenu(scanner);
        }
    }
}
