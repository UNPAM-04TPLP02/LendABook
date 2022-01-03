package UI;

import Database.*;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {

    public static Component borrowUI;
    public static Component editUI;
    private final DB.User dbUser;
    private final DB.Book dbBook;
    private final DB db;
    
    public LoginUI() {
        initComponents();
        dbUser = new DB.User();
        dbBook = new DB.Book();
        db = new DB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        passwdInput = new javax.swing.JPasswordField();
        exitBtn = new javax.swing.JButton();
        pswdLabel = new javax.swing.JLabel();
        usrnameLabel = new javax.swing.JLabel();
        usrnameInput = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox<>();
        loginBtn = new javax.swing.JButton();
        createAcc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setText("Login ");

        exitBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        exitBtn.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        pswdLabel.setText("Password");

        usrnameLabel.setText("Username");

        usrnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnameInputActionPerformed(evt);
            }
        });

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        createAcc.setText("Create Account");
        createAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccActionPerformed(evt);
            }
        });

        jLabel1.setText("Role");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\SEMESTER 4\\PEMROGRAMAN 1\\netbeans\\uas1\\LendABook\\src\\resources\\Logov1x300.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(usrnameLabel)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pswdLabel)
                                    .addComponent(jLabel1)
                                    .addComponent(exitBtn))
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addGap(18, 18, 18)
                                .addComponent(createAcc))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usrnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(117, 117, 117))
                                        .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel3)
                        .addContainerGap(167, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usrnameLabel)
                            .addComponent(usrnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pswdLabel)
                            .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitBtn)
                            .addComponent(loginBtn)
                            .addComponent(createAcc))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void setBorrowWindow(Component frame) {
        borrowUI = frame;
    }
    
    
    public static void setEditWindow(Component frame) {
        editUI = frame;
    }
    
    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    
    private void usrnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnameInputActionPerformed
        
    }//GEN-LAST:event_usrnameInputActionPerformed

    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String role = String.valueOf(roleComboBox.getSelectedItem());
        
        try {
            if (dbUser.loginAccount(usrnameInput.getText(), passwdInput.getText(), role))
                if (!"".equals(usrnameInput.getText()) && !"".equals(passwdInput.getText())) {
                    if ("admin".equals(role)) {
                        editUI.setVisible(true);
                    }
                    else if ("user".equals(role))
                        borrowUI.setVisible(true);
                    setVisible(false);
                } else
                    JOptionPane.showMessageDialog(null, "Semua field harus diisi");
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    
    private void createAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccActionPerformed
        String role = String.valueOf(roleComboBox.getSelectedItem());
        try {
            dbUser.addAccount(usrnameInput.getText(), passwdInput.getText(), role);
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createAccActionPerformed

    
    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAcc;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwdInput;
    private javax.swing.JLabel pswdLabel;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField usrnameInput;
    private javax.swing.JLabel usrnameLabel;
    // End of variables declaration//GEN-END:variables
}
