import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Example.class" width=500 height=500>
</applet>
*/
public class Example extends Applet implements ActionListener
{
	 
	Label l1,l2;
	Button b;
	TextField t1,t2;
	 public void init()
	{
		l1=new Label("Enter Number");
		l2=new Label("Result");
		t1=new TextField(10);
		t2=new TextField(20);
		b=new Button("Compute");
		add(l1);
		add(t1);
		add(b);
		add(l2);
		add(t2);
		b.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("Excercise 8",100,100);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(t1.getText());
		int fact=1;
		for(int i=1;i<=a;i++)
			fact=fact*i;
		t2.setText(" "+fact);
	}
}
