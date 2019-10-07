/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UEmployee;

/**
 *
 * @author leannekim
 */
public class Staff extends UEmployee{
    // include members for storing and returning the job title
    
    /**
     * constructor
     * pre: none
     * post: Staff object has been created.
     * @param jobTitle
     * @param salary 
     */
    public Staff(String jobTitle, double salary){
        super(jobTitle, salary);
    }
    
    /**
     * Return toString
     * pre: none 
     * post: toString has been returned.
     * @return 
     */
    public String toString(){
        return "Job Title: " + getEmployee();
    }
}
