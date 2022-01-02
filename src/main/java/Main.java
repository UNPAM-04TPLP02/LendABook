import com.formdev.flatlaf.FlatDarkLaf;
import UI.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();

        setTitle("Lend A Book");

        Tab.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
         //Dark Theme
        FlatDarkLaf.setup();
        Main borrowWindow = new Main();
        PinjamUI pinjam = new PinjamUI();
        EditUI editui = new EditUI();
        LoginUI login = new LoginUI();
        
        borrowWindow.Tab.addTab("Pinjam Buku", pinjam);
        borrowWindow.Tab.addTab("Edit Buku", editui);
        
        borrowWindow.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        borrowWindow.setExtendedState(Main.MAXIMIZED_BOTH);

        java.awt.EventQueue.invokeLater(() -> {
            login.setBorrowWindow(borrowWindow);
            //login.setEditWindow()
            login.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    // End of variables declaration//GEN-END:variables
}
