// import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nccs", "java", "lunala");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/nccs");
        rowSet.setUsername("java");
        rowSet.setPassword("lunala");

        rowSet.setCommand("select * from bcaSix");
        rowSet.execute();

        while (rowSet.next()) {
            System.out.println("ID:" + rowSet.getInt(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Address: " + rowSet.getString(3));
        }
    }
}
        
