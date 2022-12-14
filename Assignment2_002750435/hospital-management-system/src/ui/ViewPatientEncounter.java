/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EncounterDetails;
import model.Hospital;
import model.SystemAdmin;
import validators.NumberValidator;
import validators.StringValidator;

/**
 *
 * @author zainabkhokawala
 */
public class ViewPatientEncounter extends javax.swing.JPanel {

    /**
     * Creates new form EncounterHistory
     */
    public ViewPatientEncounter() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewAppointment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        lblWeight = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblBodyTemperature = new javax.swing.JLabel();
        lblVitalSigns = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        txtBodyTemperature = new javax.swing.JTextField();
        lblPrescription = new javax.swing.JLabel();
        txtPrescription = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        timeChooser = new javax.swing.JFormattedTextField();
        lblDate = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        lblViewAppointment.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblViewAppointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewAppointment.setText("Appointment History");
        lblViewAppointment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Encounter ID", "Weight", "Height", "Blood Pressure", "Body Temperature", "Prescription", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        lblWeight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWeight.setText("Weight");

        lblBloodPressure.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBloodPressure.setText("Blood Pressure");

        txtHeight.setEditable(false);
        txtHeight.setInputVerifier(new NumberValidator());

        txtWeight.setEditable(false);
        txtWeight.setInputVerifier(new NumberValidator());

        lblHeight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHeight.setText("Height");

        lblBodyTemperature.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblBodyTemperature.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBodyTemperature.setText("Body Temperature");

        lblVitalSigns.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblVitalSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVitalSigns.setText("Manage Vital Signs");
        lblVitalSigns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtBloodPressure.setEditable(false);
        txtBloodPressure.setInputVerifier(new NumberValidator());

        txtBodyTemperature.setEditable(false);
        txtBodyTemperature.setInputVerifier(new NumberValidator());

        lblPrescription.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPrescription.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPrescription.setText("Prescription");

        txtPrescription.setEditable(false);
        txtPrescription.setInputVerifier(new StringValidator());

        lblTime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTime.setText("Appointment Time");

        dateChooser.setDateFormatString("MM/dd/yyyy");

        timeChooser.setEditable(false);
        timeChooser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        timeChooser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeChooser.setInputVerifier(new StringValidator());

        lblDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setText("Appointment Date");

        btnView.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(lblVitalSigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(401, 401, 401))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblViewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selected = tblVitalSigns.getSelectedRow();
        
          if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view!");
            return;
        }
          
        EncounterDetails encounter = SystemAdmin.encounterHistoryRef.getEncounterDirectory().get(selected);
        
        txtWeight.setText(String.valueOf(encounter.getVitalSigns().getWeight()));
        txtHeight.setText(String.valueOf(encounter.getVitalSigns().getHeight()));
        txtBloodPressure.setText(String.valueOf(encounter.getVitalSigns().getBloodPressure()));
        txtBodyTemperature.setText(String.valueOf(encounter.getVitalSigns().getBodyTemperature()));
        txtPrescription.setText(String.valueOf(encounter.getPrescribedMedicine()));
        dateChooser.setDate(encounter.getEncounterDate());
        timeChooser.setText(String.valueOf(encounter.getEncounterTime()));
        
        

    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBodyTemperature;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblPrescription;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblViewAppointment;
    private javax.swing.JLabel lblVitalSigns;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JFormattedTextField timeChooser;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemperature;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtPrescription;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
            DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        model.setRowCount(0);
                for (EncounterDetails encounter : SystemAdmin.encounterHistoryRef.getEncounterDirectory()) {

            Object[] rowData = new Object[9];
            rowData[0] = encounter.getPatientName();
            rowData[1] = encounter.getEncounterID();
            rowData[2] = encounter.getVitalSigns().getWeight();
            rowData[3] = encounter.getVitalSigns().getHeight();
            rowData[4] = encounter.getVitalSigns().getBloodPressure();
            rowData[5] = encounter.getVitalSigns().getBodyTemperature();
            rowData[6] = encounter.getPrescribedMedicine();
            rowData[7] = encounter.getEncounterDate();
            rowData[8] = encounter.getEncounterTime();
            model.addRow(rowData);

        }
    }
}
