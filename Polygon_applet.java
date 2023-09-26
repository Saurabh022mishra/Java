import java.applet.Applet;
import java.awt.*;
public class Polygon_applet extends Applet{
public void paint(Graphics g){
    int x[]={10,10,30,50,70,70,50,30};
    int y[]={40,60,80,80,60,40,20,20};
    int n=8;
    g.fillPolygon(x,y,n);
    
    
    
}
}
/*<applet code="Polygon_applet" width=600 height=600></applet> */