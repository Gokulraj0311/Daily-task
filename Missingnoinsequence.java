import java.util.Scanner;
public class Missingnumberinsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the sequence:");
        int n = sc.nextInt();
        // Input the sequence
        System.out.println("Enter the elements of the sequence:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // If the difference between consecutive numbers is not equal to 1
            if (arr[i + 1] - arr[i] != 1) {
                System.out.print("The missing number is: "+ (arr[i] + 1));
            }
        }
       
    }
    }

    
    
        
