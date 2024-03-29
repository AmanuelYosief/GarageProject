/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import Controller.controller;
import GUI.AddJobForm;
import javax.swing.WindowConstants;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amenu
 */
public class jobPlusPanel extends javax.swing.JPanel {

    /**
     * Creates new form jobPlusPanel
     */
    public jobPlusPanel() {
     //fetchAll();
    }
    
        public void fetchAll() {
        // All Jobs
            //tblJob.setModel(DbUtils.resultSetToTableModel(controller.displayJob()));
        // Pending Jobs
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jobPanel = new javax.swing.JPanel();
        lblAllJobs = new javax.swing.JLabel();
        txtSearchAllJob = new javax.swing.JTextField();
        lblsearchIcon = new javax.swing.JLabel();
        scrollTableAllJobs = new javax.swing.JScrollPane();
        tblAllJobs = new javax.swing.JTable();
        btnAddJob = new javax.swing.JButton();
        lblPendingJobs = new javax.swing.JLabel();
        scrollTablePendingJobs = new javax.swing.JScrollPane();
        tblJob = new javax.swing.JTable();
        btnProduceInvoice = new javax.swing.JButton();
        btnPickJob = new javax.swing.JButton();
        lblJobTitle = new javax.swing.JLabel();
        lblJobNo = new javax.swing.JLabel();
        txtJobNo = new javax.swing.JTextField();
        lblJobStatus = new javax.swing.JLabel();
        cdJobStatus = new javax.swing.JComboBox<>();
        lblDateBooked = new javax.swing.JLabel();
        txtDateBooked = new javax.swing.JTextField();
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
        lblTelephoneNo = new javax.swing.JLabel();
        txtTelephoneNo = new javax.swing.JTextField();
        lblMechanicAllocated = new javax.swing.JLabel();
        cbMechanicAllocated = new javax.swing.JComboBox<>();
        btnAlterJob = new javax.swing.JButton();
        btnAllocateMechanic = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jobPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblAllJobs.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblAllJobs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAllJobs.setText("All Jobs");

        txtSearchAllJob.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblsearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searchIcon.png"))); // NOI18N

        tblAllJobs.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Job Number", "Description", "Status", "Mechanic", "Customer", "Start Date", "End Date", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAllJobs.setGridColor(new java.awt.Color(255, 255, 255));
        tblAllJobs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblAllJobsFocusGained(evt);
            }
        });
        tblAllJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAllJobsMouseClicked(evt);
            }
        });
        tblAllJobs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAllJobsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblAllJobsKeyTyped(evt);
            }
        });
        scrollTableAllJobs.setViewportView(tblAllJobs);

        btnAddJob.setBackground(new java.awt.Color(255, 255, 255));
        btnAddJob.setText("Add Job");
        btnAddJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJobActionPerformed(evt);
            }
        });

        lblPendingJobs.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblPendingJobs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPendingJobs.setText("Pending Jobs");

        tblJob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblJob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Job Number", "Description", "Status", "Mechanic", "Customer", "Start Date", "End Date", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
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
        scrollTablePendingJobs.setViewportView(tblJob);

        btnProduceInvoice.setBackground(new java.awt.Color(255, 255, 255));
        btnProduceInvoice.setText("Produce Invoice");

        btnPickJob.setBackground(new java.awt.Color(255, 255, 255));
        btnPickJob.setText("Pick Job");

        lblJobTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblJobTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jobIcon.png"))); // NOI18N
        lblJobTitle.setText("Job Detail");

        lblJobNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblJobNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobNo.setText("Job No:");

        txtJobNo.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblJobStatus.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblJobStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJobStatus.setText("Job Status:");

        cdJobStatus.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cdJobStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Active", "Complete" }));

        lblDateBooked.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblDateBooked.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateBooked.setText("Date Booked:");

        txtDateBooked.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

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

        lblTelephoneNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTelephoneNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelephoneNo.setText("Telephone Number:");

        txtTelephoneNo.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N

        lblMechanicAllocated.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMechanicAllocated.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMechanicAllocated.setText("Mechanic Allocated:");

        cbMechanicAllocated.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbMechanicAllocated.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));

        btnAlterJob.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterJob.setText("Alter Job");

        btnAllocateMechanic.setBackground(new java.awt.Color(255, 255, 255));
        btnAllocateMechanic.setText("Allocate Mechanic");

        javax.swing.GroupLayout jobPanelLayout = new javax.swing.GroupLayout(jobPanel);
        jobPanel.setLayout(jobPanelLayout);
        jobPanelLayout.setHorizontalGroup(
            jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobPanelLayout.createSequentialGroup()
                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jobPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPendingJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jobPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scrollTablePendingJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jobPanelLayout.createSequentialGroup()
                                .addComponent(lblAllJobs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchAllJob, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblsearchIcon))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(scrollTableAllJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jobPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProduceInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPickJob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterJob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAllocateMechanic)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jobPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(jobPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnAddJob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jobPanelLayout.createSequentialGroup()
                                .addComponent(lblJobStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cdJobStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDateBooked)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateBooked))
                            .addGroup(jobPanelLayout.createSequentialGroup()
                                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblJobNo)
                                    .addComponent(lblJobDescription))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jobPanelLayout.createSequentialGroup()
                                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJobCustomerName)
                                    .addComponent(lblTelephoneNo)
                                    .addComponent(lblMechanicAllocated))
                                .addGap(96, 96, 96)
                                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJobCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMechanicAllocated, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jobPanelLayout.createSequentialGroup()
                                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jobPanelLayout.createSequentialGroup()
                                        .addComponent(lblMake)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblModel))
                                    .addComponent(lblVehicleRegNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31))
        );
        jobPanelLayout.setVerticalGroup(
            jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jobPanelLayout.createSequentialGroup()
                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jobPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblJobTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJobNo)
                            .addComponent(txtJobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDateBooked)
                                .addComponent(txtDateBooked, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblJobStatus)
                                .addComponent(cdJobStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJobDescription)
                            .addComponent(scrollJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMake)
                            .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVehicleRegNo)
                            .addComponent(txtVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJobCustomerName)
                            .addComponent(txtJobCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelephoneNo)
                            .addComponent(txtTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMechanicAllocated)
                            .addComponent(cbMechanicAllocated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddJob, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jobPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnProduceInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jobPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAllocateMechanic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterJob, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPickJob, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(773, 773, 773))
            .addGroup(jobPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAllJobs)
                        .addComponent(txtSearchAllJob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblsearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTableAllJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPendingJobs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTablePendingJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1243, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jobPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jobPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblAllJobsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblAllJobsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAllJobsFocusGained

    private void tblAllJobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAllJobsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAllJobsMouseClicked

    private void tblAllJobsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAllJobsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAllJobsKeyPressed

    private void tblAllJobsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAllJobsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAllJobsKeyTyped

    private void tblJobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblJobFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobFocusGained

    private void tblJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJobMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobMouseClicked

    private void tblJobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblJobKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobKeyPressed

    private void tblJobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblJobKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJobKeyTyped

    private void txtJobCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobCustomerNameActionPerformed

    private void btnAddJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJobActionPerformed
        controller.closeDBConnection();
        AddJobForm openAddJob = new AddJobForm();
        openAddJob.setLocationRelativeTo(null);
        openAddJob.setResizable(false);
        openAddJob.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        openAddJob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddJobActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJob;
    private javax.swing.JButton btnAllocateMechanic;
    private javax.swing.JButton btnAlterJob;
    private javax.swing.JButton btnPickJob;
    private javax.swing.JButton btnProduceInvoice;
    private javax.swing.JComboBox<String> cbMechanicAllocated;
    private javax.swing.JComboBox<String> cdJobStatus;
    private javax.swing.JPanel jobPanel;
    private javax.swing.JLabel lblAllJobs;
    private javax.swing.JLabel lblDateBooked;
    private javax.swing.JLabel lblJobCustomerName;
    private javax.swing.JLabel lblJobDescription;
    private javax.swing.JLabel lblJobNo;
    private javax.swing.JLabel lblJobStatus;
    private javax.swing.JLabel lblJobTitle;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblMechanicAllocated;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPendingJobs;
    private javax.swing.JLabel lblTelephoneNo;
    private javax.swing.JLabel lblVehicleRegNo;
    private javax.swing.JLabel lblsearchIcon;
    private javax.swing.JScrollPane scrollJobDescription;
    private javax.swing.JScrollPane scrollTableAllJobs;
    private javax.swing.JScrollPane scrollTablePendingJobs;
    private javax.swing.JTable tblAllJobs;
    private javax.swing.JTable tblJob;
    private javax.swing.JTextField txtDateBooked;
    private javax.swing.JTextField txtJobCustomerName;
    private javax.swing.JTextArea txtJobDescription;
    private javax.swing.JTextField txtJobNo;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSearchAllJob;
    private javax.swing.JTextField txtTelephoneNo;
    private javax.swing.JTextField txtVehicleRegNo;
    // End of variables declaration//GEN-END:variables
}
