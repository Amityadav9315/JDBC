import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/yourdatabase";
            String user = "yourusername";
            String password = "yourpassword";
            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connection successful!");

            // Your database operations go here

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
