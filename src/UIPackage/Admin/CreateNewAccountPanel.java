/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage.Admin;

import ClassPackage.User;
import ClassPackage.UserDataStorage;
import javax.swing.JOptionPane;

/**
 *
 * @author adsan
 */
public class CreateNewAccountPanel extends javax.swing.JPanel {
    private UserDataStorage userDataStorage;

    /**
     * Creates new form CreateNewAccountPanel
     */
    public CreateNewAccountPanel() {
        this.userDataStorage = new UserDataStorage();
        initComponents();
        clearAndSetCreateNewAccountPanelProperties();
    }

    /** Used to clear all previous data field values and set the next user id */
    private void clearAndSetCreateNewAccountPanelProperties() {
        nextUserIdLabel.setText(userDataStorage.getNextUserId());

        passwordField.setText("");
        confirmPasswordField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userIdLabelContainer = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        nextUserIdLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameFieldsContainer = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        passwordFieldsContainer = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        designationFieldContainer = new javax.swing.JPanel();
        userTypeField = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        createAccountBtnContainer = new javax.swing.JPanel();
        createAccountBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Create New User Account");
        add(jLabel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        userIdLabelContainer.setBackground(new java.awt.Color(255, 255, 255));
        userIdLabelContainer.setPreferredSize(new java.awt.Dimension(592, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        nextUserIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextUserIdLabel.setText("1");

        jLabel4.setText("New User ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)
                                .addComponent(nextUserIdLabel)
                                .addContainerGap()));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nextUserIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        javax.swing.GroupLayout userIdLabelContainerLayout = new javax.swing.GroupLayout(userIdLabelContainer);
        userIdLabelContainer.setLayout(userIdLabelContainerLayout);
        userIdLabelContainerLayout.setHorizontalGroup(
                userIdLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userIdLabelContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(722, Short.MAX_VALUE)));
        userIdLabelContainerLayout.setVerticalGroup(
                userIdLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userIdLabelContainerLayout
                                .createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel3.add(userIdLabelContainer);

        nameFieldsContainer.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setAlignmentX(1.0F);
        jPanel7.setAlignmentY(1.0F);

        jLabel5.setText("First Name");

        firstNameField.setToolTipText("First name of the user account");
        firstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Last Name");

        lastNameField.setToolTipText("Last name of the user account");
        lastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        javax.swing.GroupLayout nameFieldsContainerLayout = new javax.swing.GroupLayout(nameFieldsContainer);
        nameFieldsContainer.setLayout(nameFieldsContainerLayout);
        nameFieldsContainerLayout.setHorizontalGroup(
                nameFieldsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameFieldsContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(282, Short.MAX_VALUE)));
        nameFieldsContainerLayout.setVerticalGroup(
                nameFieldsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameFieldsContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(nameFieldsContainerLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        jPanel3.add(nameFieldsContainer);

        passwordFieldsContainer.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setAlignmentX(1.0F);
        jPanel9.setAlignmentY(1.0F);

        jLabel10.setText("Password");

        passwordField.setToolTipText("A strong password for the user account");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addContainerGap()));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Confirm Password");

        confirmPasswordField.setToolTipText("Confirm the password");
        confirmPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)));
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
                                        Short.MAX_VALUE)));

        javax.swing.GroupLayout passwordFieldsContainerLayout = new javax.swing.GroupLayout(passwordFieldsContainer);
        passwordFieldsContainer.setLayout(passwordFieldsContainerLayout);
        passwordFieldsContainerLayout.setHorizontalGroup(
                passwordFieldsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(passwordFieldsContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(270, Short.MAX_VALUE)));
        passwordFieldsContainerLayout.setVerticalGroup(
                passwordFieldsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(passwordFieldsContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(passwordFieldsContainerLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        jPanel3.add(passwordFieldsContainer);

        designationFieldContainer.setBackground(new java.awt.Color(255, 255, 255));

        userTypeField.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "HR_MANAGER", "HR_ASSISTANT" }));
        userTypeField.setToolTipText("Select the user type");

        jLabel9.setText("User Type");

        javax.swing.GroupLayout designationFieldContainerLayout = new javax.swing.GroupLayout(
                designationFieldContainer);
        designationFieldContainer.setLayout(designationFieldContainerLayout);
        designationFieldContainerLayout.setHorizontalGroup(
                designationFieldContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(designationFieldContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(designationFieldContainerLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(userTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(571, Short.MAX_VALUE)));
        designationFieldContainerLayout.setVerticalGroup(
                designationFieldContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(designationFieldContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel3.add(designationFieldContainer);

        createAccountBtnContainer.setBackground(new java.awt.Color(255, 255, 255));

        createAccountBtn.setBackground(new java.awt.Color(0, 122, 255));
        createAccountBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createAccountBtn.setText("Add User Account");
        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountBtnContainerLayout = new javax.swing.GroupLayout(
                createAccountBtnContainer);
        createAccountBtnContainer.setLayout(createAccountBtnContainerLayout);
        createAccountBtnContainerLayout.setHorizontalGroup(
                createAccountBtnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createAccountBtnContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(createAccountBtn)
                                .addContainerGap(686, Short.MAX_VALUE)));
        createAccountBtnContainerLayout.setVerticalGroup(
                createAccountBtnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createAccountBtnContainerLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(createAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.add(createAccountBtnContainer);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void createAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createAccountBtnActionPerformed
        String userId = nextUserIdLabel.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String userType = userTypeField.getSelectedItem().toString();

        if (firstName.isBlank() || lastName.isBlank() || userType.isBlank()) {
            JOptionPane.showMessageDialog(null,
                    "Check whether all the fields are filled correctly.",
                    "Create new account failed", JOptionPane.ERROR_MESSAGE);

        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null,
                    "Password and the Confirm Password must match.",
                    "Create new account failed", JOptionPane.ERROR_MESSAGE);

        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(null,
                    "Password must be at least 8 characters.",
                    "Create new account failed", JOptionPane.ERROR_MESSAGE);

        } else if (userDataStorage.isUserAvailable(firstName, lastName, userType)) {
            JOptionPane.showMessageDialog(null,
                    "An account with entered EPF number already exists.",
                    "Create new account failed", JOptionPane.ERROR_MESSAGE);
        } else {
            User user = new User(userId, password, firstName, lastName, userType);
            boolean isAddedUserSuccess = userDataStorage.addUser(user);

            if (isAddedUserSuccess) {
                String createdUserData = "\nUser ID : " + userId + "\nFirst Name : " + firstName
                        + "\nLast Name : "
                        + lastName + "\nUser Type : " + userType;

                JOptionPane.showMessageDialog(null,
                        "Account created successfully.\n" + createdUserData,
                        "Account created successfully.", JOptionPane.INFORMATION_MESSAGE);

                clearAndSetCreateNewAccountPanelProperties();
            }
        }
    }// GEN-LAST:event_createAccountBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JPanel createAccountBtnContainer;
    private javax.swing.JPanel designationFieldContainer;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPanel nameFieldsContainer;
    private javax.swing.JLabel nextUserIdLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel passwordFieldsContainer;
    private javax.swing.JPanel userIdLabelContainer;
    private javax.swing.JComboBox<String> userTypeField;
    // End of variables declaration//GEN-END:variables
}
