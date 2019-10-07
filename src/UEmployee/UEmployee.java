/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UEmployee;

import java.text.NumberFormat;

/**
 *
 * @author leannekim
 */ 

// inherits faculty and staff
// return employee name and salary

public class UEmployee {
   
    private String employee;
    private double salary;
    
    /**
     * constructor
     * pre: none
     * post: UEmployee object has been created.
     * @param employee
     * @param salary 
     */
    public UEmployee(String employee, double salary){
        this.employee = employee;
        this.salary = salary;
    }

    /**
     * Return employee
     * pre: none
     * post: employee has been returned.
     * @return 
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Return salary
     * pre: none
     * post: salary has been returned.
     * @return 
     */
    public String getSalary() {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        return money.format(salary);
    }
 
    /**
     * Return toString
     * pre: none
     * post: name and salary has been returned.
     * @return 
     */
    public String toString(){
        return "Name: " + employee + "\nSalary: " + salary;
    }
}
