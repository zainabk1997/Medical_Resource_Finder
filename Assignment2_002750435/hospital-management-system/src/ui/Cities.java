/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.SystemAdmin;
import validators.NumberValidator;
import validators.StringValidator;

/**
 *
 * @author zainabkhokawala
 */
public class Cities extends javax.swing.JPanel {

    /**
     * Creates new form Cities1
     */
    public Cities() {
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

        lblCities = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        txtCityID = new javax.swing.JTextField();
        lblCityID = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtCommunityNames = new javax.swing.JTextField();
        lblCommunityNames = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        lblCities.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        lblCities.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCities.setText("City Management");
        lblCities.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City ID", "City Name", "Community Names"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);

        txtCityID.setInputVerifier(new NumberValidator());

        lblCityID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCityID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCityID.setText("City ID");

        lblCityName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCityName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCityName.setText("City Name");

        txtCityName.setInputVerifier(new StringValidator());

        txtCommunityNames.setInputVerifier(new StringValidator());

        lblCommunityNames.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCommunityNames.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCommunityNames.setText("Community Names");

        btnCreate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.setPreferredSize(new java.awt.Dimension(84, 28));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(84, 28));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCities, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunityNames, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCommunityNames, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(lblCityID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(txtCityID)
                    .addGap(256, 256, 256)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCities, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunityNames, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCommunityNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(409, 409, 409)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCityID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(409, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        long cityID = Long.parseLong(txtCityID.getText());
        String cityName = txtCityName.getText();
        String [] cNames = txtCommunityNames.getText().split(",");
        ArrayList<String> communityNames = new ArrayList<String>();
        for(int i=0; i<cNames.length; i++)
        communityNames.add(cNames[i]);
        City city = new City(cityName, cityID, communityNames);
        SystemAdmin.cityDirectoryRef.getCityDirectory().add(city);

        JOptionPane.showMessageDialog(this, "New City Details Added Successfully!");

        txtCityID.setText("");
        txtCityName.setText("");
        txtCommunityNames.setText("");
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selected = tblCities.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        }

        long cityID = Long.parseLong(txtCityID.getText());
        String cityName = txtCityName.getText();

        //      City city = new City(cityName, cityID, communityNames);
        City city = SystemAdmin.cityDirectoryRef.getCityDirectory().get(selected);

        city.setCityID(cityID);
        city.setName(cityName);

        ArrayList<String> communityNames = city.getCommunityNames();
        communityNames.clear();

        String [] cNames = txtCommunityNames.getText().split(",");

        for(int i=0; i<cNames.length; i++)
        communityNames.add(cNames[i]);

        populateTable();

        txtCityID.setText("");
        txtCityName.setText("");
        txtCommunityNames.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selected = tblCities.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view!");
            return;
        }

        City city = SystemAdmin.cityDirectoryRef.getCityDirectory().get(selected);

        txtCityID.setText(String.valueOf(city.getCityID()));
        txtCityName.setText(String.valueOf(city.getName()));

        String names = "";
        for(String c : city.getCommunityNames())
        names += c+",";
        names = names.substring(0, names.length()-1);
        txtCommunityNames.setText(names);

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selected = tblCities.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }

        City city = SystemAdmin.cityDirectoryRef.getCityDirectory().get(selected);

        SystemAdmin.cityDirectoryRef.getCityDirectory().remove(city);

        populateTable();

        txtCityID.setText("");
        txtCityName.setText("");
        txtCommunityNames.setText("");

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCities;
    private javax.swing.JLabel lblCityID;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCommunityNames;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField txtCityID;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCommunityNames;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
                for (City city : SystemAdmin.cityDirectoryRef.getCityDirectory()) {

            Object[] rowData = new Object[3];
            rowData[0] = city.getCityID();
            rowData[1] = city.getName();
            String names = "";
            for(String c : city.getCommunityNames())
                names += c+",";
            names = names.substring(0, names.length()-1);
            rowData[2] = names;
            model.addRow(rowData);
    }

    }   
}
