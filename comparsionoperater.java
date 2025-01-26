import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Correctly initialize Scanner with System.in
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Display comparison results
        System.out.println("a < b: " + is(a, b, "<"));
        System.out.println("a <= b: " + is(a, b, "<="));
        System.out.println("a > b: " + is(a, b, ">"));
        System.out.println("a >= b: " + is(a, b, ">="));
        System.out.println("a == b: " + is(a, b, "=="));
        System.out.println("a != b: " + is(a, b, "!="));

        // Close the scanner
        sc.close();
    }

    public static boolean is(int a, int b, String operator) {
        // Perform comparison based on the operator
        switch (operator) {
            case "<":
                return a < b;
            case "<=":
                return a <= b;
            case ">":
                return a > b;
            case ">=":
                return a >= b;
            case "==":
                return a == b;
            case "!=":
                return a != b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
/*
Enter the first number: 15
Enter the second number: 20
a < b: true
a <= b: true
a > b: false
a >= b: false
a == b: false
a != b: true

*/
