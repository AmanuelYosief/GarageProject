/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author amanuel
 */
public class Staff {
    String staffId;
    String firstName;
    String surname;
    String email;
    String jobTitle;

    public Staff(String staffId, String firstName, String surname, String email, String jobTitle) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.jobTitle = jobTitle;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }    
}
