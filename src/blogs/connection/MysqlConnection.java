package blogs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class MysqlConnection {
 
 
   // Connect to MySQL
   public static Connection getMySQLConnection() throws SQLException,
           ClassNotFoundException {
       String hostName = "localhost";
       String dbName = "blogs";
       String userName = "root";
       String password = "";
       return getMySQLConnection(hostName, dbName, userName, password);
   }
 
   public static Connection getMySQLConnection(String hostName, String dbName,
           String userName, String password) throws SQLException,
           ClassNotFoundException {
	   Class.forName("com.mysql.jdbc.Driver");
	   String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
       Connection conn = DriverManager.getConnection(connectionURL, userName,
               password);
       return conn;
   }
}
