//Multitasking with two objects

class MyClass implements Runnable
{
	String name;	
	MyClass(String str)
	{
		 name=str;
	}
 	 public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(name+"   "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
	
}
class MultiTask_Theatre
{
	public static void main(String arg[])
	{
		MyClass mc1=new MyClass("Cut the Ticket :");
		MyClass mc2=new MyClass("Show the seat  :");

		Thread t1=new Thread(mc1);
		Thread t2=new Thread(mc2);
		t1. start(); 
		t1.setPriority(10);
		t2.start();	
	}
}









