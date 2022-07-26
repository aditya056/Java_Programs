  /* Create a class that extends Thread class */
class MyClass extends Thread
{
	/* In this class, override run() method */
	
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			try{
				if(i%2==0)
					System.out.println("Child:"+i);
				                 sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class Thread_Extends2
{
	public static void main(String arg[])
	{
		/*Create an object to  MyClass and run method is available for execution*/

		MyClass mc = new MyClass();
		mc.start();

		for(int i=0;i<200;i++)
		{
			try{
				if(i%2!=0)
					System.out.println("Parent:"+i);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
