class Customer
{  
	int amount=10000;   
  
 	 synchronized void withdraw(int withdraw_amount)
	{  
		System.out.println("going to withdraw...");   
	  	 	
		if( amount<withdraw_amount )
		{  
			System.out.println("Less balance....");  
			try{
				wait();
			}
			catch(Exception e){}  
		}  
		 amount-=withdraw_amount;  
		System.out.println("withdraw completed...");  
	}  
  	synchronized void deposit(int deposit_amount)
	{  
		System.out.println("going to deposit...");  
		this.amount+=deposit_amount;  
		System.out.println("deposit completed... ");  
		try{
		     //Thread.sleep(10000);
		     notify();
		}
		catch(Exception e){} 
	}  
}  
class ThreadCommunication
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








