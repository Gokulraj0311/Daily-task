
import java.util.Scanner;
public class factorial {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	long result=fact(n);
	    	System.out.println(result);
	    	sc.close();
	    }
	    public static long fact(int n) {
	    if(n==0) {
    		return 1;
    	}
    	else {
    	return n*fact(n-1);
    	}
	    }
}

/* complexity =====>O(n)---where the recursion loop runs n times */
