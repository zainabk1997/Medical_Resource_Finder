/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.House;
import model.PatientDetails;
import model.SystemAdmin;

/**
 *
 * @author zainabkhokawala
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form NewUserRegistration
     */
    public UserRegistration() {
        initComponents();
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
        lblNewPatient = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtSSN = new javax.swing.JTextField();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        nonBinary = new javax.swing.JRadioButton();
        lblPhoneNumber = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        lblGender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        txtPhoneNumber = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUserPassword = new javax.swing.JLabel();
        txtUserPassword = new javax.swing.JPasswordField();
        btnReturn = new javax.swing.JButton();
        txtStreetAddress = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        lblHouseNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNewPatient.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblNewPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewPatient.setText("New Patient Registration");
        lblNewPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

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

        nonBinary.setText("Non Binary");

        lblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhoneNumber.setText("Phone Number");

        female.setText("Female");

        lblGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGender.setText("Gender");

        male.setText("Male");

        lblUserName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUserName.setText("User Name");

        lblUserPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUserPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUserPassword.setText("Password");

        btnReturn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnReturn.setText("Go Back to Login");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lblStreetAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStreetAddress.setText("Street Address");

        lblZipCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblZipCode.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblZipCode.setText("Zip Code");

        lblHouseNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHouseNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHouseNumber.setText("House Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(female)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addComponent(male)
                                    .addGap(26, 26, 26)
                                    .addComponent(nonBinary))
                                .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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
                .addGap(18, 18, 18)
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
                .addGap(32, 32, 32)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
        UserLogin userLogin = new UserLogin();
        
        userLogin.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

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
        } else {
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
            
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblNewPatient;
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