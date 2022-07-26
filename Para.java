class Box
{
 	void display(int a,int b)
	{
		System.out.println("parameterized constructor values are:"+a+" "+b);
	}
}
class Para
{
	public static void main(String args[]){
	Box mybox=new Box();
	mybox.display(10,20);
}
}