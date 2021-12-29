package Database;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateDB {
    /*
        Ini adalah class untuk mengatur database
    */
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public DefaultTableModel dtm;

    public static void getDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/book_db", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from book_table");
            System.out.println(rs);
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public void addAccount(String username, String password) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/book_db", "root", "");
        stmt = con.createStatement();
        stmt.executeQuery("INSERT INTO user_account ()");
        try {
            stmt.executeUpdate("INSERT INTO user_account (username, password) VALUES ("
                + "'" + username + "',"
                + "'" + password + "')");
                JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
        }
    }
    
    // Menaruh kembali buku ke database
    public static void retreiveBook() {
        
    }
    
    // Mengambil buku dari database dengan mengurangi nilai qty
    public static void lendBook() {
        
    }
}
