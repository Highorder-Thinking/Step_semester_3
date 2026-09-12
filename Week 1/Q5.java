import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] ratings = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
            total += ratings[i];
        }

        double average = n == 0 ? 0 : (double) total / n;

        System.out.printf("Average: %.2f%n", average);
        sc.close();
    }
}
