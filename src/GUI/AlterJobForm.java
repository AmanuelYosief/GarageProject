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
public class AlterJobForm extends javax.swing.JFrame {

    /**
     * Creates new form PartOrderForm
     */
    public AlterJobForm() {
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

        alterJobPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblJobNo = new javax.swing.JLabel();
        lblTasksPerformed = new javax.swing.JLabel();
        scrollTableTask = new javax.swing.JScrollPane();
        tblTask = new javax.swing.JTable();
        btnRemoveTask = new javax.swing.JButton();
        lblAddTask = new javax.swing.JLabel();
        lblTaskPerformed = new javax.swing.JLabel();
        cbChooseTask = new javax.swing.JComboBox<>();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        btnAddTask = new javax.swing.JButton();
        lblSparePart = new javax.swing.JLabel();
        scrollTablePartsUsed = new javax.swing.JScrollPane();
        tblPartsUsed = new javax.swing.JTable();
        btnRemovePart = new javax.swing.JButton();
        lblAddParts = new javax.swing.JLabel();
        scrollTableParts = new javax.swing.JScrollPane();
        tblSpareParts = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddPart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alterJobPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Alter Job Status");

        lblJobNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblJobNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobNo.setText("Job No:");

        lblTasksPerformed.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblTasksPerformed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTasksPerformed.setText("Tasks Performed");

        tblTask.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Task", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTask.setGridColor(new java.awt.Color(255, 255, 255));
        tblTask.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblTaskFocusGained(evt);
            }
        });
        tblTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaskMouseClicked(evt);
            }
        });
        tblTask.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblTaskKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblTaskKeyTyped(evt);
            }
        });
        scrollTableTask.setViewportView(tblTask);

        btnRemoveTask.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveTask.setText("Remove Task");

        lblAddTask.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblAddTask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddTask.setText("Add Task Peformed");

        lblTaskPerformed.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTaskPerformed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaskPerformed.setText("Task Performed");

        cbChooseTask.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbChooseTask.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose predefined task" }));

        lblDuration.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDuration.setText("Duration:");

        txtDuration.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        btnAddTask.setBackground(new java.awt.Color(255, 255, 255));
        btnAddTask.setText("Add Task");

        lblSparePart.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblSparePart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSparePart.setText("Spare Parts Used");

        tblPartsUsed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblPartsUsed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Description", "Part No", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPartsUsed.setGridColor(new java.awt.Color(255, 255, 255));
        tblPartsUsed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblPartsUsedFocusGained(evt);
            }
        });
        tblPartsUsed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPartsUsedMouseClicked(evt);
            }
        });
        tblPartsUsed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPartsUsedKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblPartsUsedKeyTyped(evt);
            }
        });
        scrollTablePartsUsed.setViewportView(tblPartsUsed);
        if (tblPartsUsed.getColumnModel().getColumnCount() > 0) {
            tblPartsUsed.getColumnModel().getColumn(2).setHeaderValue("Quantity");
        }

        btnRemovePart.setBackground(new java.awt.Color(255, 255, 255));
        btnRemovePart.setText("Remove Part");

        lblAddParts.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblAddParts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddParts.setText("Add Parts Useds");

        tblSpareParts.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblSpareParts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Description", "Part No", "Stock Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSpareParts.setGridColor(new java.awt.Color(255, 255, 255));
        tblSpareParts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblSparePartsFocusGained(evt);
            }
        });
        tblSpareParts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSparePartsMouseClicked(evt);
            }
        });
        tblSpareParts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSparePartsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblSparePartsKeyTyped(evt);
            }
        });
        scrollTableParts.setViewportView(tblSpareParts);

        lblQuantity.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");

        txtQuantity.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        btnAddPart.setBackground(new java.awt.Color(255, 255, 255));
        btnAddPart.setText("Add Part");

        javax.swing.GroupLayout alterJobPanelLayout = new javax.swing.GroupLayout(alterJobPanel);
        alterJobPanel.setLayout(alterJobPanelLayout);
        alterJobPanelLayout.setHorizontalGroup(
            alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterJobPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                        .addComponent(lblTasksPerformed)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterJobPanelLayout.createSequentialGroup()
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alterJobPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRemoveTask, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alterJobPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scrollTableTask)))
                        .addGap(18, 18, 18)
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alterJobPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDuration)
                                    .addComponent(lblTaskPerformed))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbChooseTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblAddTask)))
                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSparePart)
                            .addGroup(alterJobPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scrollTablePartsUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRemovePart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alterJobPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddParts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollTableParts, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterJobPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddPart, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(alterJobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJobNo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        alterJobPanelLayout.setVerticalGroup(
            alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterJobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJobNo)
                .addGap(4, 4, 4)
                .addComponent(lblTasksPerformed)
                .addGap(1, 1, 1)
                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                        .addComponent(lblAddTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaskPerformed)
                            .addComponent(cbChooseTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDuration)
                            .addGroup(alterJobPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(scrollTableTask, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveTask, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSparePart)
                    .addComponent(lblAddParts))
                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollTablePartsUsed, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(scrollTableParts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemovePart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(alterJobPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(alterJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity)))
                    .addComponent(btnAddPart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alterJobPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alterJobPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTaskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblTaskFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTaskFocusGained

    private void tblTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaskMouseClicked
        // TODO add your handling code here:
        lblStaffId.setText(tblTask.getValueAt(tblTask.getSelectedRow(), 0).toString());
        txtFirstName.setText(tblTask.getValueAt(tblTask.getSelectedRow(), 1).toString());
        txtSurname.setText(tblTask.getValueAt(tblTask.getSelectedRow(), 2).toString());
        txtEmail.setText(tblTask.getValueAt(tblTask.getSelectedRow(), 3).toString());
        cbJobTitle.getModel().setSelectedItem(tblTask.getValueAt(tblTask.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblTaskMouseClicked

    private void tblTaskKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTaskKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTaskKeyPressed

    private void tblTaskKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTaskKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTaskKeyTyped

    private void tblPartsUsedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblPartsUsedFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartsUsedFocusGained

    private void tblPartsUsedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartsUsedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartsUsedMouseClicked

    private void tblPartsUsedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPartsUsedKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartsUsedKeyPressed

    private void tblPartsUsedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPartsUsedKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartsUsedKeyTyped

    private void tblSparePartsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblSparePartsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSparePartsFocusGained

    private void tblSparePartsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSparePartsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSparePartsMouseClicked

    private void tblSparePartsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSparePartsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSparePartsKeyPressed

    private void tblSparePartsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSparePartsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSparePartsKeyTyped

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
            java.util.logging.Logger.getLogger(AlterJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterJobForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alterJobPanel;
    private javax.swing.JButton btnAddPart;
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnRemovePart;
    private javax.swing.JButton btnRemoveTask;
    private javax.swing.JComboBox<String> cbChooseTask;
    private javax.swing.JLabel lblAddParts;
    private javax.swing.JLabel lblAddTask;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblJobNo;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSparePart;
    private javax.swing.JLabel lblTaskPerformed;
    private javax.swing.JLabel lblTasksPerformed;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollTableParts;
    private javax.swing.JScrollPane scrollTablePartsUsed;
    private javax.swing.JScrollPane scrollTableTask;
    private javax.swing.JTable tblPartsUsed;
    private javax.swing.JTable tblSpareParts;
    private javax.swing.JTable tblTask;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
