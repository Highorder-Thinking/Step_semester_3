import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] inventory = new int[n];

        for (int i = 0; i < n; i++) {
            inventory[i] = sc.nextInt();
        }

        int total = 0;
        for (int value : inventory) {
            total += value;
        }

        System.out.println(total);
        sc.close();
    }
}
