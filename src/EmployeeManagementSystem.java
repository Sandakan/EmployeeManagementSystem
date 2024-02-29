
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.formdev.flatlaf.FlatLightLaf;

import UIPackage.Login.LoginFrame;
import javax.swing.UIManager;

/**
 *
 * @author adsan
 */

/**
 * Main class to initialize the system.
 * 
 * System may fail to load if the `FlatLightLaf.jar` file is missing in the
 * `/dependency` folder or if the dependency is not configured as a `classpath`
 * in the IDE.
 * 
 * Use the `EmployeeManagementSystem.jar` file in the `/dist` if there are no
 * other options to get it working.
 */
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLightLaf Look and Feel");
        }

        LoginFrame login = new LoginFrame();
        login.setVisible(true);
    }
}
