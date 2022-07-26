class MyClass extends Thread
{
	public void run()
	{
		try{
			for(int i=0;i<200;i++)
			{
				if(i%2!=0){
					System.out.println("Child:"+i);
					Thread.sleep(1000); 
				}
			}
		}
		catch(Exception e){}
	}
}
class Demo
{
	public static void main(String ad[])
	{
		MyClass c=new MyClass();
		c.start();
		try{
			for(int i=0;i<200;i++)
			{
				if(i%2==0){
					System.out.println("Parent:"+i);
					Thread.sleep(1000);
				}
			}
		}
		catch(Exception e){}



 	}	
}
