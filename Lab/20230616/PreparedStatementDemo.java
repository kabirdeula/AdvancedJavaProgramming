import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");

            PreparedStatement statement = connection.prepareStatement("INSERT INTO students (name, age, grade) VALUES (?, ?, ?)");

            statement.setString(1, "Aayush Manandhar");
            statement.setInt(2, 20);
            statement.setString(3, "A");

            statement.setString(1, "Bhuwan Singh");
            statement.setInt(2, 20);
            statement.setString(3, "B");

            int rowsAffected = statement.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("Data Inserted Successfully.");
            }else{
                System.out.println("Data Insertion Failed.");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
