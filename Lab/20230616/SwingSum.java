import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingSum {
    private JFrame frame;
    private JTextField num1TextField, num2TextField, resultTextField;

    public SwingSum() {
        frame = new JFrame("Sum of Two Numbers.");
        frame.setSize(330, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setLayout(new GridLayout(4, 2));

        JLabel num1Label = new JLabel("Number 1:");
        num1TextField = new JTextField(10);
        panel.add(num1Label);
        panel.add(num1TextField);

        JLabel num2Label = new JLabel("Number 2:");
        num2TextField = new JTextField(10);
        panel.add(num2Label);
        panel.add(num2TextField);

        JButton addButton = new JButton("Sum");
        addButton.addActionListener(new ButtonListener());
        panel.add(addButton);

        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);
        panel.add(resultLabel);
        panel.add(resultTextField);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(num1TextField.getText());
                int num2 = Integer.parseInt(num2TextField.getText());
                int sum = num1 + num2;
                resultTextField.setText(String.valueOf(sum));
            } catch (Exception error) {
                JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingSum();
            }
        });
    }
}
