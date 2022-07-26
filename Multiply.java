import java.lang.*;
import java.util.Scanner;
class Multiply
{
	public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter table value:");
	int n=s.nextInt();
	for(int i=1;i<=10;i++)
{
	System.out.println(n+" * "+i+" = "+n*i);
}
}
}