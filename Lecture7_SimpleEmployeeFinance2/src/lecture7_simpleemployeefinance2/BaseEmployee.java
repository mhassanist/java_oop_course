/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lecture7_simpleemployeefinance2;

/**
 *
 * @author MSAUDI
 */
public abstract class BaseEmployee {
    protected String name;
    protected String email;
    protected String phoneNumber;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public abstract String getEmployeeInfo();
    
    public abstract double calculateSalary();
}
