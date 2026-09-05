import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] traffic = new int[n];

        for (int i = 0; i < n; i++) {
            traffic[i] = sc.nextInt();
        }

        int best = 0;
        int current = 0;

        for (int value : traffic) {
            if (value > 0) {
                current++;
                best = Math.max(best, current);
            } else {
                current = 0;
            }
        }

        System.out.println(best);
        sc.close();
    }
}
