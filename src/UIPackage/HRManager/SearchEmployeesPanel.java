/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage.HRManager;

import ClassPackage.Department;
import ClassPackage.Designation;
import ClassPackage.DepartmentDataStorage;
import ClassPackage.DesignationDataStorage;
import ClassPackage.Employee;
import ClassPackage.EmployeeDataStorage;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adsan
 */
public class SearchEmployeesPanel extends javax.swing.JPanel {

    private EmployeeDataStorage employeeDataStorage;
    private DepartmentDataStorage departmentDataStorage;
    private DesignationDataStorage designationDataStorage;

    /**
     * Creates new form SearchEmployeesPanel
     */
    public SearchEmployeesPanel() {
        this.employeeDataStorage = new EmployeeDataStorage();
        this.departmentDataStorage = new DepartmentDataStorage();
        this.designationDataStorage = new DesignationDataStorage();
        initComponents();
        setDepartmentAndDesignationComboBoxItems();
        searchEmployees();
    }

    private void showFoundEmployeesInTable(ArrayList<Employee> employees) {
        ArrayList<String[]> employeeData = new ArrayList<>();
        String[] columnNames = {
                "Employee ID", "First Name", "Last Name", "EPF Number", "Department", "Designation"
        };
        for (Employee employee : employees) {
            String[] record = {
                    employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),
                    employee.getEpfNumber(),
                    employee.getDepartment(),
                    employee.getDesignation()
            };
            employeeData.add(record);
        }

        int noOfRecords = employeeData.size();
        noOfRecordsLabel.setText(String.valueOf(noOfRecords));

