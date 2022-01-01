import com.formdev.flatlaf.FlatDarkLaf;
import UI.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import javax.swing.JButton;

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
        FlatDarkLaf.setup(); //Dark Theme
        // Inisialisasi komponen
        Main frame = new Main();
        LoginUI login = new LoginUI();
        PinjamUI pinjam = new PinjamUI();
        EditUI editui = new EditUI();

        frame.setContentPane(login);
        frame.pack();
        frame.Tab.addTab("Pinjam Buku", pinjam);
        frame.Tab.addTab("Edit Buku", editui);
        frame.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        frame.setExtendedState(Main.MAXIMIZED_BOTH); // Buat seluruh program fullscreen
        
        java.awt.EventQueue.invokeLater(() -> {
            //login.setVisible(true);
            //login.addComponentListener((ComponentListener) frame);
            frame.setVisible(true);  
        });
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    // End of variables declaration//GEN-END:variables
}
