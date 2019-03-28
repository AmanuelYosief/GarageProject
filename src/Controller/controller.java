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

    static public boolean login(String login, String password) { //this runs the login test
        ResultSet resultSet;
        boolean passed = false;
        try {
            resultSet = conn.login(login, password);
            // isBeforeFirst() returns true if the cursor is before the first row; 
            // false if the cursor is at any other position or the result set contains no rows
            if (!resultSet.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No user exists with those login details. Try again", "Incorrect Login Detail", JOptionPane.WARNING_MESSAGE);
                System.out.println("No account information found");
                passed = false;
            } else {
                resultSet.next();
                String Role = resultSet.getString("staffRole");

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
                    case "Foreman":
                        System.out.println("Foreman has logged in");
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

    public static ResultSet displayStaff() {
        try {
            return conn.displayStaff();
        } catch (SQLException ex) {

        }
        return null;

    }

    public static ResultSet searchStaff(String value) {
        try {
            return conn.searchStaff(value);
        } catch (SQLException ex) {

        }
        return null;

    }

    // Name, Login, password, Role
    public static boolean addStaff(String name, String role, String login, String password) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean addStaff = conn.addStaff(name, role, login, password);

        if (addStaff == true) {
            System.err.println("Staff has been added to the database!");
            JOptionPane.showMessageDialog(null, "Staff has successfully been added!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Add Staff", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static boolean deleteStaff(String login) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean deleteStaff = conn.deleteStaff(login);

        if (deleteStaff == true) {
            System.err.println("Staff has been deleted fromt he database!");
            JOptionPane.showMessageDialog(null, "Staff has successfully been deleted!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to deltee Staff", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static boolean updateStaff(String name, String role, String login) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean updateStaff = conn.updateStaff(name, role, login);

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

    public static boolean addCustomer(String name, String address, String postCode, String phoneNumber, String homeNumber) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean addStaff = conn.addCustomer(name, address, postCode, phoneNumber, homeNumber);

        if (addStaff == true) {
            System.err.println("Customer has been added to the database!");
            JOptionPane.showMessageDialog(null, "Customer has successfully been added!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Add Customer", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static ResultSet displayCustomer() {
        try {
            return conn.displayCustomer();
        } catch (SQLException ex) {

        }
        return null;

    }

    public static ResultSet selectCustomer() {
        try {
            return conn.selectCustomer();
        } catch (SQLException ex) {

        }
        return null;

    }

    public static ResultSet searchCustomer(String value) {
        try {
            return conn.searchCustomer(value);
        } catch (SQLException ex) {

        }
        return null;

    }

    public static ResultSet getCustomerID(String name, String address, String postCode, String phoneNumber, String homeNumber) {
        try {
            return conn.displayCustomer();
        } catch (SQLException ex) {

        }
        return null;

    }

    public static boolean updateCustomer(String name, String address, String postCode, String phoneNumber, String homeNumber, String customerID) throws SQLException {
        System.err.println("Attempting to AddStaff @controller class");

        boolean updateCustomer = conn.updateCustomer(name, address, postCode, phoneNumber, homeNumber, customerID);

        if (updateCustomer == true) {
            System.err.println("Customer has been updated!");
            JOptionPane.showMessageDialog(null, "Customer has successfully been updated!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update Customer", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static boolean updateCustomerPlus(String name, String address, String postCode, String phoneNumber, String homeNumber, String customerID, String payLater, String discountPlan) throws SQLException {
        System.err.println("Attempting to AddStaff @controller class");

        boolean updateCustomer = conn.updateCustomerPlus(name, address, postCode, phoneNumber, homeNumber, customerID, payLater, discountPlan);

        if (updateCustomer == true) {
            System.err.println("Customer Plus has been updated!");
            JOptionPane.showMessageDialog(null, "Customer has successfully been updated!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update Customer", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static boolean addJob(String statusOfJob, String jobDescription, String jobType, String mechanicID, String vehicleID, String customerID) {
        System.err.println("Attempting to AddStaff @controller class");

        boolean addStaff = conn.addJob(statusOfJob, jobDescription, jobType, mechanicID, vehicleID, customerID);
        if (addStaff == true) {
            System.err.println("Vehicle has been added to the database!");
            JOptionPane.showMessageDialog(null, "Vehicle has successfully been added!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Vehicle to Add Staff", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public static ResultSet displayJob() {
        try {
            return conn.displayJob();
        } catch (SQLException ex) {

        }
        return null;

    }

    public static boolean addVehicle(String regNumber, String vehicleMake, String vehicleModel, String engSerial, String chassisNumber, String colour, String customerID) {
        System.err.println("Attempting to AddStaff @controller class");
        boolean addVehicle = conn.addVehicle(regNumber, vehicleMake, vehicleModel, engSerial, chassisNumber, colour, customerID);

        if (addVehicle == true) {
            System.err.println("Vehicle has been added to the database!");
            JOptionPane.showMessageDialog(null, "Vehicle has successfully been added!", "InfoBox", JOptionPane.OK_OPTION);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Add Vehicle", "InfoBox", JOptionPane.OK_OPTION);
            return false;
        }
    }

}
