package UI;

public class EditUI extends javax.swing.JPanel {

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
        buttons = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jenisTabel = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

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

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.rowHeights = new int[] {0};
        jPanel2Layout.columnWeights = new double[] {0.0};
        jPanel2Layout.rowWeights = new double[] {0.0};
        buttons.setLayout(jPanel2Layout);

        jButton6.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jButton6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        buttons.add(jButton6, new java.awt.GridBagConstraints());

        jButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButton7.setText("Update");
        buttons.add(jButton7, new java.awt.GridBagConstraints());

        jButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jButton8.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jButton8.setText("Delete");
        buttons.add(jButton8, new java.awt.GridBagConstraints());

        jButton5.setText("Back");
        buttons.add(jButton5, new java.awt.GridBagConstraints());
        buttons.add(filler1, new java.awt.GridBagConstraints());

        jenisTabel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabel Buku", "Tabel User" }));

        javax.swing.GroupLayout dbTabLayout = new javax.swing.GroupLayout(dbTab);
        dbTab.setLayout(dbTabLayout);
        dbTabLayout.setHorizontalGroup(
            dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
            .addGroup(dbTabLayout.createSequentialGroup()
                .addComponent(jenisTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
        );
        dbTabLayout.setVerticalGroup(
            dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jenisTabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dbTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dbTabLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Database", dbTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Database settings", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel dbTab;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jenisTabel;
    // End of variables declaration//GEN-END:variables
}
