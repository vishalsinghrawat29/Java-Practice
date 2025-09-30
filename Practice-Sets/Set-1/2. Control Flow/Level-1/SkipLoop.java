
public class SkipLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {   // Start from 1, go till 20
            if (i % 3 == 0) {
                continue; // Skip numbers divisible by 3
            }
            System.out.println(i);
        }
    }
}
