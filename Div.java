import java.util.Scanner;
public class Div
{
    public static void main(String[] args) 
    {
	int n,sum=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the n value:");
	n=s.nextInt();
	for(int i=1;i<=n;i++)
{
	if(i%3==0)
	sum=sum+i;
}
System.out.println("sum of numbers till "+(n)+" "+"is"+":"+(sum));
}
}
	
	

