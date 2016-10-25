/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author universe
 */
public class CustomerTest {
    private int customerId;
    private String firstName;
    private String lastName;
    private String department;
    private String email;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static CustomerTest populateData(HttpServletRequest request, HttpServletResponse response)
    {
        CustomerTest c =new CustomerTest();
           c.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
           c.setFirstName(request.getParameter("firstName"));
           c.setLastName(request.getParameter("lastName"));
           c.setDepartment(request.getParameter("department"));
           c.setEmail(request.getParameter("email"));
           return c;
    }
}
