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
     String DatabaseURL = "jdbc:sqlite:C://Users/amenu/OneDrive/Documents/NetbeansProjects/Garage IT System/database/sqlite/db/Garage Database.db";

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
    public String addStaff(String firstName, String surname, String email, String password, String jobTitle) {
        System.out.println("1");
        try {
            pstm.close();
            rs.close();
            conn = DriverManager.getConnection(DatabaseURL);
               System.out.println("2");
            pstm = conn.prepareStatement("INSERT INTO staff(password, firstName, surname, email, jobTitle) VALUES (?,?,?,?,?)");
               System.out.println("3");
            pstm.setString(1, password);
            pstm.setString(2, firstName);
            pstm.setString(3, surname);
            pstm.setString(4, email);
            pstm.setString(5, jobTitle);
            System.out.println("");
            System.out.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
            pstm.execute();
             
            return "done";
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString(),  "SQL Exceptionzzzzzzzzzz", JOptionPane.WARNING_MESSAGE);
        }


        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeDBConnection() throws SQLException {

        System.out.print("The connection has been closedLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        System.out.print(conn.toString() + "\n" + pstm.toString() + "\n" + rs.toString());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
