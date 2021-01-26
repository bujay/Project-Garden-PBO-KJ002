import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  
   
public class Database_RecordData {  
   
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:Penyiraman_Tanaman.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void insert(String jenis) {  
        String sql = "INSERT INTO Jenis_Tanaman(name) VALUES(?)";  
   
        try{  
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, jenis);  
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }    
   
}  
