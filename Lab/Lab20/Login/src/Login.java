import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> accountTypeComboBox; 
    
    public Login(){
        frame = new JFrame("Login Form");

        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel loginPanel = new JPanel(new FlowLayout());
        
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel accountTypeLabel = new JLabel("Account Type:");
        
        usernameField = new JTextField(25);
        passwordField = new JPasswordField(25);
        
        String[] accountTypes = {"Student", "Teacher"};
        accountTypeComboBox = new JComboBox<>(accountTypes);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginButtonListener());
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new CancelButtonListener());

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        loginPanel.add(accountTypeLabel);
        loginPanel.add(accountTypeComboBox);

        loginPanel.add(loginButton);
        loginPanel.add(cancelButton);
        
        mainPanel.add(loginPanel, BorderLayout.CENTER);
        
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    private class LoginButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String accountType = (String) accountTypeComboBox.getSelectedItem();

            if (validateLogin(username, password, accountType)) {
                JOptionPane.showMessageDialog(frame, "Login Successful as " + accountType);
            } else {
                JOptionPane.showMessageDialog(frame, "Login failed. Please check your credentials.");
            }
        }

        private boolean validateLogin(String username, String password, String accountType){
            return username.equals("Sanisha") && password.equals("gemini") && accountType.equals("Student");
        }
    }

    private class CancelButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
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
//         usernameField = new JTextField(10);

//         passwordField = new JPasswordField(10);

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
//     }

//     private class LoginButtonListener implements ActionListener {
//         public void actionPerformed(ActionEvent e) {

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
// -------------------------------------------------------------
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class LoginApp {

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
