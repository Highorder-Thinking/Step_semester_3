import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seats = new int[n];

        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        boolean duplicate = false;

        for (int seat : seats) {
            if (!seen.add(seat)) {
                duplicate = true;
                break;
            }
        }

        System.out.println(duplicate ? "Duplicate" : "No Duplicate");
        sc.close();
    }
}
