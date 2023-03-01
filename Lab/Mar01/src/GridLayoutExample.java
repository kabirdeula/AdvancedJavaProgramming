import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    JFrame frame;
    public GridLayoutExample(){
        frame = new JFrame();
        JButton b1JButton = new JButton("1");
        JButton b2JButton = new JButton("2");
        JButton b3JButton = new JButton("3");
        JButton b4JButton = new JButton("4");
        JButton b5JButton = new JButton("5");
        JButton b6JButton = new JButton("6");
        JButton b7JButton = new JButton("7");
        JButton b8JButton = new JButton("8");
        JButton b9JButton = new JButton("9");
        
        frame.add(b1JButton);
        frame.add(b2JButton);
        frame.add(b3JButton);
        frame.add(b4JButton);
        frame.add(b5JButton);
        frame.add(b6JButton);
        frame.add(b7JButton);
        frame.add(b8JButton);
        frame.add(b9JButton);

        frame.setLayout(new GridLayout(3, 3));

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
