import com.formdev.flatlaf.FlatDarkLaf;
import UI.*;

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
    
    public static void main(String args[]) {
        
        FlatDarkLaf.setup(); //Dark Theme
        //Main borrowWindow = new Main();
        LoginUI login = new LoginUI();
        EditUI editui = new EditUI();
        BorrowUI borrow = new BorrowUI();
        login.setDefaultCloseOperation(LoginUI.EXIT_ON_CLOSE);
        editui.setDefaultCloseOperation(EditUI.EXIT_ON_CLOSE);

        java.awt.EventQueue.invokeLater(() -> {
            login.setBorrowWindow(borrow);
            login.setEditWindow(editui);
            login.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
