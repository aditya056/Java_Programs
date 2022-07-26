import java.awt.*;  
import java.applet.Applet;  
/*
<applet code="Color1.class" width=150 height=100 >
</applet>
*/
public class Color1 extends Applet 
{  
	public void init() 
	{  
		setBackground(Color.yellow);
		setForeground(Color.red);
	}  
	public void paint(Graphics g) {  
	 	  g.drawString("PVPSIT", 30,30 );  
	}  
}  
