class CurrentThread
{
	public static void main(String arg[]) throws Exception
	{
		
		Thread t=Thread.currentThread(); 
		 t.setPriority(2);
		System.out.println("prior to sleep");
		t.sleep(4000); 
		System.out.println("Current Thread:"+t);
		System.out.println("Current Thread Name:"+t.getName());
		System.out.println( t.getPriority());
		 
	}
}