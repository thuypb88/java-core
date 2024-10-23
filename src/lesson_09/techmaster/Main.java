package lesson_09.techmaster;

import lesson_09.techmaster.entities.Techmaster;
import lesson_09.techmaster.service.TechmasterService;
import lesson_09.techmaster.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TechmasterService techmasterService = new TechmasterService();
        Scanner scanner = new Scanner(System.in);
        Techmaster techmaster = techmasterService.inputInfo(scanner);
        Menu menu = new Menu();
        while (true){
            menu.displayMenu(scanner, techmaster);
        }
    }
}
