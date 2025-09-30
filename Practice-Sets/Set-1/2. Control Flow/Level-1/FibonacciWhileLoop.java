
public class FibonacciWhileLoop {

    public static void main(String[] args) {
        int n = 10;           // how many numbers to print
        int first = 0, second = 1;
        int count = 0;

        System.out.println("First " + n + " numbers of Fibonacci series:");

        while (count < n) {
            System.out.print(first + " ");  // print current number

            int next = first + second;      // calculate next number
            first = second;                 // move second to first
            second = next;                  // update second
            count++;                        // increase counter
        }
    }
}
