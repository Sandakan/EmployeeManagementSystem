/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import ClassPackage.Department;
import ClassPackage.DepartmentDataStorage;
import javax.swing.JOptionPane;

/**
 *
 * @author adsan
 */
public class AddNewDepartmentPanel extends javax.swing.JPanel {

    private DepartmentDataStorage departmentDataStorage;

    /**
     * Creates new form AddNewDepartmentPanel
     */
    public AddNewDepartmentPanel() {
        initComponents();
        this.departmentDataStorage = new DepartmentDataStorage();
        clearAndSetAddNewDepartmentPanelProperties();
    }
    
    
    private void clearAndSetAddNewDepartmentPanelProperties() {
        newDepartmentIdLabel.setText(departmentDataStorage.getNextDepartmentId());

        departmentNameField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newDepartmentIdLabel = new javax.swing.JLabel();
        epfNumberFieldContainer = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        departmentNameField = new javax.swing.JTextField();
        createAccountBtnContainer = new javax.swing.JPanel();
        addDepartmentBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Add New Department");
        add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 50));

        jLabel3.setText("Department ID");

        newDepartmentIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newDepartmentIdLabel.setText("001");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(newDepartmentIdLabel)
                .addGap(0, 521, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newDepartmentIdLabel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel1);

        epfNumberFieldContainer.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Department Name");

        departmentNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        departmentNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(departmentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departmentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout epfNumberFieldContainerLayout = new javax.swing.GroupLayout(epfNumberFieldContainer);
        epfNumberFieldContainer.setLayout(epfNumberFieldContainerLayout);
        epfNumberFieldContainerLayout.setHorizontalGroup(
            epfNumberFieldContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epfNumberFieldContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        epfNumberFieldContainerLayout.setVerticalGroup(
            epfNumberFieldContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epfNumberFieldContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(epfNumberFieldContainer);

        createAccountBtnContainer.setBackground(new java.awt.Color(255, 255, 255));

        addDepartmentBtn.setText("Add New Department");
        addDepartmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountBtnContainerLayout = new javax.swing.GroupLayout(createAccountBtnContainer);
        createAccountBtnContainer.setLayout(createAccountBtnContainerLayout);
        createAccountBtnContainerLayout.setHorizontalGroup(
            createAccountBtnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountBtnContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDepartmentBtn)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        createAccountBtnContainerLayout.setVerticalGroup(
            createAccountBtnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountBtnContainerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addDepartmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        add(createAccountBtnContainer);
    }// </editor-fold>//GEN-END:initComponents

    private void departmentNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentNameFieldActionPerformed

    private void addDepartmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDepartmentBtnActionPerformed
        String newDepartmentId = newDepartmentIdLabel.getText();
        String newDepartmentName = departmentNameField.getText().toUpperCase();

        if (newDepartmentName.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Check whether the department name field is filled correctly.",
                    "Add new Department failed", JOptionPane.ERROR_MESSAGE);
        } else if (departmentDataStorage.isDepartmentAvailable(newDepartmentName)) {
            JOptionPane.showMessageDialog(null,
                    "A department named \'" + newDepartmentName + "\' already exists.",
                    "Add new Department failed", JOptionPane.ERROR_MESSAGE);
        } else {
            Department newDepartment = new Department(newDepartmentId, newDepartmentName);
            boolean isAddedDepartmentSuccess = departmentDataStorage.addDepartment(newDepartment);

            if (isAddedDepartmentSuccess) {
                String createdUserData = "\nDepartment ID : " + newDepartmentId + "\nDepartment Name : "
                        + newDepartmentName;

                JOptionPane.showMessageDialog(null,
                        "Added a new department successfully.\n" + createdUserData,
                        "Added a new department successfully.", JOptionPane.INFORMATION_MESSAGE);

                clearAndSetAddNewDepartmentPanelProperties();
            }
        }
    }//GEN-LAST:event_addDepartmentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDepartmentBtn;
    private javax.swing.JPanel createAccountBtnContainer;
    private javax.swing.JTextField departmentNameField;
    private javax.swing.JPanel epfNumberFieldContainer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JLabel newDepartmentIdLabel;
    // End of variables declaration//GEN-END:variables
}
