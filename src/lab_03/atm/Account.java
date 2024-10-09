package lab_03.atm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Account {
    private String username;
    private String password;
    private double balance;
    private Scanner scanner;

    // Constructor
    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.scanner = new Scanner(System.in);
    }

    // login process
    public void login() {
        while (true) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(this.username) && inputPassword.equals(this.password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password!");
                System.out.print("Do you want to try again? (Y/N): ");
                String retry = scanner.nextLine().toUpperCase();
                if (retry.equals("N")) {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
            }
        }
    }

    // show the menu
    public void showMenu() {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. View account information");
            System.out.println("2. Withdraw money");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    displayAccountInfo();
                    break;
                case "2":
                    withdrawMoney();
                    break;
                case "3":
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = scanner.nextLine().toUpperCase();
            if (continueChoice.equals("N")) {
                System.out.println("Exiting the program...");
                System.exit(0);
            }
        }
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + balance + " VND");
    }

    // Withdraw money
    public void withdrawMoney() {
        while (true) {
            System.out.print("Enter the amount you want to withdraw: ");
            try {
                int amount = Integer.parseInt(scanner.nextLine());
                if (amount <= 0) {
                    System.out.println("The amount must be greater than 0.");
                } else if (amount > balance) {
                    System.out.println("Insufficient balance! Your current balance is " + balance + " VND.");
                } else {
                    balance -= amount;
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println("You have withdrawn " + amount + " VND at " + dtf.format(now));
                    System.out.println("Your new balance is: " + balance + " VND.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid amount.");
            }
        }
    }


    public static void main(String[] args) {

        Account account = new Account("techmaster", "hoclacoviec", 1000000);


        account.login();


        account.showMenu();
    }
}
