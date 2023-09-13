import javax.swing.*;
import java.awt.*;

public class Login {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> accountTypeComboBox; 
    
    public Login(){
        frame = new JFrame("Login Form");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel loginPanel = new JPanel(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        
        loginPanel.add(usernameLabel);
        
        
    }

    public static void main(String[] args) {
        new Login();
    }
}

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class LoginForm {

//     public LoginForm() {
//         JPanel mainPanel = new JPanel(new BorderLayout());

//         JPanel loginPanel = new JPanel(new FlowLayout());

//         JLabel usernameLabel = new JLabel("Username:");
//         usernameField = new JTextField(10);

//         JLabel passwordLabel = new JLabel("Password:");
//         passwordField = new JPasswordField(10);

//         JLabel account_typeLabel = new JLabel("Account Type:");
//         String[] account_types = { "Student", "Teacher" };
//         account_typeComboBox = new JComboBox<>(account_types);

//         JButton loginButton = new JButton("Login");
//         loginButton.addActionListener(new LoginButtonListener());

//         JButton cancelButton = new JButton("Cancel");
//         cancelButton.addActionListener(new CancelButtonListener());

//         loginPanel.add(usernameLabel);
//         loginPanel.add(usernameField);
//         loginPanel.add(passwordLabel);
//         loginPanel.add(passwordField);
//         loginPanel.add(account_typeLabel);
//         loginPanel.add(account_typeComboBox);
//         loginPanel.add(loginButton);
//         loginPanel.add(cancelButton);

//         mainPanel.add(loginPanel, BorderLayout.CENTER);

//         frame.getContentPane().add(mainPanel);
//         frame.setVisible(true);
//     }

//     private class LoginButtonListener implements ActionListener {
//         public void actionPerformed(ActionEvent e) {
//             String username = usernameField.getText();
//             String password = new String(passwordField.getPassword());
//             String account_type = (String) account_typeComboBox.getSelectedItem();

//             if (validateLogin(username, password, account_type)) {
//                 JOptionPane.showMessageDialog(frame, "Login successful!");
//             } else {
//                 JOptionPane.showMessageDialog(frame, "Invalid login credentials. Please try again.");
//             }
//         }

//         private boolean validateLogin(String username, String password, String account_type) {
//             Connection connection = null;
//             PreparedStatement statement = null;
//             ResultSet resultSet = null;
//             boolean isValid = false;

//             try {
//                 String url = "jdbc:mysql://localhost:3306/nccs?transactionIsolation=READ_COMMITTED";
//                 connection = DriverManager.getConnection(url, "java", "lunala");

//                 // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");
//                 String query = "SELECT * FROM users WHERE username = ? AND password = ? AND account_type = ?";
//                 statement = connection.prepareStatement(query);
//                 statement.setString(1, username);
//                 statement.setString(2, password);
//                 statement.setString(3, account_type);
//                 resultSet = statement.executeQuery();

//                 if (resultSet.next()) {
//                     isValid = true;
//                 }
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             } finally {
//                 try {
//                     if (resultSet != null) {
//                         resultSet.close();
//                     }
//                     if (statement != null) {
//                         statement.close();
//                     }
//                     if (connection != null) {
//                         connection.close();
//                     }
//                 } catch (SQLException e) {
//                     e.printStackTrace();
//                 }
//             }
//             return isValid;
//         }
//     }

//     private class CancelButtonListener implements ActionListener {
//         public void actionPerformed(ActionEvent e) {
//             System.exit(0);
//         }
//     }

//     public static void main(String[] args) {
//         new LoginForm();
//     }
// }

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class LoginApp {
//     private JFrame mainFrame;
//     private JTextField userIdField;
//     private JPasswordField passwordField;
//     private JComboBox<String> accountTypeComboBox;

//     public LoginApp() {
//         prepareGUI();
//     }

//     public static void main(String[] args) {
//         LoginApp loginApp = new LoginApp();
//         loginApp.showLoginForm();
//     }

//     private void prepareGUI() {
//         mainFrame = new JFrame("Login Form");
//         mainFrame.setSize(400, 300);
//         mainFrame.setLayout(new BorderLayout());
//         mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JPanel formPanel = new JPanel();
//         formPanel.setLayout(new FlowLayout());

//         JLabel userIdLabel = new JLabel("User ID: ");
//         userIdField = new JTextField(15);

//         JLabel passwordLabel = new JLabel("Password: ");
//         passwordField = new JPasswordField(15);

//         JLabel accountTypeLabel = new JLabel("Account Type: ");
//         String[] accountTypes = {"Student", "Teacher"};
//         accountTypeComboBox = new JComboBox<>(accountTypes);

//         formPanel.add(userIdLabel);
//         formPanel.add(userIdField);
//         formPanel.add(passwordLabel);
//         formPanel.add(passwordField);
//         formPanel.add(accountTypeLabel);
//         formPanel.add(accountTypeComboBox);

//         mainFrame.add(formPanel, BorderLayout.CENTER);

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.setLayout(new FlowLayout());

//         JButton loginButton = new JButton("Login");
//         JButton cancelButton = new JButton("Cancel");

//         loginButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 String userId = userIdField.getText();
//                 String password = new String(passwordField.getPassword());
//                 String accountType = (String) accountTypeComboBox.getSelectedItem();

//                 if (authenticateUser(userId, password)) {
//                     JOptionPane.showMessageDialog(mainFrame, "Login successful as " + accountType);
//                     openMainWindow(userId, accountType);
//                 } else {
//                     JOptionPane.showMessageDialog(mainFrame, "Login failed. Please check your credentials.");
//                 }
//             }
//         });

//         cancelButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 System.exit(0);
//             }
//         });

//         buttonPanel.add(loginButton);
//         buttonPanel.add(cancelButton);

//         mainFrame.add(buttonPanel, BorderLayout.SOUTH);
//     }

//     private boolean authenticateUser(String userId, String password) {
//         // Replace this with your actual authentication logic (e.g., database check)
//         // For simplicity, let's assume user "admin" with password "admin" is valid
//         return userId.equals("student") && password.equals("student");
//     }

//     private void openMainWindow(String userId, String accountType) {
//         // Replace this with code to open the main window of your application
//         // For now, let's just show a message with the user details
//         JFrame mainWindow = new JFrame("Main Window");
//         mainWindow.setSize(300, 200);
//         mainWindow.setLayout(new FlowLayout());

//         JLabel userDetailsLabel = new JLabel("Welcome, " + accountType + " " + userId);
//         mainWindow.add(userDetailsLabel);

//         mainWindow.setVisible(true);
//     }

//     private void showLoginForm() {
//         mainFrame.setVisible(true);
//     }
// }
