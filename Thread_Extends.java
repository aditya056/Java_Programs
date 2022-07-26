/* Create a class that extends Thread class */
class MyClass extends Thread
{
	/* In this class, overwrite run() method */ 
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(getName() + "  : "+i);
		 	 try{ 
				sleep(50);
			 }
			 catch(Exception e){ }
		}
	}
}
class Thread_Extends
{
	public static void main(String arg[])
	{
	                /*Create an object to  MyClass and run method is available for execution*/
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		mc1.setName("PVPSIT"); 
		mc2.setName("VRSEC");
		mc1.start();
		mc2.start();
	}
}
