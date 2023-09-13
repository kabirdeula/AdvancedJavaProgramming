import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo {
    JFrame frame;
    JButton button1, button2, button3, button4, button5, button6;
    GridBagConstraints gridBagConstraints;

    GridBagLayoutDemo(){
        frame = new JFrame("Grid Bag Layout Demo");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        gridBagConstraints = new GridBagConstraints();

        button1 = new JButton("Button 1");
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.ipady = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        frame.add(button1, gridBagConstraints);

        button2 = new JButton("Button 2");
        gridBagConstraints.gridx = 1;
        frame.add(button2, gridBagConstraints);
        
        button3 = new JButton("Button 3");
        gridBagConstraints.gridx = 2;
        frame.add(button3, gridBagConstraints);
        
        button4 = new JButton("Button 4");
        gridBagConstraints.ipady = 40;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.add(button4, gridBagConstraints);
        
        button5 = new JButton("Button 5");
        gridBagConstraints.ipady = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        frame.add(button5, gridBagConstraints);

        button6 = new JButton("Button 6");
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        frame.add(button6, gridBagConstraints);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
