import java.sql.*;

public class PreparedInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO bcaSix VALUES (?, ?, ?)");
            // preparedStatement.setInt(1, 11);
            // preparedStatement.setString(2, "Nischal Basnet");
            // preparedStatement.setString(3, "Budanilkanta");

            preparedStatement.setInt(1, 12);
            preparedStatement.setString(2, "Prabin Thapa Magar");
            preparedStatement.setString(3, "Pepsicola");

            preparedStatement.setInt(1, 13);
            preparedStatement.setString(2, "Rabin Dangol");
            preparedStatement.setString(3, "Tokha");

            preparedStatement.setInt(1, 14);
            preparedStatement.setString(2, "Rakesh Shrestha");
            preparedStatement.setString(3, "Tokha");

            preparedStatement.setInt(1, 15);
            preparedStatement.setString(2, "Romit Manandhar");
            preparedStatement.setString(3, "Teku");

            int i = preparedStatement.executeUpdate();
            System.out.println(i + "records inserted.");

            connection.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
