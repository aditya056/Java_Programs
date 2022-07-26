class Box
{
	int x;
	int y;
	void display()
	{
		x=10;
		y=20;
		System.out.println("the default constructor values are x ="+x+","+"y="+y);
	}
}
class Default
{
	public static void main(String args[])
	{
		Box mybox=new Box();
		mybox.display();
	}
}
		
		

 
	 