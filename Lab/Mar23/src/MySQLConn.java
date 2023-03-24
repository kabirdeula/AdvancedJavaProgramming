import java.sql.*;

public class MySQLConn {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");

            Statement stmStatement = conn.createStatement();
            ResultSet resultSet = stmStatement.executeQuery("select * from bcaSix");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +  resultSet.getString(2) + " " + resultSet.getString(3));
                // conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
