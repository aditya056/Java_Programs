/* Create a class that extends Thread class */
class MyClass extends Thread
{ 
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
class Thread_Practice_2
{
	public static void main(String arg[])
	{
		 MyClass mc1=new MyClass();  MyClass mc2=new MyClass();  MyClass mc3=new MyClass();
		mc1.setName("India");	mc2.setName("AP");   mc3.setName("Amaravati");
		mc1.start();  mc2.start();   mc3.start();
	}
}