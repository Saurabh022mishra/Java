import java.applet.Applet;
import java.awt.*;
public class Applet_Five extends Applet {
     public void paint(Graphics d){
//draw a 3d cube
	d.drawRect(5,5,50,50);
	d.drawRect(18,18,50,50);
	d.drawLine(5,5,18,18);
	d.drawLine(55,5,68,18);
	d.drawLine(5,55,18,68);
	d.drawLine(55,55,68,68);
//draw a cylinder
	d.setColor(Color.red);
	d.fillOval(85,5,25,10);
	d.drawLine(85,10,85,68);
	d.drawLine(108,10,108,68);
	d.fillOval(85,63,25,10);
//draw rectangle with inside oval
	d.drawRect(125,5,68,68);
//	d.setColor(Color.red);
	d.drawOval(125,5,68,68);

//draw a square inside a circle
	d.drawOval(210,5,70,70);
	d.drawRect(220,15,50,50);

//draw a rectangle with both diagonals

	d.drawRect(150,150,200,350);
	d.drawLine(150,150,350,500);
	d.drawLine(350,150,150,500);
}
}


//<applet code="Applet_Five.class" height="600" width="600">
//</applet>