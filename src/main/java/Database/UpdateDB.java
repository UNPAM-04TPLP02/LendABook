package Database;

import java.sql.*;

/*
    Ini adalah class untuk mengatur database
*/

public class UpdateDB {
    public static void getDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1/book_db", "root", "")) {
                Statement stmt = con.createStatement();
                
                ResultSet rs = stmt.executeQuery("select * from book_table");
                System.out.println(rs);
                while (rs.next())
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void addAccount() {
        
    }
}
