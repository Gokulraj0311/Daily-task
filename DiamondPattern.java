/*Write a program to print the diamond pattern using a star.


Input:

5

Output:

﻿


Input format :

The input consists of the number of rows N.
Output format :

The output prints the diamond pattern given in the problem statement.
Code constraints :

N > 0.
Sample test cases :
Input 1 :

5

Output 1 :

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

Input 2 :

8

Output 2 :

       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
*/
import java.util.Scanner;

public class DiamondPattern {

    // Function to print the diamond pattern
    public static void printDiamond(int N) {
        // Printing the upper part of the diamond
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = 1; j <= (N - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Printing the lower part of the diamond
        for (int i = N - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= (N - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of rows for the upper part of the diamond
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Function call to print the diamond pattern
        printDiamond(N);

        sc.close();
    }
}








