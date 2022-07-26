import java.awt.*;  
import java.applet.*;  
/*
<applet code="DisplayImage.class" width=150 height=100 >
</applet>

*/

public class DisplayImage extends Applet 
{  
	Image picture;  
   	 public void paint(Graphics g) 
	{  
		picture = getImage(getDocumentBase(),"plane.jpg");
		g.drawImage(picture, 30,30, null);  
	}  
}  
