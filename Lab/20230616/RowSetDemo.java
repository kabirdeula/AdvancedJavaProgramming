import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
    public static void main(String[] args) throws SQLException {

        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

        rowSet.setUrl("jdbc:mysql://localhost:3306/nccs");
        rowSet.setUsername("java");
        rowSet.setPassword("lunala");

        rowSet.setCommand("SELECT * FROM students");
        rowSet.execute();

        while (rowSet.next()) {
            System.out.println("ID: " + rowSet.getInt("id") + "\nName: " + rowSet.getString("name") + "\nAge: " + rowSet.getInt("age") + "\nGrade: " + rowSet.getString("grade"));
            System.out.println("-------------------------");
        }
        rowSet.close();
    }
}
