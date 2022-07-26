/* Create a class that implements Runnable interface */
class MyClass implements Runnable
{
	 
	/*In this class, implement run() method */ 
	public void run()			
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
class Thread_Implements
{
	public static void main(String arg[])
	{
		/*Create an object to  MyClass and run method is available for execution*/
		MyClass mc = new MyClass();

		/*If you are not extending the Thread class,your class object would not be 				                                          treated as a thread object.So you need to explicitely create Thread class object.
		  We have to pass object of our class that implements Runnable as parameter, so 
		  that your class run() method may execute.*/
	
		Thread t= new Thread(mc);
		  t.start();
	}
}
