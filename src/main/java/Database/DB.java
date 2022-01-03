package Database;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class DB {
    // Ini adalah class untuk mengatur database
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
    public DefaultTableModel dtm;
    
    public static class User {
        public static void addAccount(String username, String password, String role) throws SQLException {
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            stmt = con.createStatement();
            if (!"".equals(username) && !"".equals(password))
                if (checkUserAvailablity(username) != true)
                    try {
                        stmt.executeUpdate("INSERT INTO user_account (username, password, role) VALUES ("
                            + "'" + username + "',"
                            + "'" + password + "',"
                            + "'" + role + "')");
                            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
                    }
                else
                    JOptionPane.showMessageDialog(null, "Username sudah ada");
            else
                JOptionPane.showMessageDialog(null, "Semua field harus diisi");
        }
        
        public static boolean loginAccount(String username, String password, String role) throws SQLException {
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM user_account");
            if (!"".equals(username) && !"".equals(password)) {
                if (checkUserAvailablity(username) == true)
                    try {
                        if (username.equals(rs.getString("username")) 
                                && password.equals(rs.getString("password")) 
                                && role.equals(rs.getString("role"))) {
                            JOptionPane.showMessageDialog(null, "Berhasil login");
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Password salah");
                            return false;
                        }
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Password salah");
                    }
                else
                    JOptionPane.showMessageDialog(null, "Username tidak ada");
                return false;
            } else
                JOptionPane.showMessageDialog(null, "Semua field harus diisi");
            return false;
        }
         
        public static boolean checkUserAvailablity(String userName) throws SQLException {
            // Mengecek apakah username tersedia
            List<String> list;
            list = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM user_account");
            while (rs.next()) {
                list.add(rs.getString("username"));
                if (list.contains(userName)) {
                    System.out.println("Berhasil");
                    return true;
                }
            }
            return false;
        }
    }
    
    public static class Book {
        public void retrieveBook(int book_id, int qty) throws SQLException {    
            // Menaruh kembali buku ke database
            try {
                stmt.executeUpdate("UPDATE book_table SET qty =+ " + Integer.toString(qty)
                    + "WHERE book_id = " + Integer.toString(book_id) + ";");
                    JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
            }
        }
    
        public static void lendBook(String book) throws SQLException {
            System.out.println(getBookID("Analisis data kesehatan"));
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            stmt = con.createStatement();
            try {
                rs = stmt.executeQuery(
                    "UPDATE book_table SET qty = qty - 1"
                            + "WHERE qty > 0 and judul_buku = '" + book + "';");
                rs = stmt.executeQuery(
                    "UPDATE user_account SET qty = qty + 1"
                            + "WHERE role = 'user';");
                stmt.executeUpdate("UPDATE book_table SET qty =+ " + 1
                    + "WHERE judul_buku = '" + book + "';");
                    JOptionPane.showMessageDialog(null, "Berhasil meminjam buku");
            } catch(SQLException ex) {
                
            }
        }
        
        public static int getBookID(String bookName) throws SQLException {
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT book_id FROM book_table WHERE judul_buku = '"
                    + bookName +"';");
            int i = rs.getInt(bookName);
            return i;            
        }
        
        public static int getBookQty(int book_id) throws SQLException {
            // Mengembalikan jumlah buku dari database berdasarkan judul buku
            int qty;
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            try (Statement statement = con.createStatement()) {
                ResultSet result = statement.executeQuery("SELECT qty FROM book_table WHERE book_id = " + book_id);
                qty = result.getInt("qty");
            } catch (SQLException e) { 
                // Mengembalikan nilai qty 0 jika terjadi error
                JOptionPane.showMessageDialog(null, "Perintah Salah: " + e);
                qty = 0;
            }
            return qty;
        }
        
        public boolean checkBookAvailablity(String judulBuku) throws SQLException {
            List<String> list;
            list = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM book_table");
            while (rs.next()) {
                list.add(rs.getString("judul_buku"));
                if (list.contains(judulBuku)) {
                    return false;
                }
            }
            return true;
        }
        public static List getBookList() throws SQLException {
        Array listBuku = null;
        String buku;
        int i = 0;
        List<String> list = new ArrayList<>();  
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM book_table");

            while (rs.next()) {
                list.add(rs.getString("judul_buku"));
                list.add(rs.getString("qty"));
                i += 1;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error");
        }
            return list;
        }
    }
}
