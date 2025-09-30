
public class EvenNumberDoWhile {

    public static void main(String[] args) {
        int start = 2;

        System.out.println("Even numbers between 1 and 50:");

        do {
            if (start % 2 == 0) {
                System.out.print(start + " ");
            }
            start++;
        } while (start <= 50);
    }
}
