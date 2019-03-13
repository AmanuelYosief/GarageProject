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
    ResultSet login(String username, String password) throws SQLException;
    String addStaff(String staffID, String firstName, String lastName, String role, String password, String email);
    ResultSet displayAllStaff() throws SQLException;
    public ResultSet searchAllStaff(String value) throws SQLException;
       
}
