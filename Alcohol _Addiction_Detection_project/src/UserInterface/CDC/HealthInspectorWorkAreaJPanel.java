/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CDC;

import Business.Enterprise.Enterprise;
import Business.Enterprise.CDCEnterprise;
import Business.Organization.HealthInspectorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class HealthInspectorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthInspectorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private HealthInspectorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network network;

    public HealthInspectorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (HealthInspectorOrganization) organization;
        this.enterprise = (CDCEnterprise) enterprise;
        this.userAccount = account;
        this.network = network;
        networkname.setText(network.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGenerateReports = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        networkname = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Health Inspector Work Area");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnGenerateReports.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnGenerateReports.setText("Generate Reports");
        btnGenerateReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Network :");

        networkname.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(networkname))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerateReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(437, 437, 437))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkname))
                .addGap(73, 73, 73)
                .addComponent(btnGenerateReports, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportsActionPerformed
        // TODO add your handling code here:

        HealthInspectorReportsJPanel healthinspectorReportsPanel = new HealthInspectorReportsJPanel(userProcessContainer, system, network);
        userProcessContainer.add("HealthInspectorReportsJPanel", healthinspectorReportsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnGenerateReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerateReports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel networkname;
    // End of variables declaration//GEN-END:variables
}
