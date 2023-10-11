import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Third extends Applet {
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.white);

        // Define colors for the semicircles
        Color[] colors = { Color.red, Color.green, Color.orange, Color.blue, Color.yellow, Color.magenta };

        int xStart = 50; // Starting x-coordinate for the first semicircle

        // Draw the first 3 semicircles facing upwards
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[i]);
            g.fillArc(xStart, 120, 80, 80, 0, -180);
            xStart += 100; // Move to the next position
        }

        // Draw a horizontal line at the bottom of the semicircles
        g.setColor(Color.black);
        g.drawLine(20, 200, 380, 200);

        xStart = 50; // Reset the x-coordinate

        // Draw the next 3 semicircles facing downwards and touching the line
        for (int i = 3; i < 6; i++) {
            g.setColor(colors[i]);
            g.fillArc(xStart, 200, 80, 80, 0, 180);
            xStart += 100; // Move to the next position
        }
    }
}

/*
 * <applet code = "Third.class" width = "600" height = "600">
 * </applet>
 */