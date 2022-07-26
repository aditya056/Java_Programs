class StringBufferDemo
{
public static void main(String arg[])
{
StringBuffer sb=new StringBuffer();
System.out.println("Use of capacity():"+sb.capacity());
StringBuffer sb1=new StringBuffer("Uni");
System.out.println("Use of append():"+sb1.append("versity"));
System.out.println("Use of insert():"+sb1.insert(0, "JNTU "));
System.out.println("use of delet()"+sb1.delete(0,4));
System.out.println("Use of length():"+sb1.length());
System.out.println("Use of reverse():"+sb1.reverse());
System.out.println("Use of capacity():"+sb1.capacity());
System.out.println("Use of reverse():"+sb1.reverse());
System.out.println("Use of indexOf():"+sb1.indexOf("i"));
System.out.println("Use of lastIndexOf:"+sb1.lastIndexOf("i"));
System.out.println("Use of substring(int):"+sb1.substring(4));
System.out.println("Use of substring(int,int):"+sb1.substring(0,4));
System.out.println(sb1);
System.out.println("Use of replace():"+sb1.replace(0,3,"ANU "));
}
}