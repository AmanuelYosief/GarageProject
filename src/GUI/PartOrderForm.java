/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author amenu
 */
public class PartOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form PartOrderForm
     */
    public PartOrderForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        partOrderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        scrollTablePartOrder = new javax.swing.JScrollPane();
        tblPartOrder = new javax.swing.JTable();
        lblTotalPartOrder = new javax.swing.JLabel();
        lblPartCost = new javax.swing.JLabel();
        btnRemovePart = new javax.swing.JButton();
        lblAddOrderPart = new javax.swing.JLabel();
        lblOrderNumber = new javax.swing.JLabel();
        txtOrderNumber = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddPart = new javax.swing.JButton();
        lblCompanyInfo = new javax.swing.JLabel();
        lblCompanyName = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtCompanyAddress = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        txtCompanyTelephone = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtCompanyFax = new javax.swing.JTextField();
        btnPrintOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        partOrderPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Part Order");

        tblPartOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblPartOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Number", "Description", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPartOrder.setGridColor(new java.awt.Color(255, 255, 255));
        tblPartOrder.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblPartOrderFocusGained(evt);
            }
        });
        tblPartOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPartOrderMouseClicked(evt);
            }
        });
        tblPartOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPartOrderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblPartOrderKeyTyped(evt);
            }
        });
        scrollTablePartOrder.setViewportView(tblPartOrder);

        lblTotalPartOrder.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblTotalPartOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPartOrder.setText("Total of Part Order:");

        lblPartCost.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblPartCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPartCost.setText("£Cost");

        btnRemovePart.setBackground(new java.awt.Color(255, 255, 255));
        btnRemovePart.setText("Remove Part");

        lblAddOrderPart.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lblAddOrderPart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddOrderPart.setText("Add Order Part");

        lblOrderNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblOrderNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrderNumber.setText("Order Number:");

        txtOrderNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Description");

        txtDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");

        txtQuantity.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("Price");

        txtPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        btnAddPart.setBackground(new java.awt.Color(255, 255, 255));
        btnAddPart.setText("Add Part");

        lblCompanyInfo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lblCompanyInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanyInfo.setText("Company Info");

        lblCompanyName.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanyName.setText("Name:");

        txtCompanyName.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("Address");

        txtCompanyAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblTelephone.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblTelephone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelephone.setText("Telephone ");

        txtCompanyTelephone.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblFax.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblFax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFax.setText("Fax");

        txtCompanyFax.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        btnPrintOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnPrintOrder.setText("Print Order");

        javax.swing.GroupLayout partOrderPanelLayout = new javax.swing.GroupLayout(partOrderPanel);
        partOrderPanel.setLayout(partOrderPanelLayout);
        partOrderPanelLayout.setHorizontalGroup(
            partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partOrderPanelLayout.createSequentialGroup()
                .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(partOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(partOrderPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollTablePartOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(partOrderPanelLayout.createSequentialGroup()
                                .addComponent(lblTotalPartOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPartCost, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, partOrderPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddPart, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAddOrderPart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(partOrderPanelLayout.createSequentialGroup()
                                .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCompanyName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddress))
                                    .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCompanyTelephone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCompanyName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCompanyAddress)
                                    .addComponent(txtCompanyFax)))
                            .addGroup(partOrderPanelLayout.createSequentialGroup()
                                .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemovePart, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(partOrderPanelLayout.createSequentialGroup()
                                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblOrderNumber))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOrderNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblFax)
                                    .addComponent(lblCompanyInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, partOrderPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrintOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        partOrderPanelLayout.setVerticalGroup(
            partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(partOrderPanelLayout.createSequentialGroup()
                        .addComponent(scrollTablePartOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPartOrder)
                            .addComponent(lblPartCost))
                        .addGap(110, 110, 110))
                    .addGroup(partOrderPanelLayout.createSequentialGroup()
                        .addComponent(btnRemovePart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddOrderPart)
                        .addGap(11, 11, 11)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrderNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(partOrderPanelLayout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrice))
                            .addGroup(partOrderPanelLayout.createSequentialGroup()
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCompanyInfo)
                        .addGap(5, 5, 5)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCompanyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCompanyTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(partOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFax)
                            .addComponent(txtCompanyFax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrintOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPartOrderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblPartOrderFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartOrderFocusGained

    private void tblPartOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartOrderMouseClicked
        // TODO add your handling code here:
        lblStaffId.setText(tblPartOrder.getValueAt(tblPartOrder.getSelectedRow(), 0).toString());
        txtFirstName.setText(tblPartOrder.getValueAt(tblPartOrder.getSelectedRow(), 1).toString());
        txtSurname.setText(tblPartOrder.getValueAt(tblPartOrder.getSelectedRow(), 2).toString());
        txtEmail.setText(tblPartOrder.getValueAt(tblPartOrder.getSelectedRow(), 3).toString());
        cbJobTitle.getModel().setSelectedItem(tblPartOrder.getValueAt(tblPartOrder.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblPartOrderMouseClicked

    private void tblPartOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPartOrderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartOrderKeyPressed

    private void tblPartOrderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPartOrderKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartOrderKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PartOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPart;
    private javax.swing.JButton btnPrintOrder;
    private javax.swing.JButton btnRemovePart;
    private javax.swing.JLabel lblAddOrderPart;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCompanyInfo;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblPartCost;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalPartOrder;
    private javax.swing.JPanel partOrderPanel;
    private javax.swing.JScrollPane scrollTablePartOrder;
    private javax.swing.JTable tblPartOrder;
    private javax.swing.JTextField txtCompanyAddress;
    private javax.swing.JTextField txtCompanyFax;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtCompanyTelephone;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtOrderNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
