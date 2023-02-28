import java.awt.*;
import javax.swing.*;

public class Border {
    JFrame frame;
    Border(){
        frame = new JFrame();

        JButton button1 = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");
        JButton button3 = new JButton("EAST");
        JButton button4 = new JButton("WEST");
        JButton button5 = new JButton("CENTER");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }   
    public static void main(String[] args) {
        new Border();
    } 
}
