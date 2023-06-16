import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo implements MouseListener {
    private JFrame frame;
    private JLabel label;

    public MouseEventDemo() {
        frame = new JFrame("MouseEvent Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("No Mouse Event Yet.");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.addMouseListener(this);
        frame.add(label);
        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" +  e.getX() + ", " + e.getY() + ")");
    }
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" +  e.getX() + ", " + e.getY() + ")");
    }
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" +  e.getX() + ", " + e.getY() + ")");
    }
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at (" +  e.getX() + ", " + e.getY() + ")");
    }
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited at (" +  e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
