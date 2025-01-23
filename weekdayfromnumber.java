import java.util.*;
public class weekday{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int daynumber=sc.nextInt();           //daynumber=7
        System.out.println("The day for input daynumber is"+get(daynumber)); //---output prints saturday---
    }
    public static String get(int daynumber){
        String[] weekday={"Sunday","Monday","Tuesday","wednesday","Thrusday","Friday","Saturday"};
        if(daynumber>=1 && daynumber<=7){
            return weekday[daynumber-1];     //weekday[7-1]---return the 7-1 is 6 which weekday[6] is Saturday
        }
        else{
            return "InvalidInput";
        }
    }
}
