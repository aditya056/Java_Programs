import java.util.*;  
public class Smallinarr {
	public static void main(String[] args)
	{
	   int i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
			 Arrays.sort(arr);
			 int minValue=arr[0];
		System.out.println("Smallest element present in given array:" +(minValue));
	}
}
