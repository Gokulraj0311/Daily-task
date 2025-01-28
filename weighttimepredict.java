import java.util.Scanner;

public class fun{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value 1:");
        
        int a=sc.nextInt();
        System.out.print("Enter the Level:");
        char b=sc.next().charAt(0);
        if(a<0){
            System.out.println("INVALID INPUT");
            }
        else if(a>0 && a<=2000 && b=='L'){
        System.out.println("Time estimation is 25 minutes");
        }

        else if(a>=2001 && a<4000 && b=='M'){
            System.out.println("Time estimation is 35 minutes");
        }
        else if(a>4000 && b=='H'){
            System.out.println("Time estimation is 45 minutes");
        }
        else {
            System.out.println("OVER LOADED");
        }
        sc.close();
    }
}
