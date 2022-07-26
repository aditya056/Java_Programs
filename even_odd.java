import java.util.Scanner;
public class even_odd
{
    public static void main(String[] args) {
        int n,sumeven=0,sumodd=0;
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter n value:");
        	n=s.nextInt();
        	    sumeven=(n*(n+1));
        	    sumodd=n*n;
        	System.out.println("The sum of first "+(n)+" even numbers is:"+(sumeven));
        	System.out.println("The sum of first "+(n)+" odd numbers is:"+(sumodd));



    }
}