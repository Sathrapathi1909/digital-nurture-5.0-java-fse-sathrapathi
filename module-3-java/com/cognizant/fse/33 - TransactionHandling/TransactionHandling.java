import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandling {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try {

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            connection.setAutoCommit(false);

            PreparedStatement debit =
                    connection.prepareStatement(
                            "UPDATE accounts SET balance = balance - 100 WHERE id = 1");

            PreparedStatement credit =
                    connection.prepareStatement(
                            "UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            debit.executeUpdate();
            credit.executeUpdate();

            connection.commit();

            System.out.println("Transaction Successful");

            connection.close();

        } catch (Exception e) {
            System.out.println("Transaction Failed");
        }
    }
}
