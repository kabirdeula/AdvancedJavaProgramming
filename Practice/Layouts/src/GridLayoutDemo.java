import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
    JFrame frame;
    JButton button1, button2, button3, button4, button5, button6;

    GridLayoutDemo(){
        frame = new JFrame("Grid Layout Demo");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 0, 5, 5));

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        button6 = new JButton("Button 6");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();   
    }
}
