import java.sql.*;

public class InsertDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");

            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO bcaSix VALUES (6, 'Chiran Rai', 'Dallu'),(7, 'Kabir Deula', 'Chetrapati'), (8, 'Kabita Phuyal', 'Pepsicola'), (9, 'Kiran Manandhar', 'Basantapur'), (10, 'Manish Pandey', 'Godawari')");
            connection.close();
        } catch (Exception e) {
            System.err.println("Got an exception");
            System.err.println(e.getMessage());
        }
    }
}