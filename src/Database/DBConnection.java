/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author amanuel
 */
public interface DBConnection {
  
    void closeDBConnection() throws SQLException;
    ResultSet login(String login, String password) throws SQLException;
    boolean addStaff(String staffName, String role, String login,  String password);
    boolean deleteStaff(String login);
    boolean updateStaff(String name, String role, String login);
    ResultSet displayStaff() throws SQLException;
    public ResultSet searchStaff(String value) throws SQLException;
    
    
    
    boolean addCustomer(String name, String address, String postCode, String phoneNumber, String homeNumber);
    ResultSet displayCustomer() throws SQLException;       
    public ResultSet searchCustomer(String value) throws SQLException;
    boolean updateCustomer(String name, String address, String postCode, String phoneNumber, String homeNumber, String customerID);
}
