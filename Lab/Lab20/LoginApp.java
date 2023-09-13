import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {
    private JFrame mainFrame;
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JComboBox<String> accountTypeComboBox;

    public LoginApp() {
        prepareGUI();
    }

    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        loginApp.showLoginForm();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Login Form");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new FlowLayout());

        JLabel userIdLabel = new JLabel("User ID: ");
        userIdField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(15);

        JLabel accountTypeLabel = new JLabel("Account Type: ");
        String[] accountTypes = {"Student", "Teacher"};
        accountTypeComboBox = new JComboBox<>(accountTypes);

        formPanel.add(userIdLabel);
        formPanel.add(userIdField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        formPanel.add(accountTypeLabel);
        formPanel.add(accountTypeComboBox);

        mainFrame.add(formPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                String password = new String(passwordField.getPassword());
                String accountType = (String) accountTypeComboBox.getSelectedItem();

                if (authenticateUser(userId, password)) {
                    JOptionPane.showMessageDialog(mainFrame, "Login successful as " + accountType);
                    openMainWindow(userId, accountType);
                } else {
                    JOptionPane.showMessageDialog(mainFrame, "Login failed. Please check your credentials.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);

        mainFrame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private boolean authenticateUser(String userId, String password) {
        // Replace this with your actual authentication logic (e.g., database check)
        // For simplicity, let's assume user "admin" with password "admin" is valid
        return userId.equals("student") && password.equals("student");
    }

    private void openMainWindow(String userId, String accountType) {
        // Replace this with code to open the main window of your application
        // For now, let's just show a message with the user details
        JFrame mainWindow = new JFrame("Main Window");
        mainWindow.setSize(300, 200);
        mainWindow.setLayout(new FlowLayout());

        JLabel userDetailsLabel = new JLabel("Welcome, " + accountType + " " + userId);
        mainWindow.add(userDetailsLabel);

        mainWindow.setVisible(true);
    }

    private void showLoginForm() {
        mainFrame.setVisible(true);
    }
}
