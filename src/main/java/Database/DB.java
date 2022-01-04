package Database;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Objects;


public class DB {

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
    public DefaultTableModel dtm;
    private final String databaseName = "book_db";
    private static String username; // Disimpan saat user login dan digunakan untuk memeriksa username
    
    public DB() {
        koneksi();
    }
    
    public void simpan(
            String judul, 
            String penulis, 
            String penerbit, 
            int tahun, 
            int qty) throws SQLException {
                stmt.executeUpdate("INSERT INTO book_table VALUES ("
                + "'" + judul + "',"
                + "'" + penulis + "',"
                + "'" + penerbit + "',"
                + "'" + tahun + "',"
                + "'" + qty + "')");
    }
    
    
    private void koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/" + databaseName, "root", "");
            stmt = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public static class User {
        
        public static void setUserName(String usr) {
            username = usr;
        }
        
        
        public static void addAccount(String username, String password, String role) throws SQLException {
            if (!"".equals(username) && !"".equals(password))
                if (checkUserAvailablity(username) != true)
                    try {
                        stmt.executeUpdate(
                                "INSERT INTO user_account (username, password, role, qty) VALUES ("
                                        + "'" + username + "'," + "'" + password + "','" + role + "'," + 0 +  ");");
                        JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "Perintah Salah: " + e);
                    }
                else
                    JOptionPane.showMessageDialog(null, "Username sudah ada");
            else
                JOptionPane.showMessageDialog(null, "Semua field harus diisi");
        }
        
        
        public static boolean loginAccount(String username, String password, String role) throws SQLException {
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
            List<String> list;
            list = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM user_account");
            while (rs.next()) {
                list.add(rs.getString("username"));
                if (list.contains(userName)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    
    public static class Book {
        public void retrieveBook(int book_id, int qty) throws SQLException {    
            try {
                stmt.executeUpdate("UPDATE book_table SET qty = qty + " + Integer.toString(qty)
                    + "WHERE book_id = " + Integer.toString(book_id) + ";");
                stmt.executeQuery(
                        "UPDATE user_account SET qty = qty - 1 " + " WHERE username = '" + username + "';");
                
                    JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
            }
        }
    
        
        public static void lendBook(String book) throws SQLException {
            stmt = con.createStatement();
            int id = getBookID(book);
            System.out.println(id);
            //UPDATE book_table SET qty = qty + " + qty + " WHERE judul_buku = '" + bookName + "';"
            stmt.executeUpdate("UPDATE book_table SET qty = qty - 1 WHERE judul_buku = '" + book + "';");
            stmt.executeUpdate("UPDATE user_account SET qty = qty + 1, book_id = " + id + " WHERE username = '" + username + "';");
            JOptionPane.showMessageDialog(null, "Berhasil meminjam buku");

        }
        
        
        public static int getBookID(String bookName) throws SQLException {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT book_id FROM book_table WHERE judul_buku = '" + bookName + "';");
            int i = 0;
            while (rs.next()) {
                i = rs.getInt("book_id");
                
                break;
            }
            return i;            
        }
        
        
        public static void setBookQty(String bookName, int qty) throws SQLException {
            stmt = con.createStatement();
            try {
                stmt.executeUpdate(
                        "UPDATE book_table SET qty = qty + " + qty + " WHERE judul_buku = '" + bookName + "';");
                JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Perintah Salah:" + e);
            }
        }   
        
        public static int getBookQty(int book_id) throws SQLException {
            int qty;
            try (Statement statement = con.createStatement()) {
                ResultSet result = statement.executeQuery("SELECT qty FROM book_table WHERE book_id = " + book_id);
                qty = result.getInt("qty");
            } catch (SQLException e) { 
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
        
        
        public static List getBookList(boolean returnAll, boolean isUser) throws SQLException {
            List<String> list = new ArrayList<>();  
            
            try {
                stmt = con.createStatement();
                if (isUser) {
                    rs = stmt.executeQuery("SELECT * FROM user_account WHERE username = '" +username+ "';");
                    while (rs.next()) {
                        list.add(rs.getString("qty"));
                        if (Objects.isNull(rs.getString("book_id")))
                            list.add("0");
                        else
                            list.add(rs.getString("book_id"));
                    }
                 
                } else {
                    rs = stmt.executeQuery("SELECT * FROM book_table");
                    if (returnAll)
                        while (rs.next()) {
                            list.add(rs.getString("book_id"));
                            list.add(rs.getString("judul_buku"));
                            list.add(rs.getString("penulis"));
                            list.add(rs.getString("penerbit"));
                            list.add(rs.getString("tahun"));
                            list.add(rs.getString("qty"));  
                    } else {
                        while (rs.next()) {
                            list.add(rs.getString("judul_buku"));
                            list.add(rs.getString("qty"));
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error");
            }
            return list;
        }
    }
}
