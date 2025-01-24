import java.util.Scanner;

class Fun {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading input values
        int n = sc.nextInt(); // Array size
        int[] a = new int[n]; // Array declaration
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt(); // Distance value

        // Check for duplicates within 'k' distance
        if (hasDuplicateWithinK(a, k)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean hasDuplicateWithinK(int[] a, int k) {
        // Loop through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Check the next 'k' elements for duplicates
            for (int j = i + 1; j <= i + k && j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true; // Duplicate found within 'k' distance
                }
            }
        }
        return false; // No duplicates found within 'k' distance
    }
}
/*
Given an unsorted array that may contain duplicates, check if the given array contains duplicate elements within 'k' distance from each other. Also, given a number 'k' which is smaller than the size of the array, write a program that returns true if the array contains duplicates within 'k' distance.
Input format :

The First line of the input consists of the value of n.

The Second line of Input is an Integer which contains the array of elements separated by spaces

The Third line of Input is an Integer that specifies the 'k' value.
Output format :

The Output prints Yes/No based on the condition.

Refer to the sample output for specifications.
Sample test cases :
Input 1 :

5
1 2 3 4 1 
5

Output 1 :

Yes

Input 2 :

5
1 2 3 4 1 
3

Output 2 :

No
*/
