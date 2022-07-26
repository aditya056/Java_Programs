import java.awt.*;  
import java.applet.*;  

/*
<applet code="LifeCycle.class" width=200 height=200 >
</applet>
*/ 

public class LifeCycle extends Applet 
{  
	public void init() //method executed when an applet is loaded
	{  
		// setBackground(Color.blue);
	 }
	 
	public void start() { }
	 public void stop() {}
	 public void destroy() {} 

	public void paint(Graphics g) {  
	 	 g.drawString("PVPSIT",100,10);

		 g.drawRect(100,100,100,100);
		 g.drawOval(100,100,10,100);
		   g.drawArc(100,0,50,50,180,90);
		 g.drawArc(100,100, 100,100,90,180);
		
	  }  
}  





