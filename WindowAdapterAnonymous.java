import java.awt.*;  
import java.awt.event.*; 
 class WindowEx1 extends Frame  
{  
	 String msg;
	 WindowEx1(){  
		 addWindowListener(new  WindowAdapter()
		{
			public void windowClosing(WindowEvent we) 
			{  
   				System.exit(0);  
			}  	
		});
	}  
}
class WindowAdapterAnonymous
{
	public static void main(String[] args) {  
  		WindowEx1 w=new WindowEx1();  
		w.setSize(400,400);  
		w.setLayout(null);  
                 	w.setVisible(true);  
	}  
}