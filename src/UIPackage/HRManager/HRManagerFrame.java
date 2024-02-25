/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage.HRManager;

import com.formdev.flatlaf.FlatLightLaf;

import ClassPackage.User;
import UIPackage.Login.LoginFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adsan
 */
public class HRManagerFrame extends javax.swing.JFrame {

    User hrManager;

    /**
     * Creates new form HRManagerForm
     */
    private HRManagerFrame() {
        initComponents();
    }

    public HRManagerFrame(User hrManager) {
        this.hrManager = hrManager;
        initComponents();

        setHRManagerFrameProperties();
    }

    private void setHRManagerFrameProperties() {
        userNameLabel.setText(hrManager.getFirstName());
        userTypeLabel.setText("(" + hrManager.getUserType() + ")");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        sideBar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        createNewDepartmentPanelShowBtn = new javax.swing.JButton();
        createNewDesignationPanelShowBtn = new javax.swing.JButton();
        createNewDepartmentPanelShowBtn3 = new javax.swing.JButton();
        createNewDepartmentPanelShowBtn4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR Manager ");
        setMinimumSize(new java.awt.Dimension(0, 500));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        sideBar.setMinimumSize(new java.awt.Dimension(220, 0));
        sideBar.setPreferredSize(new java.awt.Dimension(220, 499));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Welcome,");

        userTypeLabel.setText("(HR_MANAGER)");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userNameLabel.setText("Sandakan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(userNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userTypeLabel))
                                        .addComponent(jLabel1))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNameLabel)
                                        .addComponent(userTypeLabel))
                                .addContainerGap()));

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        createNewDepartmentPanelShowBtn.setText("Add new Department");
        createNewDepartmentPanelShowBtn.setAlignmentX(0.5F);
        createNewDepartmentPanelShowBtn.setMaximumSize(new java.awt.Dimension(200, 40));
        createNewDepartmentPanelShowBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        createNewDepartmentPanelShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewDepartmentPanelShowBtnActionPerformed(evt);
            }
        });
        jPanel4.add(createNewDepartmentPanelShowBtn);

        createNewDesignationPanelShowBtn.setText("Add new Designation");
        createNewDesignationPanelShowBtn.setAlignmentX(0.5F);
        createNewDesignationPanelShowBtn.setMaximumSize(new java.awt.Dimension(200, 40));
        createNewDesignationPanelShowBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        createNewDesignationPanelShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewDesignationPanelShowBtnActionPerformed(evt);
            }
        });
        jPanel4.add(createNewDesignationPanelShowBtn);

        createNewDepartmentPanelShowBtn3.setText("Add new Employee");
        createNewDepartmentPanelShowBtn3.setAlignmentX(0.5F);
        createNewDepartmentPanelShowBtn3.setMaximumSize(new java.awt.Dimension(200, 40));
        createNewDepartmentPanelShowBtn3.setPreferredSize(new java.awt.Dimension(200, 40));
        createNewDepartmentPanelShowBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewDepartmentPanelShowBtn3ActionPerformed(evt);
            }
        });
        jPanel4.add(createNewDepartmentPanelShowBtn3);

        createNewDepartmentPanelShowBtn4.setText("Search Employees");
        createNewDepartmentPanelShowBtn4.setAlignmentX(0.5F);
        createNewDepartmentPanelShowBtn4.setMaximumSize(new java.awt.Dimension(200, 40));
        createNewDepartmentPanelShowBtn4.setPreferredSize(new java.awt.Dimension(200, 40));
        createNewDepartmentPanelShowBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewDepartmentPanelShowBtn4ActionPerformed(evt);
            }
        });
        jPanel4.add(createNewDepartmentPanelShowBtn4);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        logoutBtn.setText("Log out");
        logoutBtn.setAlignmentX(0.5F);
        logoutBtn.setMaximumSize(new java.awt.Dimension(200, 40));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel5.add(logoutBtn);

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
                sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sideBarLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                        .addGroup(sideBarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addContainerGap()));
        sideBarLayout.setVerticalGroup(
                sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sideBarLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jSplitPane1.setLeftComponent(sideBar);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.CardLayout(10, 10));

        defaultPanel.setBackground(new java.awt.Color(255, 255, 255));
        defaultPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select an option from the side bar to start");
        defaultPanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        body.add(defaultPanel, "card2");

        jSplitPane1.setRightComponent(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewDepartmentPanelShowBtn3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createNewDepartmentPanelShowBtn3ActionPerformed
        AddNewEmployeePanel addNewEmployeePanel = new AddNewEmployeePanel();
        body.removeAll();
        body.add(addNewEmployeePanel);
        body.repaint();
        body.revalidate();
    }// GEN-LAST:event_createNewDepartmentPanelShowBtn3ActionPerformed

    private void createNewDepartmentPanelShowBtn4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createNewDepartmentPanelShowBtn4ActionPerformed
        SearchEmployeesPanel searchEmployeesPanel = new SearchEmployeesPanel();
        body.removeAll();
        body.add(searchEmployeesPanel);
        body.repaint();
        body.revalidate();
    }// GEN-LAST:event_createNewDepartmentPanelShowBtn4ActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane,
                "Are you sure you want to log out from your (" + hrManager.getUserType() + ") account ?",
                "Log out confirmation",
                JOptionPane.YES_NO_OPTION);

        if (option == 0) {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_logoutBtnActionPerformed

    private void createNewDesignationPanelShowBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createNewDesignationPanelShowBtnActionPerformed
        AddNewDesignationPanel addNewDesignationPanel = new AddNewDesignationPanel();
        body.removeAll();
        body.add(addNewDesignationPanel);
        body.repaint();
        body.revalidate();
    }// GEN-LAST:event_createNewDesignationPanelShowBtnActionPerformed

    private void createNewDepartmentPanelShowBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createNewDepartmentPanelShowBtn2ActionPerformed
        AddNewDepartmentPanel addNewDepartmentPanel = new AddNewDepartmentPanel();
        body.removeAll();
        body.add(addNewDepartmentPanel);
        body.repaint();
        body.revalidate();
    }// GEN-LAST:event_createNewDepartmentPanelShowBtn2ActionPerformed

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRManagerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton createNewDepartmentPanelShowBtn;
    private javax.swing.JButton createNewDepartmentPanelShowBtn3;
    private javax.swing.JButton createNewDepartmentPanelShowBtn4;
    private javax.swing.JButton createNewDesignationPanelShowBtn;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