        if (noOfRecords > 0) {
            String[][] employeeDataStrings = new String[6][employeeData.size()];
            employeeDataStrings = employeeData.toArray(employeeDataStrings);
            employeesTable.setModel(new DefaultTableModel(
                    employeeDataStrings, columnNames));
        } else {
            employeesTable.setModel(new DefaultTableModel(
                    new Object[][] { null, null, null, null, null, null }, columnNames));
        }

    }

    private void searchEmployees() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String epfNumber = epfNumberField.getText();
        String department = departmentTypeField.getSelectedItem().toString().equals("NOT_SELECTED") ? ""
                : departmentTypeField.getSelectedItem().toString();
        String designation = designationTypeField.getSelectedItem().toString().equals("NOT_SELECTED") ? ""
                : designationTypeField.getSelectedItem().toString();

        ArrayList<Employee> filteredEmployees = employeeDataStorage.searchEmployees(firstName, lastName,
                epfNumber,
                department,
                designation);
        showFoundEmployeesInTable(filteredEmployees);
    }

    private void setDepartmentAndDesignationComboBoxItems() {
        ArrayList<Department> departments = departmentDataStorage.getData();
        DefaultComboBoxModel<String> departmentTypeFieldModel = new DefaultComboBoxModel<>();

        departmentTypeFieldModel.addElement("NOT_SELECTED");
        for (Department department : departments) {
            departmentTypeFieldModel.addElement(department.getName());
        }

        departmentTypeField.setModel(departmentTypeFieldModel);
        departmentTypeField.setSelectedIndex(0);

        ArrayList<Designation> designations = designationDataStorage.getData();
        DefaultComboBoxModel<String> designationTypeFieldModel = new DefaultComboBoxModel<>();

        designationTypeFieldModel.addElement("NOT_SELECTED");
        for (Designation designation : designations) {
            String designationName = designation.getName();
            designationTypeFieldModel.addElement(designationName);
        }

        designationTypeField.setModel(designationTypeFieldModel);
        designationTypeField.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameFieldsContainer = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        epfNumberField = new javax.swing.JTextField();
        nameFieldsContainer1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        designationTypeField = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        departmentTypeField = new javax.swing.JComboBox<>();
        searchControlsContainer = new javax.swing.JPanel();
        clearFiltersBtn = new javax.swing.JButton();
        searchEmployeesBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        noOfRecordsLabel = new javax.swing.JLabel();
        noOfRecords1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeesTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Search Employees");
        add(jLabel15, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        nameFieldsContainer.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setAlignmentX(1.0F);
        jPanel8.setAlignmentY(1.0F);

        jLabel8.setText("First Name");

        firstNameField.setToolTipText("Search for employees by their first name");
        firstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        firstNameField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }

            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                handleFirstNameChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Last Name");

        lastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)));
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("EPF Number");

        epfNumberField.setToolTipText("Search for employees by their EPF number");
        epfNumberField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        epfNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epfNumberFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(epfNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)));
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(epfNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        javax.swing.GroupLayout nameFieldsContainerLayout = new javax.swing.GroupLayout(nameFieldsContainer);
        nameFieldsContainer.setLayout(nameFieldsContainerLayout);
        nameFieldsContainerLayout.setHorizontalGroup(
                nameFieldsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameFieldsContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)));
        nameFieldsContainerLayout.setVerticalGroup(
                nameFieldsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameFieldsContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(nameFieldsContainerLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        jPanel1.add(nameFieldsContainer);

        nameFieldsContainer1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setAlignmentX(1.0F);
        jPanel10.setAlignmentY(1.0F);

        jLabel10.setText("Designation");

        designationTypeField.setToolTipText("Search for employees by their designation");
        designationTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationTypeFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(designationTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addContainerGap()));
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(designationTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Department");

        departmentTypeField.setToolTipText("Search for employees by their department");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(departmentTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 249,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addContainerGap()));
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(departmentTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout nameFieldsContainer1Layout = new javax.swing.GroupLayout(nameFieldsContainer1);
        nameFieldsContainer1.setLayout(nameFieldsContainer1Layout);
        nameFieldsContainer1Layout.setHorizontalGroup(
                nameFieldsContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameFieldsContainer1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(339, Short.MAX_VALUE)));
        nameFieldsContainer1Layout.setVerticalGroup(
                nameFieldsContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameFieldsContainer1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(nameFieldsContainer1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));

        jPanel1.add(nameFieldsContainer1);

        searchControlsContainer.setBackground(new java.awt.Color(255, 255, 255));
        searchControlsContainer.setMaximumSize(new java.awt.Dimension(32767, 100));
        searchControlsContainer.setPreferredSize(new java.awt.Dimension(862, 90));
        searchControlsContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 30));

        clearFiltersBtn.setBackground(new java.awt.Color(0, 122, 255));
        clearFiltersBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearFiltersBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearFiltersBtn.setText("Clear Filters");
        clearFiltersBtn.setToolTipText("Clear all search result filters");
        clearFiltersBtn.setPreferredSize(new java.awt.Dimension(129, 40));
        clearFiltersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFiltersBtnActionPerformed(evt);
            }
        });
        searchControlsContainer.add(clearFiltersBtn);

        searchEmployeesBtn.setBackground(new java.awt.Color(0, 122, 255));
        searchEmployeesBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchEmployeesBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchEmployeesBtn.setText("Search Employees");
        searchEmployeesBtn.setToolTipText("Search for employees");
        searchEmployeesBtn.setMinimumSize(new java.awt.Dimension(140, 27));
        searchEmployeesBtn.setPreferredSize(new java.awt.Dimension(140, 40));
        searchEmployeesBtn.setRolloverEnabled(false);
        searchEmployeesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeesBtnActionPerformed(evt);
            }
        });
        searchControlsContainer.add(searchEmployeesBtn);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 50));

        noOfRecordsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noOfRecordsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noOfRecordsLabel.setText("0");

        noOfRecords1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noOfRecords1.setText("no. of records found");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(noOfRecordsLabel)
                                .addGap(18, 18, 18)
                                .addComponent(noOfRecords1)
                                .addContainerGap(29, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(noOfRecords1)
                                        .addComponent(noOfRecordsLabel))
                                .addContainerGap(16, Short.MAX_VALUE)));

        searchControlsContainer.add(jPanel2);

        jPanel1.add(searchControlsContainer);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(700, 406));

        employeesTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "User ID", "First Name", "Last Name", "EPF Number", "Department", "Designation"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class,
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        employeesTable.setToolTipText("Employee search results");
        employeesTable.setPreferredSize(new java.awt.Dimension(700, 80));
        employeesTable.setShowGrid(true);
        jScrollPane2.setViewportView(employeesTable);

        jPanel1.add(jScrollPane2);

        add(jPanel1, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Used to clear all previous data field values
     */
    private void clearFiltersBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearFiltersBtnActionPerformed
        firstNameField.setText("");
        lastNameField.setText("");
        epfNumberField.setText("");
        departmentTypeField.setSelectedIndex(0);
        designationTypeField.setSelectedIndex(0);

        showFoundEmployeesInTable(employeeDataStorage.searchEmployees("", "", "", "", ""));
    }// GEN-LAST:event_clearFiltersBtnActionPerformed

    private void epfNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_epfNumberFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_epfNumberFieldActionPerformed

    private void designationTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_designationTypeFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_designationTypeFieldActionPerformed

    private void handleFirstNameChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_handleFirstNameChanged
        // TODO add your handling code here:
        System.out.println(firstNameField.getText());
    }// GEN-LAST:event_handleFirstNameChanged

    private void searchEmployeesBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchEmployeesBtnActionPerformed
        searchEmployees();
    }// GEN-LAST:event_searchEmployeesBtnActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_lastNameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearFiltersBtn;
    private javax.swing.JComboBox<String> departmentTypeField;
    private javax.swing.JComboBox<String> designationTypeField;
    private javax.swing.JTable employeesTable;
    private javax.swing.JTextField epfNumberField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPanel nameFieldsContainer;
    private javax.swing.JPanel nameFieldsContainer1;
    private javax.swing.JLabel noOfRecords1;
    private javax.swing.JLabel noOfRecordsLabel;
    private javax.swing.JPanel searchControlsContainer;
    private javax.swing.JButton searchEmployeesBtn;
    // End of variables declaration//GEN-END:variables
}
