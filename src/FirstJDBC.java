
import java.sql.*;
public class FirstJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.driver");
            //creating connection
            String url="jdbc :mysql :// localhost :3306 /youtube";
            String username="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("connection is closed");
            }
            else{
                System.out.println("Connection created");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
