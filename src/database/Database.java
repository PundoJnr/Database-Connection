package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

   
    public static void main(String[] args) {
        try{
            String host="jdbc:derby://localhost:1527/123 [arthur on ARTHUR]";
            String uName="arthur";
            String uPass="arthur";
            Connection con = DriverManager.getConnection(host,uName,uPass);
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }
    
}
