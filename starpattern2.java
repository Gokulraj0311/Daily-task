import java.util.Scanner;
class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l;
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else{
                l=i;
            }
            for(int j=0;j<n-l;j++){
                System.out.print(" ");
            }
            for(int c=0;c<l+1;c++){
                System.out.print(" *");
            }
        System.out.println();
    }
}
}


/*
complexity==============>0(n^2)
output:
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
*/
