import java.sql.*;

public class ScrollResultSet {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("Select * from bcaSix");
        System.out.println("RECORDS IN THE TABLE");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " -> " + resultSet.getString(2));
        }
        resultSet.first();
        System.out.println("First Record");
        System.out.println(resultSet.getInt(1) + " -> " + resultSet.getString(2));
        resultSet.absolute(3);
        System.out.println("Third Record");
        System.out.println(resultSet.getInt(1) + " -> " + resultSet.getString(2));
        resultSet.last();
        System.out.println("Last Record");
        System.out.println(resultSet.getInt(1) + " -> " + resultSet.getString(2));
        resultSet.previous();
        resultSet.relative(-1);
        System.out.println("Last to First Record");
        System.out.println(resultSet.getInt(1) + " -> " + resultSet.getString(2));
        connection.close();
    }
}
