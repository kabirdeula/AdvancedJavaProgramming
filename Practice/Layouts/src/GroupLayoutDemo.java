import java.awt.*;
import javax.swing.*;

public class GroupLayoutDemo {
    JFrame frame;
    JButton button1, button2, button3, button4, button5, button6;
    JPanel panel;

    GroupLayoutDemo() {
        frame = new JFrame("Group Layout Demo");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        panel.setBackground(Color.GRAY);
        frame.add(panel);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        button6 = new JButton("Button 6");

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
                        .addGroup(layout.createParallelGroup()
                                .addComponent(button4)
                                .addComponent(button5)
                                .addComponent(button6)));

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
                        .addComponent(button4)
                        .addComponent(button5)
                        .addComponent(button6));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
}
