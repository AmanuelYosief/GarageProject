/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author amanuel
 */
public class MyDBConnection implements DBConnection {

    private static Connection conn;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    String DatabaseURL = "jdbc:sqlite:C://Users/amenu/OneDrive/Documents/NetbeansProjects/GarageProject/sqlite/db/Garage.db";

    @Override
    public ResultSet login(String login, String password) throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            pstm = conn.prepareStatement("SELECT * FROM staff WHERE login = ? AND password = ?"); //query to select the staff memebers dependednt on the login and password
            pstm.setString(1, login);
            pstm.setString(2, password);

            rs = pstm.executeQuery(); // get the infor from database
            System.out.println("Login Executed");
            return rs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Sorry not know please come later ");

    }

    @Override
    public ResultSet displayStaff() throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("Select staffName, staffRole, login FROM Staff");
            System.out.println("displayAllStaff Executed");
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        @Override
    public ResultSet displayStock() throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("SELECT partName, numPartsListed, initialStockLevel, usedStock, threshold, delivery FROM Stock");
            System.out.println("display Stock Executed");
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public ResultSet searchStaff(String value) throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            System.out.println(" SearchAll Staff connection established");
            pstm = conn.prepareStatement("Select staffName, staffRole, login FROM Staff WHERE staffName LIKE ? OR staffRole LIKE ? OR login LIKE ?");
            pstm.setString(1, '%' + value + '%');
            pstm.setString(2, '%' + value + '%');
            pstm.setString(3, '%' + value + '%');
            rs = pstm.executeQuery();

            return rs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception 1", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addStaff(String name, String role, String login, String password) {
        System.err.println("Attempting to AddStaff");
        try {  // String name, String role, String login, String password
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Insert Query");
            pstm = conn.prepareStatement("INSERT INTO Staff(staffName, staffRole, login,  password) VALUES (?,?,?,?)");
            System.err.println("After Insert Query");
            pstm.setString(1, name);
            pstm.setString(2, role);
            pstm.setString(3, login);
            pstm.setString(4, password);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Insert Exception", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeDBConnection() throws SQLException {
        // CLOSE Connection AT THE END
        System.out.print("The connection has been closedLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        System.out.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteStaff(String login) {

        System.err.println("Attempting to Delete Staff");
        try {
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Delete Query");
            // DELETE FROM Staff WHERE staffID = 7;
            pstm = conn.prepareStatement("DELETE FROM Staff WHERE login = ?");
            System.err.println("After Delete Query");
            pstm.setString(1, login);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Delete Exception", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStaff(String name, String role, String login) {

        System.err.println("Attempting to Update Staff");
        try {
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Update Query");
            pstm = conn.prepareStatement("UPDATE Staff SET staffName = ?, staffRole = ? WHERE login = ?");
            System.err.println("After Update Query");
            pstm.setString(1, name);
            pstm.setString(2, role);
            pstm.setString(3, login);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Update Exception", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addCustomer(String name, String address, String postCode, String phoneNumber, String homeNumber) {
        System.err.println("Attempting to Customer");
        try {  // String name, String role, String login, String password
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Insert Query");
            pstm = conn.prepareStatement("INSERT INTO Customer(name, address, postCode, phoneNumber,  homeNumber, payLater, discountID) VALUES (?,?,?,?,?,?,?)");
            System.err.println("After Insert Query");
            pstm.setString(1, name);
            pstm.setString(2, address);
            pstm.setString(3, postCode);
            pstm.setString(4, phoneNumber);
            pstm.setString(5, homeNumber);
            pstm.setString(6, "N");
            pstm.setString(7, "0");
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Insert Exception", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }

    @Override
    public ResultSet displayCustomer() throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("Select customerID, name, address, postCode, phoneNumber, homeNumber, payLater, discountPlan FROM Customer INNER JOIN Discount on Discount.discountID = Customer.discountID");
            System.out.println("displayAllStaff Executed");
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectCustomer() throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("Select customerID, name, phoneNumber FROM Customer");
            System.out.println("displayAllStaff Executed");
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet searchCustomer(String value) throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            System.out.println(" SearchAll Customer connection established");
            pstm = conn.prepareStatement("Select customerID ,name, address, postCode,phoneNumber,homeNumber, payLater, discountPlan FROM Customer INNER JOIN Discount on Discount.discountID = Customer.discountID WHERE customerID LIKE ? OR name LIKE ? OR address LIKE ? OR postCode LIKE ? OR phoneNumber LIKE ? OR homeNumber LIKE ?");
            pstm.setString(1, '%' + value + '%');
            pstm.setString(2, '%' + value + '%');
            pstm.setString(3, '%' + value + '%');
            pstm.setString(4, '%' + value + '%');
            pstm.setString(5, '%' + value + '%');
            pstm.setString(6, '%' + value + '%');
            rs = pstm.executeQuery();

            return rs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception 1", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    @Override
    public boolean updateCustomer(String name, String address, String postCode, String phoneNumber, String homeNumber, String customerID) {
        System.err.println("Attempting to Update Staff");

        try {
            pstm.close();
            rs.close();

            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Update Query");
            pstm = conn.prepareStatement("UPDATE Customer SET name = ?, address = ? , postCode = ?, phoneNumber = ?, homeNumber = ? WHERE customerID = ?");
            System.err.println("After Update Query");
            pstm.setString(1, name);
            pstm.setString(2, address);
            pstm.setString(3, postCode);
            pstm.setString(4, phoneNumber);
            pstm.setString(5, homeNumber);
            pstm.setString(6, customerID);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Update Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCustomerPlus(String name, String address, String postCode, String phoneNumber, String homeNumber, String customerID, String payLater, String discountPlan) {

        try {
            pstm.close();
            rs.close();

            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Update Query");
            pstm = conn.prepareStatement("UPDATE Customer SET name = ?, address = ? , postCode = ?, phoneNumber = ?, homeNumber = ?, payLater = ? WHERE customerID = ?");
            System.err.println("After Update Query");
            pstm.setString(1, name);
            pstm.setString(2, address);
            pstm.setString(3, postCode);
            pstm.setString(4, phoneNumber);
            pstm.setString(5, homeNumber);
            pstm.setString(6, payLater);
            pstm.setString(7, customerID);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            //return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Update Exception", JOptionPane.WARNING_MESSAGE);
        }
        
        

        String getDiscountID = null;
        try {
            conn = DriverManager.getConnection(DatabaseURL);
            pstm = conn.prepareStatement("SELECT discountID FROM Customer WHERE customerID = ?"); //query to select the staff memebers dependednt on the login and password
            pstm.setString(1, customerID);
            rs = pstm.executeQuery(); // get the infor from database
            System.out.println("Login Executed");
            System.out.println(rs);
            while(rs.next()){
            getDiscountID = rs.getString("discountID");
            }
        }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e + " AAAAAAAAAAAAAAAAA");
    } 
        JOptionPane.showMessageDialog(null, getDiscountID + "      AAAAAAAAAAAAAAAAA");
        try{
        pstm.close();
            rs.close();

            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Update Query");
            pstm = conn.prepareStatement("UPDATE Discount SET discountPlan = ? WHERE discountID = ?");
            pstm.setString(1, discountPlan);
            pstm.setString(2, getDiscountID);
            pstm.execute();
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + " BBBBBBBBBBBBBBBBBBB");
        }
        
        
        
        
        return true;
       
    }

    @Override
    public boolean addJob(String statusOfJob, String jobDescription, String jobType, String mechanicID, String vehicleID, String customerID) {
        System.err.println("Attempting to AddStaff");
        try {  // String name, String role, String login, String password
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Insert Query");
            pstm = conn.prepareStatement("INSERT INTO Job(statusOfJob, jobDescription, jobType, staffID, vehicleID, customerID) VALUES (?,?,?,?,?,?)");
            System.err.println("After Insert Query");
            pstm.setString(1, statusOfJob);
            pstm.setString(2, jobDescription);
            pstm.setString(3, jobType);
            pstm.setString(4, mechanicID);
            pstm.setString(5, vehicleID);
            pstm.setString(6, customerID);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Insert Exception", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ResultSet displayJob() throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("SELECT jobNo,statusOfJob, jobDescription, vehicleMake, vehicleModel, regNumber, staffName, name, phoneNumber FROM Job INNER JOIN Customer on Customer.customerID = Job.customerID INNER JOIN Staff on Staff.staffID = Job.staffID INNER JOIN Vehicle on Vehicle.vehicleID = Job.vehicleID");
            System.out.println("displayAllStaff Executed");
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean addVehicle(String regNumber, String vehicleMake, String vehicleModel, String engSerial, String chassisNumber, String colour, String customerID) {
        System.err.println("Attempting to addVehicle");
        try {  // String name, String role, String login, String password
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Insert Query");
            pstm = conn.prepareStatement("INSERT INTO Vehicle(regNumber, vehicleMake, vehicleModel,  engSerial, chassisNumber, colour, customerID) VALUES (?,?,?,?,?,?,?)");
            System.err.println("After Insert Query");
            pstm.setString(1, regNumber);
            pstm.setString(2, vehicleMake);
            pstm.setString(3, vehicleModel);
            pstm.setString(4, engSerial);
            pstm.setString(5, chassisNumber);
            pstm.setString(6, colour);
            pstm.setString(7, customerID);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Insert Exception", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet displayPendingJob() throws SQLException {
        
         try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("SELECT jobNo,statusOfJob, jobDescription, vehicleMake, vehicleModel, regNumber, staffName, name, phoneNumber FROM Job INNER JOIN Customer on Customer.customerID = Job.customerID INNER JOIN Staff on Staff.staffID = Job.staffID INNER JOIN Vehicle on Vehicle.vehicleID = Job.vehicleID WHERE statusOfJob = 'Pending'");
            System.out.println("displayAllStaff Executed");
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet searchJob(String value) throws SQLException {
        
        try {
            conn = DriverManager.getConnection(DatabaseURL);
            System.out.println(" SearchAll Staff connection established");
            pstm = conn.prepareStatement("SELECT jobNo,statusOfJob, jobDescription, vehicleMake, vehicleModel, regNumber, staffName, name, phoneNumber FROM Job INNER JOIN Customer on Customer.customerID = Job.customerID INNER JOIN Staff on Staff.staffID = Job.staffID INNER JOIN Vehicle on Vehicle.vehicleID = Job.vehicleID WHERE jobNo LIKE ? OR statusOfJob LIKE ? OR jobDescription LIKE ? OR vehicleMake LIKE ? OR vehicleModel LIKE ? OR regNumber LIKE ? OR staffName LIKE ? OR name LIKE ? OR phoneNumber LIKE ?");
            pstm.setString(1, '%' + value + '%');
            pstm.setString(2, '%' + value + '%');
            pstm.setString(3, '%' + value + '%');
                        pstm.setString(4, '%' + value + '%');
            pstm.setString(5, '%' + value + '%');
            pstm.setString(6, '%' + value + '%');
                        pstm.setString(1, '%' + value + '%');
            pstm.setString(7, '%' + value + '%');
            pstm.setString(8, '%' + value + '%');
            pstm.setString(9, '%' + value + '%');
            rs = pstm.executeQuery();

            return rs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception 1", JOptionPane.WARNING_MESSAGE);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
        @Override
    public ResultSet searchStock(String value) throws SQLException {

        try {
            conn = DriverManager.getConnection(DatabaseURL);
            System.out.println(" SearchAll Staff connection established");
            pstm = conn.prepareStatement("SELECT partName, numPartsListed, initialStockLevel, usedStock, threshold, delivery FROM Stock WHERE partName LIKE ? OR numPartsListed LIKE ? OR initialStockLevel LIKE ? OR usedStock LIKE ? OR threshold LIKE ? OR delivery LIKE ?");
            pstm.setString(1, '%' + value + '%');
            pstm.setString(2, '%' + value + '%');
            pstm.setString(3, '%' + value + '%');
            pstm.setString(4, '%' + value + '%');
            pstm.setString(5, '%' + value + '%');
            pstm.setString(6, '%' + value + '%');
            rs = pstm.executeQuery();

            return rs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "SQL Exception 1", JOptionPane.WARNING_MESSAGE);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
