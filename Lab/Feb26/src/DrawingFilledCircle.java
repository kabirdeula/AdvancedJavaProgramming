import java.awt.*;
import javax.swing.*;

public class DrawingFilledCircle extends Canvas{

    public void paint(Graphics graphics){
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(50, 50, 100, 100);
        graphics.setColor(Color.RED);
        graphics.drawOval(50, 50, 100, 100);
    }    

    public static void main(String[] args){
        DrawingFilledCircle canvas = new DrawingFilledCircle();
        JFrame frame = new JFrame("Yellow Circle with Red Border");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
