import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expected = sc.nextLine();
        String typed = sc.nextLine();

        int correct = 0;
        int length = Math.min(expected.length(), typed.length());

        for (int i = 0; i < length; i++) {
            if (expected.charAt(i) == typed.charAt(i)) {
                correct++;
            }
        }

        double accuracy = expected.length() == 0
                ? 0
                : (correct * 100.0) / expected.length();

        System.out.printf("Accuracy: %.2f%%%n", accuracy);
        sc.close();
    }
}
