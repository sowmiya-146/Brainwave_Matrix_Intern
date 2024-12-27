package hospitalmanagementsystem;
import java.util.*;

public class hospitalManagementSystem {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hospitalManagementSystem system = new hospitalManagementSystem();
        
        while (true) {
            System.out.println("\nWelcome to the Hospital Management System!");
            System.out.println("1. Patient Registration");
            System.out.println("2. Appointment Scheduling");
            System.out.println("3. Electronic Health Records (EHR)");
            System.out.println("4. Billing and Invoicing");
            System.out.println("5. Inventory Management");
            System.out.println("6. Staff Management");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    system.patientRegistration(scanner);
                    break;
                case 2:
                    system.appointmentScheduling(scanner);
                    break;
                case 3:
                    system.electronicHealthRecords(scanner);
                    break;
                case 4:
                    system.billingAndInvoicing(scanner);
                    break;
                case 5:
                    system.inventoryManagement(scanner);
                    break;
                case 6:
                    system.staffManagement(scanner);
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void patientRegistration(Scanner scanner) {
        System.out.println("\n--- Patient Registration ---");
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Contact Information: ");
        String contact = scanner.nextLine();

        System.out.println("Patient Registered Successfully!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
    }

    private void appointmentScheduling(Scanner scanner) {
        System.out.println("\n--- Appointment Scheduling ---");
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Appointment Time (HH:MM): ");
        String time = scanner.nextLine();

        System.out.println("Appointment Scheduled Successfully!");
        System.out.println("Patient: " + patientName);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }

    private void electronicHealthRecords(Scanner scanner) {
        System.out.println("\n--- Electronic Health Records ---");
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.println("Fetching health records for " + patientName + "...");
        // Placeholder for database interaction
        System.out.println("No records found for " + patientName + " (feature under development).");
    }

    private void billingAndInvoicing(Scanner scanner) {
        System.out.println("\n--- Billing and Invoicing ---");
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter Service Description: ");
        String service = scanner.nextLine();
        System.out.print("Enter Service Cost: ");
        double cost = scanner.nextDouble();

        System.out.println("Invoice Generated:");
        System.out.println("Patient: " + patientName);
        System.out.println("Service: " + service);
        System.out.println("Cost: $" + cost);
    }

    private void inventoryManagement(Scanner scanner) {
        System.out.println("\n--- Inventory Management ---");
        System.out.println("1. Add Item\n2. View Inventory");
        int inventoryChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (inventoryChoice) {
            case 1:
                System.out.print("Enter Item Name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                System.out.println("Item Added Successfully: " + itemName + " (" + quantity + ")");
                break;
            case 2:
                System.out.println("Displaying Inventory (feature under development).");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void staffManagement(Scanner scanner) {
        System.out.println("\n--- Staff Management ---");
        System.out.print("Enter Staff Name: ");
        String staffName = scanner.nextLine();
        System.out.print("Enter Role: ");
        String role = scanner.nextLine();

        System.out.println("Staff Registered Successfully!");
        System.out.println("Name: " + staffName);
        System.out.println("Role: " + role);
    }
}


