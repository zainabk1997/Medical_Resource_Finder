/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author zainabkhokawala
 */
public class HospitalAdminDashboard extends javax.swing.JFrame {
    
    public static JFrame hospitalAdminDashboard;

    /**
     * Creates new form HospitalAdminDashboard
     */
    public HospitalAdminDashboard() {
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

        splitPane = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        lblHospitalAdmin = new javax.swing.JLabel();
        createPatient = new javax.swing.JButton();
        viewPatient = new javax.swing.JButton();
        createDoctor = new javax.swing.JButton();
        viewDoctor = new javax.swing.JButton();
        createEncounter = new javax.swing.JButton();
        viewEncounter = new javax.swing.JButton();
        sysAdminLogout = new javax.swing.JButton();
        btnHospitals = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 900));

        lblHospitalAdmin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblHospitalAdmin.setText("Hospital Admin Dashboard");
        lblHospitalAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        createPatient.setText("Create Patient");
        createPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 204), null, null));
        createPatient.setMaximumSize(new java.awt.Dimension(110, 23));
        createPatient.setMinimumSize(new java.awt.Dimension(110, 23));
        createPatient.setPreferredSize(new java.awt.Dimension(110, 23));
        createPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientActionPerformed(evt);
            }
        });

        viewPatient.setText("Patient Directory");
        viewPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 204), null, null));
        viewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientActionPerformed(evt);
            }
        });

        createDoctor.setText("Create Doctor");
        createDoctor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 51), null, null));
        createDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDoctorActionPerformed(evt);
            }
        });

        viewDoctor.setText("Doctor Directory");
        viewDoctor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 51), null, null));
        viewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorActionPerformed(evt);
            }
        });

        createEncounter.setText("Create Encounter");
        createEncounter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 255, 153), null, null));
        createEncounter.setMaximumSize(new java.awt.Dimension(100, 23));
        createEncounter.setMinimumSize(new java.awt.Dimension(100, 23));
        createEncounter.setPreferredSize(new java.awt.Dimension(100, 23));
        createEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEncounterActionPerformed(evt);
            }
        });

        viewEncounter.setText("Encounter History");
        viewEncounter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 255, 153), null, null));
        viewEncounter.setMaximumSize(new java.awt.Dimension(100, 23));
        viewEncounter.setMinimumSize(new java.awt.Dimension(100, 23));
        viewEncounter.setPreferredSize(new java.awt.Dimension(100, 23));
        viewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEncounterActionPerformed(evt);
            }
        });

        sysAdminLogout.setText("LOGOUT");
        sysAdminLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 255), null, null));
        sysAdminLogout.setMaximumSize(new java.awt.Dimension(100, 23));
        sysAdminLogout.setMinimumSize(new java.awt.Dimension(100, 23));
        sysAdminLogout.setPreferredSize(new java.awt.Dimension(100, 23));
        sysAdminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysAdminLogoutActionPerformed(evt);
            }
        });

        btnHospitals.setText("Hospitals");
        btnHospitals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 255, 153), null, null));
        btnHospitals.setMaximumSize(new java.awt.Dimension(100, 23));
        btnHospitals.setMinimumSize(new java.awt.Dimension(100, 23));
        btnHospitals.setPreferredSize(new java.awt.Dimension(100, 23));
        btnHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHospitalAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sysAdminLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(viewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHospitalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(createPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewPatient)
                .addGap(95, 95, 95)
                .addComponent(createDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDoctor)
                .addGap(87, 87, 87)
                .addComponent(createEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sysAdminLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPane);

        rightPane.setMaximumSize(new java.awt.Dimension(1000, 900));
        rightPane.setMinimumSize(new java.awt.Dimension(1000, 900));
        rightPane.setPreferredSize(new java.awt.Dimension(1000, 900));

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(rightPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncounter viewEncounter = new ViewEncounter();
        JScrollPane scrollBar = new JScrollPane(viewEncounter, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_viewEncounterActionPerformed

    private void createEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEncounterActionPerformed
        // TODO add your handling code here:
        CreateEncounter createEncounter = new CreateEncounter();
        JScrollPane scrollBar = new JScrollPane(createEncounter, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_createEncounterActionPerformed

    private void viewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorActionPerformed
        // TODO add your handling code here:
        ViewDoctorHospitalAdmin viewDoctor = new ViewDoctorHospitalAdmin();
        JScrollPane scrollBar = new JScrollPane(viewDoctor, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_viewDoctorActionPerformed

    private void createDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctor createDoctor = new CreateDoctor();
        JScrollPane scrollBar = new JScrollPane(createDoctor, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_createDoctorActionPerformed

    private void viewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientHospitalAdmin viewPatient = new ViewPatientHospitalAdmin();
        JScrollPane scrollBar = new JScrollPane(viewPatient, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_viewPatientActionPerformed

    private void createPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientActionPerformed
        // TODO add your handling code here:
        CreatePatient createPatient = new CreatePatient();
        JScrollPane scrollBar = new JScrollPane(createPatient, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_createPatientActionPerformed

    private void sysAdminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysAdminLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);

        UserLogin userLogin = new UserLogin();

        userLogin.setVisible(true);
    }//GEN-LAST:event_sysAdminLogoutActionPerformed

    private void btnHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalsActionPerformed
        // TODO add your handling code here:
        Hospitals hospitals = new Hospitals();
        JScrollPane scrollBar = new JScrollPane(hospitals, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        splitPane.setRightComponent(scrollBar);
    }//GEN-LAST:event_btnHospitalsActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(hospitalAdminDashboard == null)
                hospitalAdminDashboard = new HospitalAdminDashboard();
                hospitalAdminDashboard.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospitals;
    private javax.swing.JButton createDoctor;
    private javax.swing.JButton createEncounter;
    private javax.swing.JButton createPatient;
    private javax.swing.JLabel lblHospitalAdmin;
    private javax.swing.JPanel leftPane;
    private javax.swing.JPanel rightPane;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton sysAdminLogout;
    private javax.swing.JButton viewDoctor;
    private javax.swing.JButton viewEncounter;
    private javax.swing.JButton viewPatient;
    // End of variables declaration//GEN-END:variables
}
