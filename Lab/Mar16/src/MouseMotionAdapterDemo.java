import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapterDemo extends MouseMotionAdapter {
    Frame frame;

    MouseMotionAdapterDemo() {
        frame = new Frame("Mouse Motion Adapter");
        frame.addMouseMotionListener(this);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = frame.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterDemo();
    }
}