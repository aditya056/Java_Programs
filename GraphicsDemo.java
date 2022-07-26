import java.awt.*;  
import java.applet.*;
/*
<applet code="GraphicsDemo.class" width=400 height=400 >
</applet>
*/
public class GraphicsDemo extends Applet
{  
  	public void paint(Graphics g)
	{  
		/*g.setColor(Color.red);
   
		g.drawString("Welcome to PVPSIT",50, 50);  
		

		 g.drawLine(20,30,20,300);  

		g.drawRect(70,100,30,30);  
		
		g.fillRect(170,100,100,30);  

		g.drawOval(70,200,30,30);  */
		  
		 g.setColor(Color.blue); 
 
		//g.fillOval(220,150,30,30);  

		g.drawArc(90,150,200,200,180,90);  
		
		 g.fillArc(270,150,100,100,0,180);   
	  }  
}  
