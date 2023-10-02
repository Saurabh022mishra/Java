import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Button1 extends Applet implements ActionListener
{
	String msg= " ";
	Button yes,no,maybe;
	
	public void init()
	{
		yes = new Button("Exceptions");
		no = new Button("control statements");
		maybe = new Button("oops");
		
		add(yes);
		add(no);
		add(maybe);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	 public void actionPerformed(ActionEvent ae)
	 {
		String str=ae.getActionCommand();
		if(str.equals("Exceptions"))
		{
			msg="Exception handling in Java is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.";
		}
		else if(str.equals("control statements"))
		{
			msg="control flow refers to the order in which statements are executed.";
		}
		else{
			msg=" Pressed Wrong Button.";
		}
		repaint();
	 }
	 public void paint(Graphics g)
	 {
		g.drawString(msg,6,100);
	 }
}
/* <applet code = "Button1.class" width = "900" height = "900">
   </applet>
*/
