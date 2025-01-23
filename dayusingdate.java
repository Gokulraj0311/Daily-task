import java.time.*;
import java.util.*;
public class weekday{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter year:");//eg:2004
        int year=sc.nextInt();
        System.out.print("enter month:");//eg:11
        int month=sc.nextInt();
        System.out.print("enter date:");//eg:03
        int day=sc.nextInt();
        try{
        LocalDate date=LocalDate.of(year, month, day);//to get the date of the specific date
        DayOfWeek dayOfWeek=date.getDayOfWeek();//to get the day for the specific day
        System.out.println("The day of the given  date: "+ dayOfWeek);
        }
        catch (Exception e){
            System.out.println("Invalid date");//invalid input where to handle the exception
        }
        sc.close();
    }
}
