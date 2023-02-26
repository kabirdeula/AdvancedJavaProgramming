import javax.swing.*;
import java.awt.*;

public class GreenLine extends JFrame{
    public GreenLine(){
        setTitle("Display Green Line");

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                graphics.setColor(Color.GREEN);
                graphics.drawLine(50, 50, 250, 250);
            }
        };

        getContentPane().add(panel);
        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GreenLine();
    }
}
