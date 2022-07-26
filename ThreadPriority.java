class MyClass implements Runnable
{
	int count=0;
		
	  public void run()
	{
		for(int i=1;i<=100000;i++)
			count++;

		//display which thread has completed counting and its priority 
		
		System.out.println("Completed Thread: "+Thread.currentThread().getName());
		System.out.println("Its Priority: "+Thread.currentThread().getPriority());
	}
}
class ThreadPriority
{
	public static void main(String arg[])
	{
		MyClass obj=new MyClass();
		
		Thread t1=new Thread(obj,"One");
		Thread t2=new Thread(obj,"Two");
		Thread t3=new Thread(obj,"Three");

		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		 
	}
}

		
