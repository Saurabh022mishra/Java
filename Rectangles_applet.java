import java.applet.Applet;
import java.awt.*;
public class Rectangles_applet extends Applet{
    public void paint(Graphics g){
     g.setColor(Color.red);
     g.fillRect(5, 10, 120,120);
     g.setColor(Color.blue);
     g.fillRect(125, 130, 120,120);
     g.setColor(Color.yellow);
     g.fillRect(245, 250, 120,120);
     g.setColor(Color.green);
     g.fillRect(365, 370, 120,120);
     g.setColor(Color.orange);
     g.fillRect(480, 490, 120,120);
    }
}
/*<applet code="Rectangles_applet.class" width=600 height=600>
 </applet>*/
 
