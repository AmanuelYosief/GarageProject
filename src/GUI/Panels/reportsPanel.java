/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import java.awt.Color;

/**
 *
 * @author amenu
 */
public class reportsPanel extends javax.swing.JPanel {

    
    stockReportPanel p1;
    vehicleReportPanel p2;
    jobReportPanel p3;

    
    /**
     * Creates new form reportPanel
     */
    public reportsPanel() {
        initComponents();
                p1 = new stockReportPanel();
        p2 = new vehicleReportPanel();
        p3 = new jobReportPanel();
        
        
        tabbedReportPanel.addTab("Stock", p1);
        tabbedReportPanel.addTab("Vehicle", p2);
        tabbedReportPanel.addTab("Job", p3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedReportPanel = new javax.swing.JTabbedPane();

        setBackground(new java.awt.Color(255, 255, 255));

        tabbedReportPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabbedReportPanel.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedReportPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedReportPanel)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedReportPanel;
    // End of variables declaration//GEN-END:variables
}
