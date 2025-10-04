
import java.util.Scanner;

public class BillCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("====== Welcome to the Shopping Bill Calculator ======\n");

            System.out.print("Enter number of items to buy: ");
            int noOfItem = sc.nextInt();
            sc.nextLine();
            String[] itemsName = new String[noOfItem];
            int[] itemsQuantity = new int[noOfItem];
            double[] itemPricePerUnit = new double[noOfItem];
            double[] itemTotalCost = new double[noOfItem];

            double grandTotal = 0.00;
            double discount = 0.00;
            double finalTotal;

            // Input items
            for (int i = 0; i < noOfItem; i++) {
                System.out.print("\nItem " + (i + 1) + " Name: ");
                itemsName[i] = sc.nextLine();

                System.out.print("Quantity of " + itemsName[i] + ": ");
                itemsQuantity[i] = sc.nextInt();

                System.out.print("Price per unit of " + itemsName[i] + ": ");
                itemPricePerUnit[i] = sc.nextDouble();
                sc.nextLine(); // consume newline

                itemTotalCost[i] = itemsQuantity[i] * itemPricePerUnit[i];
                grandTotal += itemTotalCost[i];
            }

            // Calculate discount
            if (grandTotal >= 500) {
                discount = grandTotal * 0.10;
            }
            finalTotal = grandTotal - discount;

            // Print organized bill
            System.out.println("\n=========================== BILL ===========================");
            System.out.printf("%-20s %-10s %-15s %-10s%n", "Item Name", "Quantity", "Price per Unit", "Total");
            System.out.println("------------------------------------------------------------");

            for (int i = 0; i < noOfItem; i++) {
                System.out.printf("%-20s %-10d %-15.2f %-10.2f%n",
                        itemsName[i], itemsQuantity[i], itemPricePerUnit[i], itemTotalCost[i]);
            }

            System.out.println("------------------------------------------------------------");
            System.out.printf("%-20s %-37.2f%n", "Grand Total:", grandTotal);
            System.out.printf("%-20s %-37.2f%n", "Discount:", discount);
            System.out.printf("%-20s %-37.2f%n", "Final Amount:", finalTotal);
            System.out.println("============================================================");
            System.out.println("          Thank you for shopping with us!");
            System.out.println("============================================================");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }
    }
}
