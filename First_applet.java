//Display "Welcome to applet" Diagonally
import java.applet.*;  
import java.awt.*;  
public class First_applet extends Applet{  
  
public void paint(Graphics g){  
    for(int i=10;i<=557;i=i++){
        int x=0,y=10;
    g.drawString("welcome to applet",x+i,y+i); 
    i=i+25; 
} }
  
}  
/* 
<applet code="First_applet.class" width="600" height="600"> 
</applet> 
*/  