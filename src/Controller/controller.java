/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Database.MyDBConnection;
import GUI.AdministratorForm;
import GUI.ForepersonForm;
import GUI.FranchiseeForm;
import GUI.MechanicForm;
import GUI.ReceptionistForm;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author amenu
 */
public class controller {

    static DBConnection conn = new MyDBConnection();

    public controller() {

    }
    static public boolean login(String Username, String password) { //this runs the login test
        ResultSet resultSet;
        boolean passed = false;
        try {
            resultSet = conn.login(Username, password);
            // isBeforeFirst() returns true if the cursor is before the first row; 
            // false if the cursor is at any other position or the result set contains no rows
            if (!resultSet.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No user exists with those login details. Try again", "Incorrect Login Detail", JOptionPane.WARNING_MESSAGE);
                System.out.println("No account information found");
                passed = false;
            } else {
                resultSet.next();
                String staffId = resultSet.getString("staffID");
                String firstName = resultSet.getString("staffFirstName");
                String lastName = resultSet.getString("staffLastName");
                String Role = resultSet.getString("staffRole");
                String Email = resultSet.getString("staffEmail");

                switch (Role) {
                    case "Administrator":
                        System.out.println("Administrator has logged in");
                        AdministratorForm openAdministrator = new AdministratorForm();
                        openAdministrator.setLocationRelativeTo(null);
                        openAdministrator.setResizable(false);
                        openAdministrator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        openAdministrator.setVisible(true);
                        break;
                    case "Franchisee":
                        System.out.println("Franchisee has logged in");
                        FranchiseeForm openFranchisee = new FranchiseeForm();
                        openFranchisee.setLocationRelativeTo(null);
                        openFranchisee.setResizable(false);
                        openFranchisee.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        openFranchisee.setVisible(true);
                        break;
                    case "Foreperson":
                        System.out.println("Foreperson has logged in");
                        ForepersonForm openForeperson = new ForepersonForm();
                        openForeperson.setLocationRelativeTo(null);
                        openForeperson.setResizable(false);
                        openForeperson.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        openForeperson.setVisible(true);
                        break;
                    case "Mechanic":
                        System.out.println("Mechanic has logged in");
                        MechanicForm openMechanic = new MechanicForm();
                        openMechanic.setLocationRelativeTo(null);
                        openMechanic.setResizable(false);
                        openMechanic.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        openMechanic.setVisible(true);
                        break;
                    case "Receptionist":
                        System.out.println("Receptionist has logged in");
                        ReceptionistForm OpenReceptionist = new ReceptionistForm();
                        OpenReceptionist.setLocationRelativeTo(null);
                        OpenReceptionist.setResizable(false);
                        OpenReceptionist.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        OpenReceptionist.setVisible(true);
                        break;
                    default:
                        break;
                }
                passed = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return passed;
    }

    public static ResultSet displayAllStaff() {
        try {
            return conn.displayAllStaff();
        } catch (SQLException ex) {

        }
        return null;

    }

    public static ResultSet searchAllStaff(String value) {
        try {
            return conn.searchAllStaff(value);
        } catch (SQLException ex) {

        }
        return null;

    }

    public static boolean addStaff(String staffID, String firstName, String lastName, String role, String password, String email) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean addStaff = conn.addStaff(staffID, firstName, lastName, role, password, email);

        if (addStaff == true) {
            System.err.println("Staff has been added to the database!");
            JOptionPane.showMessageDialog(null, "Staff has successfully been added!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Add Staff", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static boolean deleteStaff(String staffID) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean deleteStaff = conn.deleteStaff(staffID);

        if (deleteStaff == true) {
            System.err.println("Staff has been deleted fromt he database!");
            JOptionPane.showMessageDialog(null, "Staff has successfully been deleted!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to deltee Staff", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static boolean updateStaff(String staffID, String firstName, String lastName, String role, String email) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean updateStaff = conn.updateStaff(staffID, firstName, lastName, role, email);

        if (updateStaff == true) {
            System.err.println("Staff has been updated!");
            JOptionPane.showMessageDialog(null, "Staff has successfully been updated!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update Staff", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static void closeDBConnection() {
        try {
            conn.closeDBConnection();
        } catch (Exception e) {
        }
    }

}

