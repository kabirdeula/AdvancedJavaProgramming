import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    private JLabel titleLabel, userLabel, passLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;

    public LoginForm() {
        // Set the title of the frame
        setTitle("Login Form");

        // Create the components
        titleLabel = new JLabel("Login Form");
        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        userText = new JTextField(20);
        passText = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Add action listeners to the components
        loginButton.addActionListener(this);

        // Set the layout of the frame
        setLayout(new GridLayout(4, 2));

        // Add the components to the frame
        add(titleLabel);
        add(new JLabel(""));
        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(new JLabel(""));
        add(loginButton);

        // Set the size of the frame and make it visible
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the username and password entered by the user
        String username = userText.getText();
        String password = new String(passText.getPassword());

        // Check if the username and password are valid
        if (username.equals("bca6") && password.equals("noisystudents")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
