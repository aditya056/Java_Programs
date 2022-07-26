class Box
{
double height;
double width;
double depth;
Box()
{
width=2;
depth=5;
height=10;
}
Box(double w,double d,double h)
{
width=w;
depth=d;
height=h;
}
double volume()
{
return width*height*depth;
}
}
class OverloadConstructor_passingObject{
public static void main(String args[])
{
Box mybox=new Box();
Box mybox1=new Box(10,20,5);
System.out.println("volume mybox:"+mybox.volume());
System.out.println("volume mybox1:"+mybox1.volume());
}
}