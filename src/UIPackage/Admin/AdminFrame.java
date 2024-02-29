/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage.Admin;

import ClassPackage.Admin;
import UIPackage.Login.LoginFrame;

import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author adsan
 */
public class AdminFrame extends javax.swing.JFrame {

    Admin adminUser;

    /**
     * Creates new form AdminFrame
     */
    private AdminFrame() {
        initComponents();
    }

    public AdminFrame(Admin adminUser) {
        this.adminUser = adminUser;

        initComponents();
        setAdminFrameProperties();
    }

    private void setAdminFrameProperties() {
        userNameLabel.setText(adminUser.getFirstName());
        userTypeLabel.setText("(" + adminUser.getUserType() + ")");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        sideBar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        createNewAccountPanelShowBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Profile");
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jSplitPane1.setDividerSize(1);

        sideBar.setBackground(new java.awt.Color(249, 249, 249));
        sideBar.setMinimumSize(new java.awt.Dimension(250, 0));
        sideBar.setPreferredSize(new java.awt.Dimension(250, 499));

        jPanel4.setBackground(new java.awt.Color(249, 249, 249));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        createNewAccountPanelShowBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createNewAccountPanelShowBtn.setText("Create new Account");
        createNewAccountPanelShowBtn.setAlignmentX(0.5F);
        createNewAccountPanelShowBtn.setMaximumSize(new java.awt.Dimension(200, 40));
        createNewAccountPanelShowBtn.setMinimumSize(new java.awt.Dimension(150, 27));
        createNewAccountPanelShowBtn.setPreferredSize(new java.awt.Dimension(150, 27));
        createNewAccountPanelShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAccountPanelShowBtnActionPerformed(evt);
            }
        });
        jPanel4.add(createNewAccountPanelShowBtn);

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Welcome,");

        userTypeLabel.setForeground(new java.awt.Color(102, 102, 102));
        userTypeLabel.setText("(Administrator)");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 122, 255));
        userNameLabel.setText("Sandakan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel)
                    .addComponent(jLabel1)
                    .addComponent(userTypeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(249, 249, 249));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutBtn.setText("Log out");
        logoutBtn.setAlignmentX(0.5F);
        logoutBtn.setMaximumSize(new java.awt.Dimension(200, 40));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel5.add(logoutBtn);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel4.setBackground(new java.awt.Color(249, 249, 249));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/banner-logo-small.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, "card2");

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel3)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(sideBar);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.CardLayout());

        defaultPanel.setBackground(new java.awt.Color(255, 255, 255));
        defaultPanel.setLayout(new java.awt.BorderLayout(10, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select an option from the side bar to start.");
        jLabel2.setPreferredSize(new java.awt.Dimension(380, 25));
        defaultPanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        body.add(defaultPanel, "card2");

        jSplitPane1.setRightComponent(body);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewAccountPanelShowBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createNewAccountPanelShowBtnActionPerformed
        CreateNewAccountPanel createNewAccountPanel = new CreateNewAccountPanel();
        body.removeAll();
        body.add(createNewAccountPanel);
        body.repaint();
        body.revalidate();
    }// GEN-LAST:event_createNewAccountPanelShowBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane,
                "Are you sure you want to log out from your (Administrator) account ?",
                "Log out confirmation",
                JOptionPane.YES_NO_OPTION);

        if (option == 0) {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            this.dispose();
        }

    }// GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton createNewAccountPanelShowBtn;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
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
