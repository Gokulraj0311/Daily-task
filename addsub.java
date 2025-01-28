import java.util.Scanner;

public class fun{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value 1:");
        
        int a=sc.nextInt();
        System.out.print("Enter value 2:");
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        if( sub<0){
        int subtraction=Math.abs(sub);
        System.out.println("Subtraction of 2 value:"+subtraction);
        }if(add<0){
            int Addition=Math.abs(add);
            System.out.println("Addition of 2 value:"+Addition);
        }
        if(add>0){
            System.out.println("Addition of 2 value:"+add);
        }
        if(sub>0){
            System.out.println("Subtraction of 2 value:"+sub);
        }
    }
}
