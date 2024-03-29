/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controller.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amenu
 */
public class AdministratorForm extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorForm
     */
    public AdministratorForm() {
        initComponents();
        fetchAll();
        
    }
    
    public void fetchAll() {
        tblStaff.setModel(DbUtils.resultSetToTableModel(controller.displayStaff()));
    }
    
        public void emptyFields() {
             txtLogin.setText("");
            txtName.setText("");
    }
                public void disableFields() {
            txtName.enable(false);

    }
                public void enableFields(){
                            txtName.enable(true);
                }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        administratorPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblsearchIcon = new javax.swing.JLabel();
        txtSearchStaff = new javax.swing.JTextField();
        btnAddStaff = new javax.swing.JButton();
        scrollTableStaff = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        lblStaffDetails = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblJobRole = new javax.swing.JLabel();
        cbJobRole = new javax.swing.JComboBox<>();
        btnRemoveStaff = new javax.swing.JButton();
        btnUpdateStaff = new javax.swing.JButton();
        lblDatabase = new javax.swing.JLabel();
        txtDatabaseURL = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnRestore = new javax.swing.JButton();
        btnBackup = new javax.swing.JButton();
        lblCompanyLogo = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        administratorPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Administrator Dashboard");

        lblsearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searchIcon.png"))); // NOI18N

        txtSearchStaff.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtSearchStaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchStaffKeyReleased(evt);
            }
        });

        btnAddStaff.setBackground(new java.awt.Color(255, 255, 255));
        btnAddStaff.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAddStaff.setText("Add Staff");
        btnAddStaff.setBorder(null);
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });

        tblStaff.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Job Role", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaff.setGridColor(new java.awt.Color(255, 255, 255));
        tblStaff.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblStaffFocusGained(evt);
            }
        });
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        tblStaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblStaffKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblStaffKeyTyped(evt);
            }
        });
        scrollTableStaff.setViewportView(tblStaff);

        lblStaffDetails.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblStaffDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaffDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/userIcon.png"))); // NOI18N
        lblStaffDetails.setText("Staff Detail");

        lblLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblLogin.setText("Login");

        txtLogin.setEditable(false);
        txtLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblJobRole.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblJobRole.setText("Job Role:");

        cbJobRole.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbJobRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Foreperson", "Franchisee", "Mechanic", "Receptionist" }));

        btnRemoveStaff.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveStaff.setText("Remove Staff");
        btnRemoveStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStaffActionPerformed(evt);
            }
        });

        btnUpdateStaff.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateStaff.setText("Update Staff");
        btnUpdateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStaffActionPerformed(evt);
            }
        });

        lblDatabase.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblDatabase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/databaseIcon.png"))); // NOI18N
        lblDatabase.setText("Database ");

        txtDatabaseURL.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowse.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.setBorder(null);
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnRestore.setBackground(new java.awt.Color(255, 255, 255));
        btnRestore.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnRestore.setText("Restore");
        btnRestore.setBorder(null);
        btnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreActionPerformed(evt);
            }
        });

        btnBackup.setBackground(new java.awt.Color(255, 255, 255));
        btnBackup.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnBackup.setText("Backup");
        btnBackup.setBorder(null);
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        lblCompanyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/companyLogo.jpg"))); // NOI18N

        javax.swing.GroupLayout administratorPanelLayout = new javax.swing.GroupLayout(administratorPanel);
        administratorPanel.setLayout(administratorPanelLayout);
        administratorPanelLayout.setHorizontalGroup(
            administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administratorPanelLayout.createSequentialGroup()
                .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(administratorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(administratorPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCompanyLogo))
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(administratorPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollTableStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(administratorPanelLayout.createSequentialGroup()
                                .addComponent(lblsearchIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchStaff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(administratorPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, administratorPanelLayout.createSequentialGroup()
                                        .addComponent(btnRemoveStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, administratorPanelLayout.createSequentialGroup()
                                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(lblLogin))
                                        .addGap(26, 26, 26)
                                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                            .addComponent(txtLogin)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, administratorPanelLayout.createSequentialGroup()
                                        .addComponent(lblJobRole)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbJobRole, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(administratorPanelLayout.createSequentialGroup()
                                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDatabaseURL)
                                            .addGroup(administratorPanelLayout.createSequentialGroup()
                                                .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 56, Short.MAX_VALUE))
                            .addGroup(administratorPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblStaffDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administratorPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        administratorPanelLayout.setVerticalGroup(
            administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administratorPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(41, 41, 41)
                .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(administratorPanelLayout.createSequentialGroup()
                        .addComponent(lblsearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(lblStaffDetails)
                    .addComponent(btnAddStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchStaff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(administratorPanelLayout.createSequentialGroup()
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJobRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbJobRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnRemoveStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(lblDatabase)
                        .addGap(9, 9, 9)
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(txtDatabaseURL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(administratorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(lblCompanyLogo))
                    .addComponent(scrollTableStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(administratorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(administratorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        // TODO add your handling code here:
        controller.closeDBConnection();
        AddStaffForm openAddStaff = new AddStaffForm();
        openAddStaff.setLocationRelativeTo(null);
        openAddStaff.setResizable(false);
        openAddStaff.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        openAddStaff.setVisible(true);
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void tblStaffFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblStaffFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_tblStaffFocusGained

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        // TODO add your handling code here:
        txtLogin.setText(tblStaff.getValueAt(tblStaff.getSelectedRow(), 2).toString());
        txtName.setText(tblStaff.getValueAt(tblStaff.getSelectedRow(), 0).toString());
        cbJobRole.getModel().setSelectedItem(tblStaff.getValueAt(tblStaff.getSelectedRow(), 1).toString());
        enableFields();
    }//GEN-LAST:event_tblStaffMouseClicked

    private void tblStaffKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblStaffKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tblStaffKeyPressed

    private void tblStaffKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblStaffKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tblStaffKeyTyped

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestoreActionPerformed

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackupActionPerformed

    private void txtSearchStaffKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchStaffKeyReleased
        // TODO add your handling code here:
                tblStaff.setModel(DbUtils.resultSetToTableModel(controller.searchStaff(txtSearchStaff.getText())));
                
 
    }//GEN-LAST:event_txtSearchStaffKeyReleased

    private void btnRemoveStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStaffActionPerformed
        // TODO add your handling code here:
        
        int cd = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this user?", "Delete User", JOptionPane.YES_NO_OPTION);
        
        if (cd == JOptionPane.YES_OPTION ){
          controller.deleteStaff(txtLogin.getText().trim());
          JOptionPane.showMessageDialog(null, "Staff sucessfully deleted", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
                  emptyFields();
        disableFields();
        fetchAll();
        }
        else if (cd == JOptionPane.NO_OPTION){
        emptyFields();
        disableFields();
        fetchAll();
        }
        
      
    }//GEN-LAST:event_btnRemoveStaffActionPerformed

    private void btnUpdateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStaffActionPerformed
        // TODO add your handling code here:

        int cd = JOptionPane.showConfirmDialog(null,"Are you sure you want to update this user?", "Update User", JOptionPane.YES_NO_OPTION);
        
        if (cd == JOptionPane.YES_OPTION ){
            controller.updateStaff(txtName.getText().trim(), cbJobRole.getSelectedItem().toString(), txtLogin.getText());
          JOptionPane.showMessageDialog(null, "Staff sucessfully updated!", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
                  emptyFields();
        disableFields();
        fetchAll();
        }
        else if (cd == JOptionPane.NO_OPTION){
        emptyFields();
        disableFields();
        fetchAll();
        }
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateStaffActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel administratorPanel;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnRemoveStaff;
    private javax.swing.JButton btnRestore;
    private javax.swing.JButton btnUpdateStaff;
    private javax.swing.JComboBox<String> cbJobRole;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblCompanyLogo;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblJobRole;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStaffDetails;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblsearchIcon;
    private javax.swing.JScrollPane scrollTableStaff;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtDatabaseURL;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchStaff;
    // End of variables declaration//GEN-END:variables
}
