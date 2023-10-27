import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(550, 550);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // create a flow layout
        // add buttons to the panel in different regions
        panel.add(new Button("Button 1"));
        panel.add(new Button("Button 2"));
        panel.add(new Button("Button 3"));
        panel.add(new Button("Button 4"));
        panel.add(new Button("Button 5"));

        frame.add(panel); // add the panel to the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // adjust the size of the frame to fit the components
        frame.setVisible(true); // show the frame
        
    }
}

