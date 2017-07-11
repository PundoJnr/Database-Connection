package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
import java.sql.*;
import java.util.*;


public class Database {

   
    public static void main(String[] args) {
        //connecting to database
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");//database class
            String host="jdbc:derby://localhost:1527/123 [arthur on ARTHUR]";//database URL
            String uName="arthur";//name of database
            String uPass="arthur";//password of database
            Connection con = DriverManager.getConnection(host,uName,uPass);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
       
       //Write to the database 
    }
    
}
