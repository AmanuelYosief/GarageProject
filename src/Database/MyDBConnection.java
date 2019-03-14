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
     String DatabaseURL = "jdbc:sqlite:C://Users/amenu/OneDrive/Documents/NetbeansProjects/GarageProject/sqlite/db/GarageDatabase.db";

    @Override
        public ResultSet login(String username, String password) throws SQLException {
        
            try {
            conn = DriverManager.getConnection(DatabaseURL);
            pstm = conn.prepareStatement("SELECT * FROM staff WHERE staffId = ? AND password = ?"); //query to select the staff memebers dependednt on the staffId and password
            pstm.setString(1, username);
            pstm.setString(2, password);
           
            rs = pstm.executeQuery(); // get the infor from database
            System.out.println("Login Executed");
            return rs;

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Exception", JOptionPane.WARNING_MESSAGE);
        } 
        throw new UnsupportedOperationException("Sorry not know please come later ");

    }
 
    @Override
    public ResultSet displayAllStaff() throws SQLException {
        
        try {
            conn = DriverManager.getConnection(DatabaseURL);
            stm = conn.createStatement();
            rs = stm.executeQuery("Select staffID, staffFirstName, staffLastName, staffRole, staffEmail FROM Staff");
                                   System.out.println("displayAllStaff Executed");
            return rs;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Exception", JOptionPane.WARNING_MESSAGE);        
        }


        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet searchAllStaff(String value) throws SQLException {
        
        try {
            conn = DriverManager.getConnection(DatabaseURL);
            System.out.println(" SearchAll Staff connection established");
            pstm = conn.prepareStatement("Select staffID, staffFirstName, staffLastName, staffRole, staffEmail FROM Staff WHERE staffID LIKE ? OR staffFirstName LIKE ? OR staffLastName LIKE ? OR staffRole LIKE ? OR staffEmail LIKE ?");
            pstm.setString(1,'%' + value + '%');
            pstm.setString(2,'%' + value + '%');
            pstm.setString(3,'%' + value + '%');
            pstm.setString(4,'%' + value + '%');
            pstm.setString(5,'%' + value + '%');
            rs = pstm.executeQuery();
             
            return rs;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Exception 1"  ,JOptionPane.WARNING_MESSAGE);
        } 

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addStaff(String staffID, String firstName, String lastName, String role, String password, String email) {
        System.err.println("Attempting to AddStaff");
        // INSERT INTO Staff(staffID, staffFirstName, staffLastName, staffRole, password, staffEmail) VALUES (1, "Amanuel", "Henry", "Administrator", 55, "amanuel55@gmail.com");
        try {
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Insert Query");
            pstm = conn.prepareStatement("INSERT INTO Staff(staffID, staffFirstName, staffLastName, staffRole, password, staffEmail) VALUES (?,?,?,?,?,?)");
            System.err.println("After Insert Query");
            pstm.setString(1, staffID);
            pstm.setString(2, firstName);
            pstm.setString(3, lastName);
            pstm.setString(4, role);
            pstm.setString(5, password);
            pstm.setString(6, email);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Insert Exception", JOptionPane.WARNING_MESSAGE);
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
    public boolean deleteStaff(String staffID) {
        
         System.err.println("Attempting to Delete Staff");
        try {
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Delete Query");
            // DELETE FROM Staff WHERE staffID = 7;
            pstm = conn.prepareStatement("DELETE FROM Staff WHERE StaffID = ?");
            System.err.println("After Delete Query");
            pstm.setString(1, staffID);
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Delete Exception", JOptionPane.WARNING_MESSAGE);
        }           
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStaff(String staffID, String firstName, String lastName, String role, String email) {
        
         System.err.println("Attempting to Update Staff");
        try {
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
            System.err.println("Prior Update Query");
            pstm = conn.prepareStatement("UPDATE Staff SET staffFirstName = ?, staffLastName = ?, staffRole = ?, staffEmail = ? WHERE StaffID = ?");
            System.err.println("After Update Query");
            pstm.setString(1, firstName);
            pstm.setString(2, lastName);
            pstm.setString(3, role);
            pstm.setString(4, email);
            pstm.setString(5, staffID);
            
            System.err.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Update Exception", JOptionPane.WARNING_MESSAGE);
        }           
        
        
        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    

}
