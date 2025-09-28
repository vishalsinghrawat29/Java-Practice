
import java.util.Scanner;

public class BitwiseOperation {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter num1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter num2: ");
            int num2 = sc.nextInt();

            // Store results in variables
            int andResult = num1 & num2;
            int orResult = num1 | num2;
            int xorResult = num1 ^ num2;
            int notNum1 = ~num1;
            int notNum2 = ~num2;
            int leftShiftNum1 = num1 << 1;
            int leftShiftNum2 = num2 << 1;
            int rightShiftNum1 = num1 >> 1;
            int rightShiftNum2 = num2 >> 1;
            int unsignedRightShiftNum1 = num1 >>> 1;
            int unsignedRightShiftNum2 = num2 >>> 1;

            // Print results
            System.out.println("\nBitwise Operations Results:");
            System.out.println("---------------------------");
            System.out.println(num1 + " & " + num2 + " = " + andResult);
            System.out.println(num1 + " | " + num2 + " = " + orResult);
            System.out.println(num1 + " ^ " + num2 + " = " + xorResult);
            System.out.println("~" + num1 + " = " + notNum1);
            System.out.println("~" + num2 + " = " + notNum2);
            System.out.println(num1 + " << 1 = " + leftShiftNum1);
            System.out.println(num2 + " << 1 = " + leftShiftNum2);
            System.out.println(num1 + " >> 1 = " + rightShiftNum1);
            System.out.println(num2 + " >> 1 = " + rightShiftNum2);
            System.out.println(num1 + " >>> 1 = " + unsignedRightShiftNum1);
            System.out.println(num2 + " >>> 1 = " + unsignedRightShiftNum2);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
    }
}
