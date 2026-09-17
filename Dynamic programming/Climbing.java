import java.util.*;

public class Climbing {

    public static int countWays(int n, int ways[]) {

        // Base case
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        // Already calculated
        if (ways[n] != -1) {
            return ways[n];
        }

        // Memoization
        ways[n] = countWays(n - 1, ways)
                + countWays(n - 2, ways);

        return ways[n];
    }

    public static void main(String[] args) {

        int n = 5;

        int ways[] = new int[n + 1];

        // Initially all values are -1
        Arrays.fill(ways, -1);

        System.out.println(countWays(n, ways));
    }
}