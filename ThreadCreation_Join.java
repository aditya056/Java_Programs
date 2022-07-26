 
class MyClass extends Thread
{  
	 
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(  getName()+     " :  "+i);
			try
			{
				sleep(1000);
			}
			catch(Exception e){}
		}
	}
	 
}
class ThreadCreation_Join
{
	public static void main(String args[]) throws Exception
	{ 
		 MyClass mc1=new MyClass();
		 MyClass mc2=new MyClass(); 
		  MyClass mc3=new MyClass();

		 
		mc1.setName("Pavan");
		mc2.setName("Sai");
		mc3.setName("Siddhartha");
		
		mc1.start();     mc1.join();
		mc2.start(); 
	                mc3.start();
		 
			 
	}
}