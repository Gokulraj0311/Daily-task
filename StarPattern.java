/* 
Write a program to print the star pattern.
Input: 
5
Output:

Input format :

The input consists of the number of rows N.
Output format :

The output prints the respective pattern.
Code constraints :

N > 0
Sample test cases :
Input 1 :
5
Output 1 :
    *
   ***
  *****
 *******
*********
Input 2 :
2
Output 2 :
 *
***
*/

import java.util.Scanner;
public class StarPattern {
    // Function to print the star pattern
    public static void printStarPattern(int N) {
        // Loop for each row of the pattern
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = 1; j <= (N - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars for each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of rows for the pattern
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Checking for the constraint N > 0
        if (N > 0) {
            // Function call to print the star pattern
            printStarPattern(N);
        } else {
            System.out.println("N should be greater than 0.");
        }
        sc.close();
    }
}
