/* Create a class that extends Thread class */
class MyClass extends Thread
{
	 MyClass(String n)
	{ 
		setName(n);
		 start();
	}
	/* Entry point for thread */
	public void run()
	{
		for(;;)
		{
			String name=Thread.currentThread().getName();
			try
			{
			
				if(name.equals("India"))
				{
			
					System.out.println("India");
					sleep(5000);
				}
				else if(name.equals("AP"))
				{
			
					System.out.println("AP");
					sleep(3000);
				}
				else
				{
					System.out.println("Amaravati");
					sleep(1000);
				}
			}
			catch(Exception e){}
		}
	}
}
class Thread_Practice
{
	public static void main(String arg[])
	{
		 new MyClass("India");
			 new MyClass("AP");
				 new MyClass("Amaravati");
	}
}