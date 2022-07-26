import java.awt.*;
import java.applet.*;
/*
	<applet code="ParamDemo" width=300 height=80>
		<param name="p1" value="PVPSIT">
		<param name="p2" value="10000">
 	</applet>
*/
public class ParamDemo extends Applet 
{
	String name;
	int sal;
 	public void init()
	{
		name=getParameter("p1");
		sal=Integer.parseInt(getParameter("p2"));
	}
	public void paint(Graphics g)
	{
		g.drawString("Name:"+name,20,20);
		g.drawString("salary:"+sal,20,100);
	}
}








