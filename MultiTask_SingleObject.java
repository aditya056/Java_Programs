//Multitasking on single object - Example on reservation -

class Reserve implements Runnable
{
	int available=1; // available berth is only one 
	int wanted;
	Reserve(int i)
	{
		wanted=i;
	} 
 	synchronized public void run()
	{
		 
		System.out.println("Available Berths:   "+available);
		if(available>=wanted)
		{
			String name=Thread.currentThread().getName();//Name 
			//Allot the berth to him
			System.out.println(wanted+" Berths reserved for :"+ name);
			try
			{
				Thread.sleep(2000); //wait for printing the ticket
				available=available-wanted; //Update available tickets
			}
			catch(Exception e){}
		}
		else
			System.out.println("Sorry, No Berths");
		}
	 
}
class MultiTask_SingleObject
{
	public static void main(String arg[])
	{
		Reserve r=new Reserve(1);
		Thread t1=new Thread(r,"First Person");
		Thread t2=new Thread(r,"Second Person");
		t1. start();
		t2.start();	
	}
}











