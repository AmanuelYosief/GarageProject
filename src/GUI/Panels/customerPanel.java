/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import Controller.controller;
import GUI.AddCustomerForm;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amenu
 */
public class customerPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerPanel
     */
    public customerPanel() {
        initComponents();
        fetchAll();
    }
    
        public void fetchAll() {
        tblCustomer.setModel(DbUtils.resultSetToTableModel(controller.displayCustomer()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerPanel = new javax.swing.JPanel();
        lblSearchIcon = new javax.swing.JLabel();
        txtSearchCustomer = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        scrollTableCustomer = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        lblCustomerTitle = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblCustomerPhoneNumber = new javax.swing.JLabel();
        txtCustomerPhoneNumber = new javax.swing.JTextField();
        lblCustomerAddress = new javax.swing.JLabel();
        scrollCustomerAddress = new javax.swing.JScrollPane();
        txtCustomerAddress = new javax.swing.JTextArea();
        lblPostCode = new javax.swing.JLabel();
        txtCustomerPostCode = new javax.swing.JTextField();
        lblHomeNumber = new javax.swing.JLabel();
        txtCustomerHomeNumber = new javax.swing.JTextField();
        btnUpdateCustomer = new javax.swing.JButton();

        customerPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searchIcon.png"))); // NOI18N

        txtSearchCustomer.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txtSearchCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCustomerKeyReleased(evt);
            }
        });

        btnAddCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAddCustomer.setText("Add Customer");
        btnAddCustomer.setBorder(null);
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        tblCustomer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Post Code", "Phone Number", "Home Number", "Pay Later", "DiscountPlan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.setGridColor(new java.awt.Color(255, 255, 255));
        tblCustomer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblCustomerFocusGained(evt);
            }
        });
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        tblCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblCustomerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblCustomerKeyTyped(evt);
            }
        });
        scrollTableCustomer.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setResizable(false);
            tblCustomer.getColumnModel().getColumn(1).setResizable(false);
            tblCustomer.getColumnModel().getColumn(2).setResizable(false);
            tblCustomer.getColumnModel().getColumn(3).setResizable(false);
            tblCustomer.getColumnModel().getColumn(4).setResizable(false);
            tblCustomer.getColumnModel().getColumn(5).setResizable(false);
        }

        lblCustomerTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblCustomerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/userIcon.png"))); // NOI18N
        lblCustomerTitle.setText("Customer Detail");

        lblCustomerName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerName.setText("Name:");

        txtCustomerName.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblCustomerPhoneNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblCustomerPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerPhoneNumber.setText("Phone Number:");

        txtCustomerPhoneNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblCustomerAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblCustomerAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerAddress.setText("Address:");

        txtCustomerAddress.setColumns(20);
        txtCustomerAddress.setRows(5);
        scrollCustomerAddress.setViewportView(txtCustomerAddress);

        lblPostCode.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblPostCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostCode.setText("Post Code:");

        txtCustomerPostCode.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblHomeNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblHomeNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomeNumber.setText("Home Number");

        txtCustomerHomeNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        btnUpdateCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdateCustomer.setText("Update Customer");
        btnUpdateCustomer.setBorder(null);
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(lblSearchIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTableCustomer))
                .addGap(54, 54, 54)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCustomerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerPanelLayout.createSequentialGroup()
                        .addComponent(lblCustomerAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCustomerAddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerPanelLayout.createSequentialGroup()
                        .addComponent(lblPostCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(txtCustomerPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerName)
                            .addComponent(lblCustomerPhoneNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustomerPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCustomerName)))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(lblHomeNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCustomerHomeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addComponent(lblSearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(txtSearchCustomer)
                            .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                                .addComponent(scrollTableCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(customerPanelLayout.createSequentialGroup()
                                        .addComponent(lblCustomerAddress)
                                        .addGap(77, 77, 77))
                                    .addComponent(scrollCustomerAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPostCode)
                                    .addComponent(txtCustomerPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCustomerPhoneNumber)
                                    .addComponent(txtCustomerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHomeNumber)
                                    .addComponent(txtCustomerHomeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addComponent(lblCustomerTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCustomerName)
                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        // TODO add your handling code here:
        controller.closeDBConnection();
        AddCustomerForm openAddCustomer = new AddCustomerForm();
        openAddCustomer.setLocationRelativeTo(null);
        openAddCustomer.setResizable(false);
        openAddCustomer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        openAddCustomer.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void tblCustomerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblCustomerFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerFocusGained

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked

        txtCustomerName.setText(tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 1).toString());
        txtCustomerAddress.setText(tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 2).toString());
        txtCustomerPostCode.setText(tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 3).toString());
        txtCustomerPhoneNumber.setText(tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 4).toString());
        txtCustomerHomeNumber.setText(tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 5).toString());
        



        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void tblCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerKeyPressed

    private void tblCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCustomerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerKeyTyped

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        // TODO add your handling code here:
        
        //We can update customer once we get their CustomerID



        
        int cd = JOptionPane.showConfirmDialog(null,"Are you sure you want to update this customer?", "Update Customer", JOptionPane.YES_NO_OPTION);
        if (cd == JOptionPane.YES_OPTION ){
//txtCustomerName.getText().trim(), txtCustomerAddress.getText().trim(),txtCustomerPostCode.getText().trim(), txtCustomerPhoneNumber.getText().trim(),txtCustomerHomeNumber.getText().trim()
            try {
                controller.updateCustomer(txtCustomerName.getText().trim(),txtCustomerAddress.getText().trim(),txtCustomerPostCode.getText().trim(),txtCustomerPhoneNumber.getText().trim(),txtCustomerHomeNumber.getText().trim(), tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 0).toString());
            } catch (SQLException ex) {
                Logger.getLogger(customerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
          JOptionPane.showMessageDialog(null, "Customer sucessfully updated!", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        fetchAll();
        }
        else if (cd == JOptionPane.NO_OPTION){
        fetchAll();
        }
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void txtSearchCustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCustomerKeyReleased
        // TODO add your handling code here:
          tblCustomer.setModel(DbUtils.resultSetToTableModel(controller.searchCustomer(txtSearchCustomer.getText())));
    }//GEN-LAST:event_txtSearchCustomerKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerPhoneNumber;
    private javax.swing.JLabel lblCustomerTitle;
    private javax.swing.JLabel lblHomeNumber;
    private javax.swing.JLabel lblPostCode;
    private javax.swing.JLabel lblSearchIcon;
    private javax.swing.JScrollPane scrollCustomerAddress;
    private javax.swing.JScrollPane scrollTableCustomer;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextArea txtCustomerAddress;
    private javax.swing.JTextField txtCustomerHomeNumber;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPhoneNumber;
    private javax.swing.JTextField txtCustomerPostCode;
    private javax.swing.JTextField txtSearchCustomer;
    // End of variables declaration//GEN-END:variables
}
