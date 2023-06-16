import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Demo");
        frame.setSize(400, 300);

        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton centerButton = new JButton("Center");
        
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(centerButton, BorderLayout.CENTER);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(southButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
