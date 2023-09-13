import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
    JFrame frame;
    JButton eastButton, westButton, northButton, southButton, centerButton;

    BorderLayoutDemo(){
        frame = new JFrame("Border Layout Demo");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(5, 5));

        eastButton = new JButton("East");
        westButton = new JButton("West");
        northButton = new JButton("North");
        southButton = new JButton("South");
        centerButton = new JButton("Center");
        
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(centerButton, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
