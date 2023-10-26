import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setSize(550, 550);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3)); // create a grid layout
        // add buttons to the panel in different regions
        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));

        frame.add(panel); // add the panel to the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // adjust the size of the frame to fit the components
        frame.setVisible(true); // show the frame

    }
} 
