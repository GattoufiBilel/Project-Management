package utilitaire;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    
    private static Connection conn;
    
    static 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbproduit" , "root" , "");
             System.out.println("connection avec succes ");
        }   
        catch(ClassNotFoundException | SQLException e) 
        {
            System.err.println("Err : Not connected -- server not actived -- ");
        }
    }
    
    public static Connection getConn() 
    {
        return conn;
    }
    
}
