import java.util.Scanner;
public class UniquePathsInGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input grid dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Input grid
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("enter elements:");
                grid[i][j] = scanner.nextInt();
            }
        }

        // DP table to store the number of unique paths to each cell
        int[][] dp = new int[m][n];

        // Initialize the DP table
        if (grid[0][0] == 1) {
            dp[0][0] = 1; // Starting point
        }
        // Fill the DP table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) { // Only consider traversable cells
                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j]; // Add paths from above
                    }
                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1]; // Add paths from the left
                    }
                }
            }
        }
        // Output the number of unique paths to the bottom-right corner
        System.out.println(dp[m - 1][n - 1]);
    }
}


/*
Input:
3
3
|1 1 0 |
|0 1 1 |
|1 1 1 |
---To print the now of ways to visit the bottom end---
Output:
2
*/


