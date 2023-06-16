import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxAndRadioButtonDemo {
    private JFrame frame;
    private JTextField textField;
    private JCheckBox[] checkboxes;
    private JRadioButton[] radioButtons;

    public CheckboxAndRadioButtonDemo() {
        frame = new JFrame("Checkbox and Radio Button Example.");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1));

        textField = new JTextField(10);

        JLabel checkboxLabel = new JLabel("Checkboxes: ");
        panel.add(checkboxLabel);

        checkboxes = new JCheckBox[10];
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i] = new JCheckBox("Checkbox " + (i + 1));
            checkboxes[i].addItemListener(new CheckboxListener());
            panel.add(checkboxes[i]);
        }

        JLabel radioButtonLabel = new JLabel("Radio Buttons: ");
        panel.add(radioButtonLabel);

        ButtonGroup buttonGroup = new ButtonGroup();
        radioButtons = new JRadioButton[10];
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton("Option " + (i + 1));
            radioButtons[i].addItemListener(new RadioButtonListener());
            buttonGroup.add(radioButtons[i]);
            panel.add(radioButtons[i]);
        }

        panel.add(textField);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class CheckboxListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String selected = "";
            for (JCheckBox checkBox : checkboxes) {
                if (checkBox.isSelected()) {
                    selected += checkBox.getText() + " ";
                }
            }
            textField.setText(selected.trim());
        }
    }

    public class RadioButtonListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String selected = "";
            for (JRadioButton radioButton : radioButtons) {
                if (radioButton.isSelected()) {
                    selected = radioButton.getText();
                    break;
                }
            }
            textField.setText(selected);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CheckboxAndRadioButtonDemo();
            }
        });
    }

}
