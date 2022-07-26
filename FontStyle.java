import java.awt.*;
import java.applet.Applet;  
/*
	<applet code="FontStyle.class" width=1000 height=1000 >
	</applet>
*/
public class FontStyle extends Applet 
{   
	public void paint(Graphics g) {  
	  	 setBackground(Color.yellow);
		 Font f=new Font("Arial",Font.ITALIC,100);
		  setFont(f);
		g.drawString("PVPSIT", 30,200 );  
	}  
}  
