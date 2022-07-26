import java.util.*;
class StringTokenizerEx
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("\nEnter A Line Of Integers:");
String line = s.nextLine();
StringTokenizer st = new StringTokenizer(line);
System.out.println("Number of tokens : "+st.countTokens());
int sum = 0;
System.out.print("Tokens are : " );
while (st.hasMoreTokens())
{
int i = Integer.parseInt(st.nextToken());
System.out.println(i);
sum = sum + i;
}
System.out.println("The Sum Is :" +sum);
}
}