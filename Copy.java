class Constructors
{	
        int a,b;
	Constructors(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
		
	Constructors(Constructors c1)
	{
		this.a=c1.a;
		this.b=c1.b;
		System.out.println("This is copy constructor");
		System.out.println("a:"+a+"   b:"+b);
	}
}

class Copy
{
	public static void main(String args[])
	{
		Constructors c2=new Constructors(10,20);
		Constructors c3=new Constructors(c2);
		
	}
}