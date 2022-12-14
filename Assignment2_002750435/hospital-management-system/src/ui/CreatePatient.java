/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.House;
import model.PatientDetails;
import model.PatientDirectory;
import model.SystemAdmin;
import validators.NumberValidator;
import validators.StringValidator;

/**
 *
 * @author zainabkhokawala
 */
public class CreatePatient extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatient
     */
    PatientDirectory patientDirectory;
    public CreatePatient() {
        initComponents();
        this.patientDirectory = patientDirectory;
        genderButtonGroup.add(male);
        genderButtonGroup.add(female);
        genderButtonGroup.add(nonBinary);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        lblCreatePatient = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        nonBinary = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        txtPhoneNumber = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JPasswordField();
        txtHouseNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblFullName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserPassword = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));

        lblCreatePatient.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblCreatePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePatient.setText("Create Patient");
        lblCreatePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

        txtSSN.setInputVerifier(new NumberValidator());

        txtFullName.setInputVerifier(new StringValidator());

        txtAge.setInputVerifier(new NumberValidator());

        nonBinary.setText("Non Binary");

        female.setText("Female");

        male.setText("Male");

        txtPhoneNumber.setInputVerifier(new NumberValidator());

        txtUserName.setInputVerifier(new StringValidator());

        txtUserPassword.setInputVerifier(new StringValidator());

        txtHouseNumber.setInputVerifier(new NumberValidator());

        btnSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblFullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFullName.setText("Full Name");

        lblAge.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age");

        lblSSN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSSN.setText("SSN");

        lblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhoneNumber.setText("Phone Number");

        lblGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender");

        lblHouseNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHouseNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHouseNumber.setText("House Number");

        lblUserName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUserName.setText("User Name");

        lblUserPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUserPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUserPassword.setText("Password");

        txtZipCode.setInputVerifier(new NumberValidator());

        lblZipCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblZipCode.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblZipCode.setText("Zip Code");

        lblStreetAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStreetAddress.setText("Street Address");

        txtStreetAddress.setInputVerifier(new StringValidator());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreatePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lblStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(female)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(male)
                                        .addGap(26, 26, 26)
                                        .addComponent(nonBinary))
                                    .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserPassword)
                                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(nonBinary)
                    .addComponent(female)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        long patientSSN = Long.parseLong(txtSSN.getText());
        String patientName = txtFullName.getText();
        int patientAge = Integer.parseInt(txtAge.getText());
        String patientGender="";
        if(male.isSelected()){
            patientGender = "Male";
          
        } else if(female.isSelected()){
            patientGender = "Female";
          
        } else {
            patientGender = "Non Binary";
      
        }
        long patientPhone = Long.parseLong(txtPhoneNumber.getText());
        
        int houseNumber = Integer.parseInt(txtHouseNumber.getText());
        
        long houseZip = Long.parseLong(txtZipCode.getText());
        
        String patientAddress = txtStreetAddress.getText();
        
        House house = new House(patientAddress, houseNumber, houseZip);
        String patientUserName = txtUserName.getText();
        String patientPassword = String.valueOf(txtUserPassword.getPassword());
        
        List<Long> ssnList = SystemAdmin.personDirectoryRef.getPersonDirectory().stream().map(x -> x.getPersonSSN()).toList();
        
          if(ssnList.contains(patientSSN)){
            JOptionPane.showMessageDialog(this, "SSN already exists. Please check");
        } else{
              
                PatientDetails patientDetails = new PatientDetails(patientSSN, patientName,  
                patientGender, patientAge, patientPhone, 
        patientUserName, patientPassword, house);
        
        SystemAdmin.patientDirectoryRef.getPatientDirectory().add(patientDetails);
        
        SystemAdmin.personDirectoryRef.getPersonDirectory().add(patientDetails);

        JOptionPane.showMessageDialog(this, "New Patient Details Added Successfully!");
        
        txtSSN.setText("");
        txtFullName.setText("");
        txtAge.setText("");
        txtPhoneNumber.setText("");
        txtUserName.setText("");
        txtUserPassword.setText("");
        txtStreetAddress.setText("");
        txtHouseNumber.setText("");
        txtZipCode.setText("");
        genderButtonGroup.clearSelection();
        
        
         }
        
      
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreatePatient;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton nonBinary;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtUserPassword;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
