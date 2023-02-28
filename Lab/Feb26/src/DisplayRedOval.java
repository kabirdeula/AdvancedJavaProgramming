import java.awt.*;
import javax.swing.*;

public class DisplayRedOval {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Red Oval with Yellow Fill");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to draw on
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillOval(50, 50, 200, 100);
                g.setColor(Color.YELLOW);
                g.fillOval(75, 75, 150, 50);
            }
        };

        // Set the preferred size of the JPanel
        panel.setPreferredSize(new Dimension(300, 200));

        // Add the panel to the JFrame
        frame.getContentPane().add(panel);

        // Pack the JFrame and make it visible
        frame.pack();
        frame.setVisible(true);
    }
}
