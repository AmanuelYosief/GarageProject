/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

/**
 *
 * @author amenu
 */
public class jobReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form jobReportPanel
     */
    public jobReportPanel() {
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

        jobReportPanel = new javax.swing.JPanel();
        lblJobType = new javax.swing.JLabel();
        rbMOT = new javax.swing.JRadioButton();
        rbAnnualService = new javax.swing.JRadioButton();
        rbRepair = new javax.swing.JRadioButton();
        rbOverall = new javax.swing.JRadioButton();
        lblDate = new javax.swing.JLabel();
        cbMonthPicker = new javax.swing.JComboBox<>();
        cbYearPicker = new javax.swing.JComboBox<>();
        lblFilter = new javax.swing.JLabel();
        rbMechanic = new javax.swing.JRadioButton();
        cbMechanicPicker = new javax.swing.JComboBox<>();
        btnGenerateReport = new javax.swing.JButton();
        scrollTableJob = new javax.swing.JScrollPane();
        tblJob = new javax.swing.JTable();
        btnPrintReport = new javax.swing.JButton();
        lblCompanyLogo8 = new javax.swing.JLabel();

        jobReportPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblJobType.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblJobType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobType.setText("Job Type:");

        rbMOT.setBackground(new java.awt.Color(255, 255, 255));
        rbMOT.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        rbMOT.setText("MOT");

        rbAnnualService.setBackground(new java.awt.Color(255, 255, 255));
        rbAnnualService.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        rbAnnualService.setText("Annual Service");

        rbRepair.setBackground(new java.awt.Color(255, 255, 255));
        rbRepair.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        rbRepair.setText("Repair");

        rbOverall.setBackground(new java.awt.Color(255, 255, 255));
        rbOverall.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        rbOverall.setText("Overall");

        lblDate.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");

        cbMonthPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month" }));

        cbYearPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year" }));

        lblFilter.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilter.setText("Filter by");

        rbMechanic.setBackground(new java.awt.Color(255, 255, 255));
        rbMechanic.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        rbMechanic.setText("Mechanic");

        cbMechanicPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Mechanic Here", "Item 2", "Item 3", "Item 4" }));

        btnGenerateReport.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerateReport.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.setBorder(null);
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        tblJob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblJob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Average Time", "Price", "Job Type", "Mechanic"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJob.setGridColor(new java.awt.Color(255, 255, 255));
        tblJob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblJobFocusGained(evt);
            }
        });
        tblJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJobMouseClicked(evt);
            }
        });
        tblJob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblJobKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblJobKeyTyped(evt);
            }
        });
        scrollTableJob.setViewportView(tblJob);

        btnPrintReport.setBackground(new java.awt.Color(255, 255, 255));
        btnPrintReport.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnPrintReport.setText("Print Report");
        btnPrintReport.setBorder(null);
        btnPrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReportActionPerformed(evt);
            }
        });

        lblCompanyLogo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/companyLogo.jpg"))); // NOI18N

        javax.swing.GroupLayout jobReportPanelLayout = new javax.swing.GroupLayout(jobReportPanel);
        jobReportPanel.setLayout(jobReportPanelLayout);
        jobReportPanelLayout.setHorizontalGroup(
            jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobReportPanelLayout.createSequentialGroup()
                .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jobReportPanelLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJobType)
                            .addComponent(lblFilter)
                            .addGroup(jobReportPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbAnnualService)
                                    .addComponent(rbMOT)
                                    .addComponent(rbRepair)
                                    .addComponent(rbOverall)))
                            .addComponent(lblDate)
                            .addGroup(jobReportPanelLayout.createSequentialGroup()
                                .addComponent(cbMonthPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbYearPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbMechanic)
                            .addGroup(jobReportPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cbMechanicPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobReportPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(scrollTableJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jobReportPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCompanyLogo8))
                    .addGroup(jobReportPanelLayout.createSequentialGroup()
                        .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jobReportPanelLayout.setVerticalGroup(
            jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jobReportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jobReportPanelLayout.createSequentialGroup()
                        .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jobReportPanelLayout.createSequentialGroup()
                                .addComponent(lblJobType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMOT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAnnualService)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbRepair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbOverall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMonthPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbYearPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMechanic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMechanicPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jobReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jobReportPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCompanyLogo8))
                            .addGroup(jobReportPanelLayout.createSequentialGroup()
                                .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jobReportPanelLayout.createSequentialGroup()
                        .addComponent(scrollTableJob, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                        .addGap(49, 49, 49))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jobReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jobReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void tblJobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblJobFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobFocusGained

    private void tblJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJobMouseClicked
        // TODO add your handling code here:
        lblStaffId.setText(tblJob.getValueAt(tblJob.getSelectedRow(), 0).toString());
        txtFirstName.setText(tblJob.getValueAt(tblJob.getSelectedRow(), 1).toString());
        txtSurname.setText(tblJob.getValueAt(tblJob.getSelectedRow(), 2).toString());
        txtEmail.setText(tblJob.getValueAt(tblJob.getSelectedRow(), 3).toString());
        cbJobTitle.getModel().setSelectedItem(tblJob.getValueAt(tblJob.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblJobMouseClicked

    private void tblJobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblJobKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobKeyPressed

    private void tblJobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblJobKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobKeyTyped

    private void btnPrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.JComboBox<String> cbMechanicPicker;
    private javax.swing.JComboBox<String> cbMonthPicker;
    private javax.swing.JComboBox<String> cbYearPicker;
    private javax.swing.JPanel jobReportPanel;
    private javax.swing.JLabel lblCompanyLogo8;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFilter;
    private javax.swing.JLabel lblJobType;
    private javax.swing.JRadioButton rbAnnualService;
    private javax.swing.JRadioButton rbMOT;
    private javax.swing.JRadioButton rbMechanic;
    private javax.swing.JRadioButton rbOverall;
    private javax.swing.JRadioButton rbRepair;
    private javax.swing.JScrollPane scrollTableJob;
    private javax.swing.JTable tblJob;
    // End of variables declaration//GEN-END:variables
}
