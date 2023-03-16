// import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerDemo extends JFrame implements ActionListener{
    private JTextField jTextField;
    private JButton jButton;

    ActionListenerDemo(){
        super("Action Listener Demo");
        jTextField = new JTextField(20);
        jButton = new JButton("Enter");
        
        jButton.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name: "));
        panel.add(jTextField);
        panel.add(jButton);
        add(panel);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = jTextField.getText();
        JOptionPane.showMessageDialog(this, "Welcome " + name + ".");
    }

    public static void main(String[] args) {
        new ActionListenerDemo();
    }
}
