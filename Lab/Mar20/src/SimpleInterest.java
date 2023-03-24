import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest implements ActionListener{
    private JFrame Jframe;
    private JLabel principalLabel, timeLabel, rateLabel;
    private JTextField principalText, timeText, rateText;
    private JButton calculateButton;

    SimpleInterest(){
        Jframe = new JFrame("Simple Interest");
        principalLabel = new JLabel("Principal");
        timeLabel = new JLabel("Time");
        rateLabel = new JLabel("Rate");
        
        principalText = new JTextField(20);
        timeText = new JTextField(20);
        rateText = new JTextField(20);

        calculateButton = new JButton("Calculate");
        
        calculateButton.addActionListener(this);

        Jframe.setLayout(new GridLayout(4, 2));

        Jframe.add(principalLabel);
        Jframe.add(principalText);
        Jframe.add(timeLabel);
        Jframe.add(timeText);
        Jframe.add(rateLabel);
        Jframe.add(rateText);
        Jframe.add(calculateButton);

        Jframe.setSize(300, 300);
        Jframe.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        int principal = Integer.parseInt(principalText.getText());
        int time = Integer.parseInt(timeText.getText());
        int rate = Integer.parseInt(rateText.getText());
        double simpleInterest = (principal * time * rate) / 100;

        JOptionPane.showMessageDialog(Jframe, "Simple Interest: " + simpleInterest);
    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}