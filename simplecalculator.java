import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double addition,subtraction,multiplication,division;
     while(true){
        System.out.println("1.Adittion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        System.out.print("enter your choice:");
        int choice=sc.nextInt();
        System.out.print("enter a number:");
        int a=sc.nextInt();
        System.out.print("enter another number:");
        int b=sc.nextInt();
        
       
   switch(choice){
    case 1:
         addition=a+b;
         System.out.println();
         System.out.println("-------RESULTS--------");
        System.out.println("Addition (+):"+addition);
        break;
        case 2:
         subtraction=a-b;
         System.out.println();
         System.out.println("-------RESULTS--------");
        System.out.println("Subtraction (-):"+subtraction);
        break;
        case 3:
         multiplication=a*b;
         System.out.println();
         System.out.println("-------RESULTS--------");
        System.out.println("Multiplication (X):"+multiplication);;
        break;
        case 4:
        if (b != 0) {
            division = (double) a / b;
            System.out.println();
            System.out.println("-------RESULTS--------");
            System.out.println("Division (/): " + division);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        break;
        case 5:
        System.out.print("-----------Exit----------");
   }
   System.out.println();
}
    
}
}

