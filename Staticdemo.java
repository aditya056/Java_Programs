class Staticvariable
{
	static int x=20;
}
class Staticdemo
{
	public static void main(String args[])
	{
		Staticvariable s1=new Staticvariable();
		Staticvariable s2=new Staticvariable();
		System.out.println(Staticvariable.x);
		System.out.println(s1.x);
		System.out.println(s2.x);
		s1.x=200;
		System.out.println(s1.x);
		System.out.println(s2.x);
	}
}

		