

package ATM;

import java.util.Scanner;
import java.util.InputMismatchException;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;  // Initial balance
        int userChoice;
        boolean exit = false;
        final int PIN = 2723;  // Predefined PIN
        final int MAX_ATTEMPTS = 3;  // Maximum login attempts
        int attempts = 0;

        System.out.println("Welcome to the ATM!");

        // PIN Authentication
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Please enter your 4-digit PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == PIN) {
                System.out.println("PIN verified successfully!");
                break;
            } else {
                attempts++;
                System.out.println("Invalid PIN. Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Too many incorrect attempts. Exiting...");
                scanner.close();
                return; // Exit the program
            }
        }

        // Main ATM Menu
        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                userChoice = scanner.nextInt();

                switch (userChoice) {
                    case 1:  // Check Balance
                        System.out.println("Your current balance is: $" + balance);
                        break;

                    case 2:  // Deposit Money
                        System.out.print("Enter the amount to deposit: $");
                        int deposit = scanner.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Successfully deposited $" + deposit);
                        } else {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        }
                        break;

                    case 3:  // Withdraw Money
                        System.out.print("Enter the amount to withdraw: $");
                        int withdraw = scanner.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Successfully withdrew $" + withdraw);
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient funds.");
                        } else {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        }
                        break;

                    case 4:  // Exit
                        exit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
