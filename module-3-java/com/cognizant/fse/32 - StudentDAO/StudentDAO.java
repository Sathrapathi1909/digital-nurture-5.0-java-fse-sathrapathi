import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try {

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            String insertQuery =
                    "INSERT INTO students(name) VALUES(?)";

            PreparedStatement insertStatement =
                    connection.prepareStatement(insertQuery);

            insertStatement.setString(1, "Arun");
            insertStatement.executeUpdate();

            String updateQuery =
                    "UPDATE students SET name=? WHERE id=?";

            PreparedStatement updateStatement =
                    connection.prepareStatement(updateQuery);

            updateStatement.setString(1, "Vijay");
            updateStatement.setInt(2, 1);

            updateStatement.executeUpdate();

            System.out.println("Insert and Update Successful");

            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
