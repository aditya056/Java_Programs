/* Single thread to execute three tasks */
class MyClass implements Runnable
{
	public void run()
	{
		task1();
		task2();
		task3();
	}
	void task1()
	{
		 try{   
			Thread.sleep(20000);
		}
		catch(Exception e){} 
		System.out.println("Task1"); 
	}		
	void task2()
	{
		System.out.println("Task2");
	}
	void task3()
	{
		System.out.println("Task3");
	}
}
class SingleObject
{
	public static void main(String arg[])
	{
		MyClass mc=new MyClass();
		Thread t=new Thread(mc);
		t.start();
	}
}













