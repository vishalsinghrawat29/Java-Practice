
import java.util.Scanner;

public class MiniBank {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of customers: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] customerNames = new String[n];
            double[] customerBalances = new double[n];
            double totalBankBalance = 0;

            // Input customer details
            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Customer " + (i + 1) + " ---");
                System.out.print("Enter name: ");
                customerNames[i] = sc.nextLine();

                System.out.print("Enter initial balance: ");
                customerBalances[i] = sc.nextDouble();
                sc.nextLine();

                totalBankBalance += customerBalances[i];
            }

            boolean continueOperations = true;

            while (continueOperations) {
                System.out.print("\nDo you want to perform any operation? (yes/no): ");
                String response = sc.nextLine().trim().toLowerCase();

                if (response.equals("no")) {
                    continueOperations = false;
                    break;
                } else if (!response.equals("yes")) {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    continue;
                }

                // List customers
                System.out.println("\nCustomer List:");
                for (int i = 0; i < n; i++) {
                    System.out.println((i + 1) + ". " + customerNames[i]);
                }

                System.out.print("Enter customer index (1-" + n + "): ");
                int index = sc.nextInt() - 1;
                sc.nextLine(); // consume newline

                if (index < 0 || index >= n) {
                    System.out.println("Invalid customer index.");
                    continue;
                }

                int choice;
                do {
                    System.out.println("\nOperations for " + customerNames[index] + ":");
                    System.out.println("1. Deposit Money");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit to main menu");
                    System.out.print("Choose an option: ");
                    choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = sc.nextDouble();
                            sc.nextLine();
                            if (depositAmount > 0) {
                                customerBalances[index] += depositAmount;
                                totalBankBalance += depositAmount;
                                System.out.println(depositAmount + " deposited successfully.");
                            } else {
                                System.out.println("Invalid amount. Deposit failed.");
                            }
                            break;

                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = sc.nextDouble();
                            sc.nextLine();
                            if (withdrawAmount > 0 && withdrawAmount <= customerBalances[index]) {
                                customerBalances[index] -= withdrawAmount;
                                totalBankBalance -= withdrawAmount;
                                System.out.println(withdrawAmount + " withdrawn successfully.");
                            } else {
                                System.out.println("Invalid or insufficient balance. Withdrawal failed.");
                            }
                            break;

                        case 3:
                            System.out.println("Current balance: " + customerBalances[index]);
                            break;

                        case 4:
                            System.out.println("Returning to main menu...");
                            break;

                        default:
                            System.out.println("Invalid option. Try again.");
                    }

                } while (choice != 4);
            }

            System.out.println("\n=== Exiting System ===");
            System.out.println("Final total bank balance: " + totalBankBalance);
            System.out.println("Thank you!");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");

        }
    }
}
