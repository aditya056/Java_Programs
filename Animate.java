import java.awt.*;  
import java.applet.*;  
/*
	<applet code="Animate.class" width=1000 height=1000 >
	</applet>
*/
public class Animate extends Applet 
{  
	public void paint(Graphics g) 
	{  
  	    	Image picture= getImage(getDocumentBase(),"plane.jpg");  
	    //	showStatus("PVPSIT");  
	      	
	      	 for(int y=800,x=0;y>=0;x++,y--)
	       	{
                              	     	g.drawImage(picture, x,y, null);  
		 	try{
				Thread.sleep(45);
			}
			catch(Exception e){ }	
	    	 }
         	 }  
} 







//URL url=getDocumentBase();
	//String msg=url.toString();
	//g.drawString(msg,400,400);*/