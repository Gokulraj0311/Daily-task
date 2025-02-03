import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class passwrd {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int l=sc.nextInt();
	    	List<String> s=new ArrayList<>();
	    	for(int i=1;i<=n;i++) {
	    		for(int j=1;j<=n;j++) {
	    			for(int k=0;k<l;k++) {
	    				for(int m=0;m<l;m++) {
	    					for(int p=1;p<=n;p++) {
	    						if(p>i && p>j) {
	    				String password=" "+i+j+(char)('a'+k)+(char)('a'+m)+p;
	    				System.out.println(password);
	    				s.add(password);
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
	    	Collections.sort(s);
	    	System.out.println(String.join("",s));
	    	sc.close();
}
}

/*Write a program that enters two integers n and l and generates, in alphabetical order, all possible "stupid” passwords" that consist of the following 5 characters:

Character 1: a digit from 1 to n.
Character 2: a digit from 1 to n.
Character 3: a small letter from the first l letters of the Latin alphabet.
Character 4: a small letter from the first l letters of the Latin alphabet.
Character 5: a digit from 1 to n, greater than the first 2 digits.
Input Data
The input is read from the console and consists of two integers: n and l within the range [1 … 9], each on a single line.

Output Data
Print on the console all "stupid" passwords in alphabetical order, separated by space
*/
