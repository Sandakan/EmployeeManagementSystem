
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.formdev.flatlaf.FlatLightLaf;

import UIPackage.LoginFrame;
import javax.swing.UIManager;

/**
 *
 * @author adsan
 */
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
    }
}
