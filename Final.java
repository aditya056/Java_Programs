final class Figure
{
	double dim1;
	double dim2;
	Figure(double a,double b)
	{
	 dim1=a;
	 dim2=b;
	}
	double area()
	{
	 System.out.println("Area of the figure is undefined:");
	 return 0;
	}
}

class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
	 super(a,b);
	}
	double area()
	{
	 System.out.println("Inside area of Rectangle:");
	 return dim1*dim2;
	}
}

class Triangle extends Figure
{
	Triangle(double a,double b)
	{
	 super(a,b);
	}
	double area()
	{
	 System.out.println("Inside area of triangle:");
	 return (dim1*dim2)/2;
	}
}

class Final
{
	public static void main(String args[])
	{
		Rectangle R=new Rectangle(15,6);
		Triangle T=new Triangle(6,6);
		Figure Ref;
		Ref=R;
		System.out.println("Area is:"+Ref.area());
		Ref=T;
		System.out.println("Area is:"+Ref.area());
		
	}
}
	