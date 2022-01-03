import com.formdev.flatlaf.FlatDarkLaf;
import UI.*;
import java.sql.SQLException;
import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Lend A Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) throws SQLException {
        
        FlatDarkLaf.setup(); //Dark Theme
        LoginUI login = new LoginUI();
        EditUI editUI = new EditUI();
        BorrowUI borrowUI = new BorrowUI();
        
        login.setDefaultCloseOperation(LoginUI.EXIT_ON_CLOSE);
        editUI.setDefaultCloseOperation(EditUI.EXIT_ON_CLOSE);
        borrowUI.setDefaultCloseOperation(BorrowUI.EXIT_ON_CLOSE);
        
        editUI.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        borrowUI.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        java.awt.EventQueue.invokeLater(() -> {
            LoginUI.setBorrowWindow(borrowUI);
            LoginUI.setEditWindow(editUI);
            login.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
