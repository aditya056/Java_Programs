 import java.awt.*;
import java.applet.*;
/*<applet code="AppletSkelton.class" width=200 height=200></applet>*/
 
public class AppletSkelton extends Applet 
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
		Font f=new Font("Arial",Font.BOLD,100);
		setFont(f);
	} 
	public void paint(Graphics g) {
		// redisplay contents of window
		  g.drawString("PVPSIT",300,300);
	}
}