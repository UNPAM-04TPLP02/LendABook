package UI; 

import java.util.List;
import javax.swing.DefaultListModel;
import Database.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class BorrowUI extends javax.swing.JFrame {
    
    static List listBuku = null;
    static DefaultListModel<String> model;
    public DefaultTableModel dtm;
    
    public BorrowUI() throws SQLException {
        initComponents();
        getRefreshBooks();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bukuTersedia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bukuDipinjam = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        pinjamBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buku yang tersedia");
        jPanel1.add(jLabel3);

        bukuTersedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Judul Buku", "Qty"
            }
        ));
        bukuTersedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuTersediaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(bukuTersedia);

        jPanel1.add(jScrollPane4);

        jSplitPane2.setRightComponent(jPanel1);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buku yang dipinjam");
        jPanel3.add(jLabel5);

        bukuDipinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Judul Buku", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bukuDipinjam);

        jPanel3.add(jScrollPane1);

        jSplitPane2.setLeftComponent(jPanel3);

        refreshBtn.setText("Refresh list");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        pinjamBtn.setText("Pinjam");
        pinjamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Keluar");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pinjamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinjamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(367, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            getRefreshBooks();
        } catch (SQLException ex) {
            Logger.getLogger(BorrowUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_refreshBtnActionPerformed

    
    private void pinjamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamBtnActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, 
                "Apakah anda yakin ingin meminjam buku?",
                "Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok != 0)
            return; 
        try {
            int column = 0;
            int row = bukuTersedia.getSelectedRow();
            String value = bukuTersedia.getModel().getValueAt(row, column).toString();
            DB.Book.lendBook(value);
            getRefreshBooks();
            JOptionPane.showMessageDialog(null, "Buku berhasil dipinjam");
        } catch (SQLException ex) {
            Logger.getLogger(BorrowUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_pinjamBtnActionPerformed

    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, 
                "Apakah anda yakin ingin keluar?",
                "Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok == 0)
            System.exit(0);       
    }//GEN-LAST:event_exitBtnActionPerformed

    
    private void bukuTersediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuTersediaMouseClicked
        int i = bukuTersedia.getSelectedRow();
        if (i == -1) {
            return;
        }
        String judul = (String) bukuTersedia.getValueAt(i, 0);
        try {
            DB.Book.lendBook(judul);
        } catch (SQLException ex) {
            Logger.getLogger(BorrowUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bukuTersediaMouseClicked

    
    public void getRefreshBooks() throws SQLException {
        String[] columnNames = {"Judul Buku", "Qty"};
        dtm = new DefaultTableModel(columnNames, 0);
        List<String> bukuDB = DB.Book.getBookList(false, false);
        List<String> bukuUser = DB.Book.getBookList(false, true);
        
        String judul1, judul2, qty1, qty2;
        String[] arrayDb = new String[bukuDB.size()];
        String[] arrayUser = new String[bukuUser.size()];
        bukuUser.toArray(arrayUser);
        bukuDB.toArray(arrayDb);
        int number1, number2;
        
        for(int i = 0; i < arrayUser.length; i += 2) {
            judul2 = arrayUser[i];
            qty2 = arrayUser[i + 1];
            number2 = Integer.valueOf(qty2);
            if (number2 > 0) {
                String[] data = { judul2, qty2 };
                dtm.addRow(data);
            }
        }
        bukuDipinjam.setModel(dtm);
        
        for(int i = 0; i < arrayDb.length; i += 2) {
            judul1 = arrayDb[i];
            qty1 = arrayDb[i + 1];
            number1 = Integer.valueOf(qty1);
            if (number1 > 0) {
                String[] data = { judul1, qty1 };
                dtm.addRow(data);
            }
        }
        bukuTersedia.setModel(dtm);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bukuDipinjam;
    private javax.swing.JTable bukuTersedia;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton pinjamBtn;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
