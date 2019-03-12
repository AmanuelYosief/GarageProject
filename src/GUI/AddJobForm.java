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
public class AddJobForm extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceForm
     */
    public AddJobForm() {
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

        addJobPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblJobDescription = new javax.swing.JLabel();
        scrollJobDescription = new javax.swing.JScrollPane();
        txtJobDescription = new javax.swing.JTextArea();
        lblMake = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblVehicleRegNo = new javax.swing.JLabel();
        txtVehicleRegNo = new javax.swing.JTextField();
        lblJobCustomerName = new javax.swing.JLabel();
        txtJobCustomerName = new javax.swing.JTextField();
        txtTelephoneNo = new javax.swing.JTextField();
        lblTelephoneNo = new javax.swing.JLabel();
        lblMechanicAllocated = new javax.swing.JLabel();
        cbMechanicAllocated = new javax.swing.JComboBox<>();
        btnAddJob = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addJobPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jobIcon.png"))); // NOI18N
        lblTitle.setText("Add Job");

        lblJobDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblJobDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobDescription.setText("Job Description:");

        txtJobDescription.setColumns(20);
        txtJobDescription.setRows(5);
        scrollJobDescription.setViewportView(txtJobDescription);

        lblMake.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMake.setText("Make:");

        txtMake.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblModel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModel.setText("Model:");

        txtModel.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblVehicleRegNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblVehicleRegNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehicleRegNo.setText("Vehicle Registration No:");

        txtVehicleRegNo.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblJobCustomerName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblJobCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobCustomerName.setText("Customer Name:");

        txtJobCustomerName.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtJobCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobCustomerNameActionPerformed(evt);
            }
        });

        txtTelephoneNo.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblTelephoneNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTelephoneNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelephoneNo.setText("Telephone Number:");

        lblMechanicAllocated.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMechanicAllocated.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMechanicAllocated.setText("Mechanic Allocated:");

        cbMechanicAllocated.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbMechanicAllocated.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));

        btnAddJob.setText("Add");

        javax.swing.GroupLayout addJobPanelLayout = new javax.swing.GroupLayout(addJobPanel);
        addJobPanel.setLayout(addJobPanelLayout);
        addJobPanelLayout.setHorizontalGroup(
            addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(addJobPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addJobPanelLayout.createSequentialGroup()
                        .addComponent(lblJobDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollJobDescription))
                    .addGroup(addJobPanelLayout.createSequentialGroup()
                        .addComponent(lblVehicleRegNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addJobPanelLayout.createSequentialGroup()
                        .addComponent(lblMake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblModel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddJob, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(addJobPanelLayout.createSequentialGroup()
                            .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblJobCustomerName)
                                .addComponent(lblTelephoneNo)
                                .addComponent(lblMechanicAllocated))
                            .addGap(96, 96, 96)
                            .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJobCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMechanicAllocated, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addJobPanelLayout.setVerticalGroup(
            addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJobDescription)
                    .addComponent(scrollJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleRegNo)
                    .addComponent(txtVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJobCustomerName)
                    .addComponent(txtJobCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelephoneNo)
                    .addComponent(txtTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMechanicAllocated)
                    .addComponent(cbMechanicAllocated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddJob, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addJobPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addJobPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJobCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobCustomerNameActionPerformed

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
            java.util.logging.Logger.getLogger(AddJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJobForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addJobPanel;
    private javax.swing.JButton btnAddJob;
    private javax.swing.JComboBox<String> cbMechanicAllocated;
    private javax.swing.JLabel lblJobCustomerName;
    private javax.swing.JLabel lblJobDescription;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblMechanicAllocated;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblTelephoneNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehicleRegNo;
    private javax.swing.JScrollPane scrollJobDescription;
    private javax.swing.JTextField txtJobCustomerName;
    private javax.swing.JTextArea txtJobDescription;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtTelephoneNo;
    private javax.swing.JTextField txtVehicleRegNo;
    // End of variables declaration//GEN-END:variables
}
