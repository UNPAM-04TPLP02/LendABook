package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditUI extends javax.swing.JFrame {
    
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    
    public EditUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        dbTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jenisTabel = new javax.swing.JComboBox<>();
        settingsTab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        penulis = new javax.swing.JLabel();
        judulBuku = new javax.swing.JLabel();
        penerbit = new javax.swing.JLabel();
        tahun = new javax.swing.JLabel();
        penulisTF = new javax.swing.JTextField();
        judulBukuTF = new javax.swing.JTextField();
        penerbitTF = new javax.swing.JTextField();
        tahunTF = new javax.swing.JTextField();
        tahun1 = new javax.swing.JLabel();
        tahunTF1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        addBookBtn = new javax.swing.JButton();
        delBookBtn = new javax.swing.JButton();
        aboutUsTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "judul", "penulis", "penerbit", "tahun", "kategori", "qty"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jenisTabel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabel Buku", "Tabel User" }));
        jenisTabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisTabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dbTabLayout = new javax.swing.GroupLayout(dbTab);
        dbTab.setLayout(dbTabLayout);
        dbTabLayout.setHorizontalGroup(
            dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jenisTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
            .addGroup(dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dbTabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        dbTabLayout.setVerticalGroup(
            dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jenisTabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dbTabLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Database", dbTab);

        penulis.setText("Penulis");

        judulBuku.setText("Judul buku");

        penerbit.setText("Penerbit");

        tahun.setText("Tahun");

        judulBukuTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulBukuTFActionPerformed(evt);
            }
        });

        tahunTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunTFActionPerformed(evt);
            }
        });

        tahun1.setText("Qty");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tahun1)
                        .addGap(315, 315, 315)
                        .addComponent(tahunTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tahun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tahunTF, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(penerbit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(penerbitTF, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(judulBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(judulBukuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(penulis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(penulisTF, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulBukuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulBuku))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penulisTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penulis))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penerbitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penerbit))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahun))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahun1))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        addBookBtn.setText("Tambah Buku");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        delBookBtn.setText("Delete Buku");

        javax.swing.GroupLayout settingsTabLayout = new javax.swing.GroupLayout(settingsTab);
        settingsTab.setLayout(settingsTabLayout);
        settingsTabLayout.setHorizontalGroup(
            settingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delBookBtn)
                .addGap(18, 18, 18)
                .addComponent(addBookBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingsTabLayout.setVerticalGroup(
            settingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookBtn)
                    .addComponent(delBookBtn))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Database settings", settingsTab);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Biodata Users");

        javax.swing.GroupLayout aboutUsTabLayout = new javax.swing.GroupLayout(aboutUsTab);
        aboutUsTab.setLayout(aboutUsTabLayout);
        aboutUsTabLayout.setHorizontalGroup(
            aboutUsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsTabLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
        );
        aboutUsTabLayout.setVerticalGroup(
            aboutUsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsTabLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About Us", aboutUsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshList() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost/book_db", "root", "");
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM book_table");
        while (rs.next()) {
            int book_id = rs.getInt("book_id");
            String judul_buku = rs.getString("judul_buku");
            String penulis = rs.getString("penulis");
            int tahun = rs.getInt("tahun");
            System.out.println(judul_buku);
        }
    }
    
    private void judulBukuTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulBukuTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulBukuTFActionPerformed

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void tahunTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahunTFActionPerformed

    private void jenisTabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisTabelActionPerformed
        System.out.println("Switched");
    }//GEN-LAST:event_jenisTabelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutUsTab;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JPanel dbTab;
    private javax.swing.JButton delBookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jenisTabel;
    private javax.swing.JLabel judulBuku;
    private javax.swing.JTextField judulBukuTF;
    private javax.swing.JLabel penerbit;
    private javax.swing.JTextField penerbitTF;
    private javax.swing.JLabel penulis;
    private javax.swing.JTextField penulisTF;
    private javax.swing.JPanel settingsTab;
    private javax.swing.JLabel tahun;
    private javax.swing.JLabel tahun1;
    private javax.swing.JTextField tahunTF;
    private javax.swing.JTextField tahunTF1;
    // End of variables declaration//GEN-END:variables
}
