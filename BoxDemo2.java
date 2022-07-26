import java.util.*;
class Box
{
double width;
double height;
double depth;
public void read(double width,double height,double depth)
{

this.width=width;
this.height=height;
this.depth=depth;
}
double findvolume()
{
double v=width*depth*height;
return v;
}
}
class BoxDemo2{
public static void main(String arg[]){
Box b=new Box();
b.read(2,3,4);
System.out.println("volume is:"+b.findvolume());
}
}