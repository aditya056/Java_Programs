import java.util.*;  
public class Oddarr {
	public static void main(String[] args)
	{
	   int i,oddsum=0,oddcount=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
		System.out.println("elements entered:");
		for(i=0;i<n;i++){
            System.out.println(arr[i]);}
		for(i=0;i<n;i++)
		if(arr[i]%2!=0){            
oddsum=oddsum+arr[i];
oddcount++;}
double avgOdd=oddsum/oddcount; 
System.out.println("\nAverage of odd numbers are: "+avgOdd);
}
}
