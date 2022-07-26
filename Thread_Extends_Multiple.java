/* Create a class that extends Thread class */
class MyClass extends Thread
{
	String name;
	MyClass(String n)
	{
		setName(n);
		start(); 
	}
	/* Entry point for thread */
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			try{
				System.out.println(getName()+":"+i);
				sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class Thread_Extends_Multiple
{
	public static void main(String arg[])
	{
		 new MyClass("One");
			 new MyClass("Two");
				 new MyClass("Three");
	}
}






