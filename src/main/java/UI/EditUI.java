package UI;

import java.sql.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Database.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditUI extends javax.swing.JFrame {

    static DefaultTableModel dtm;

    public EditUI() throws SQLException {
        initComponents();
        refreshTableBuku();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table = new javax.swing.JTabbedPane();
        bookTab = new javax.swing.JPanel();
        editor = new javax.swing.JPanel();
        penulis = new javax.swing.JLabel();
        judulBuku = new javax.swing.JLabel();
        penerbit = new javax.swing.JLabel();
        tahun = new javax.swing.JLabel();
        penulisTF = new javax.swing.JTextField();
        judulBukuTF = new javax.swing.JTextField();
        penerbitTF = new javax.swing.JTextField();
        tahun1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        qtySpinner = new javax.swing.JSpinner();
        penerbitTF1 = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        addBookBtn = new javax.swing.JButton();
        delBookBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        aboutUsTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        penulis.setText("Penulis");

        judulBuku.setText("Judul buku");

        penerbit.setText("Penerbit");

        tahun.setText("Tahun");

        tahun1.setText("Qty");

        qtySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout editorLayout = new javax.swing.GroupLayout(editor);
        editor.setLayout(editorLayout);
        editorLayout.setHorizontalGroup(
            editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorLayout.createSequentialGroup()
                        .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tahun)
                            .addComponent(tahun1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penerbitTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtySpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorLayout.createSequentialGroup()
                        .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulBuku)
                            .addComponent(penulis)
                            .addComponent(penerbit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(penerbitTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(penulisTF)
                            .addComponent(judulBukuTF))))
                .addContainerGap())
        );
        editorLayout.setVerticalGroup(
            editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulBukuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulBuku))
                .addGap(18, 18, 18)
                .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penulisTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penulis))
                .addGap(18, 18, 18)
                .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penerbit)
                    .addComponent(penerbitTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahun)
                    .addComponent(penerbitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahun1)
                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttons.setLayout(new java.awt.GridLayout());

        addBookBtn.setText("Tambah Buku");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });
        buttons.add(addBookBtn);

        delBookBtn.setText("Delete Buku");
        buttons.add(delBookBtn);

        refreshBtn.setText("Refresh List");
        buttons.add(refreshBtn);

        exitBtn.setText("Keluar");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        buttons.add(exitBtn);

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
        tabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMouseClicked(evt);
            }
        });
        scrollPanel.setViewportView(tabelBuku);

        javax.swing.GroupLayout bookTabLayout = new javax.swing.GroupLayout(bookTab);
        bookTab.setLayout(bookTabLayout);
        bookTabLayout.setHorizontalGroup(
            bookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bookTabLayout.setVerticalGroup(
            bookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        table.addTab("Table", bookTab);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Biodata Users");

        javax.swing.GroupLayout aboutUsTabLayout = new javax.swing.GroupLayout(aboutUsTab);
        aboutUsTab.setLayout(aboutUsTabLayout);
        aboutUsTabLayout.setHorizontalGroup(
            aboutUsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsTabLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
        );
        aboutUsTabLayout.setVerticalGroup(
            aboutUsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsTabLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(581, Short.MAX_VALUE))
        );

        table.addTab("About Us", aboutUsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTableBuku() throws SQLException {
        String[] columnNames = {"Book ID", "Judul Buku", "Penulis", "Penerbit", "Tahun", "Qty"};
        dtm = new DefaultTableModel(columnNames, 0);
        List<String> list = DB.Book.getBookList(true);
        String id, judul, writter, pub, year, qty;
        String[] array = new String[list.size()];
        list.toArray(array);

        for (int i = 0; i < array.length; i += 6) {
            id = array[i];
            judul = array[i + 1];
            writter = array[i + 2];
            pub = array[i + 3];
            year = array[i + 4];
            qty = array[i + 5];

            String[] data = {id, judul, writter, pub, year, qty};
            dtm.addRow(data);
        }
        tabelBuku.setModel(dtm);
    }

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        int value = (Integer) qtySpinner.getValue();
        String judul = judulBukuTF.getText();
        try {
            DB.Book.setBookQty(judul, value);
            refreshTableBuku();
        } catch (SQLException ex) {
            Logger.getLogger(EditUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addBookBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int ok = JOptionPane.showConfirmDialog(null,
                "Apakah anda yakin ingin keluar?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0)
            System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void tabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMouseClicked
        int i = tabelBuku.getSelectedRow();
        if (i == -1) {
            return;
        }
        String judul = (String) tabelBuku.getValueAt(i, 1);
        judulBukuTF.setText(judul);
    }//GEN-LAST:event_tabelBukuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutUsTab;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JPanel bookTab;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton delBookBtn;
    private javax.swing.JPanel editor;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judulBuku;
    private javax.swing.JTextField judulBukuTF;
    private javax.swing.JLabel penerbit;
    private javax.swing.JTextField penerbitTF;
    private javax.swing.JTextField penerbitTF1;
    private javax.swing.JLabel penulis;
    private javax.swing.JTextField penulisTF;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabelBuku;
    private javax.swing.JTabbedPane table;
    private javax.swing.JLabel tahun;
    private javax.swing.JLabel tahun1;
    // End of variables declaration//GEN-END:variables
}
