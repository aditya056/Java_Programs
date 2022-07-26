class Customer
{  
	  int amount=10000;  
  
 	synchronized void withdraw(int withdraw_amount)
	{  
		System.out.println("going to withdraw...");    
	  
		if( amount<withdraw_amount)
		{  
			System.out.println("Less balance....");  
		}
		amount-=withdraw_amount;  
		System.out.println("withdraw completed...");  
		 
	}  
  	synchronized void deposit(int deposit_amount)
	{  
		System.out.println("going to deposit...");  
		 amount+=deposit_amount;  
		System.out.println("deposit completed... ");  
	 }  
}  
  
class ThreadCommunication_First
{  
	public static void main(String args[])
	{  	
		final Customer c=new Customer();  
		Thread t1=new Thread()
		{  
			public void run()
			{
				c.withdraw(15000);
			}  
		};
		Thread t2=new Thread()
		{  
			public void run()
			{
				c.deposit(10000);
			}  
		};
		t1.setPriority(10);
		t1.start();
		t2.start(); 
	}
} 











//"Variable is accessed within inner class. Needs to be declared final." 
//Any variable defined in a method and accessed by an anonymous inner class must be final