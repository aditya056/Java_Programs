class String_Demo
{
public static void main(String arg[])
{
String s1="PVP Siddhartha";
String s2=new String("Engineering");
String s3=new String("College");
System.out.println("First :"+s1);
System.out.println("Second :"+s2);
System.out.println("Third :"+s3);
System.out.println("Length of first String :"+s1.length());
System.out.println("Concatenation of first and second :"+s1.concat(s2));
System.out.println("Concatenation of strings with + :"+s1+" "+s3);
System.out.println("If string s1 starts with P or not :"+s1.startsWith("P"));
System.out.println("Extraction of substrings :"+s1.substring(2));
System.out.println("Extraction of substrings :"+s1.substring(2,5));
System.out.println("String into uppercase :"+s1.toUpperCase());
System.out.println("String into lower case :"+s1.toLowerCase());
String str = " Hello ";
System.out.println("Use of Trim() :"+str.trim());
}
}