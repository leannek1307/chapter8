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
public class Faculty extends UEmployee{
    // include members for storing and returning the department name
    
    /**
     * constructor
     * pre: none
     * post: Faculty object has been created.
     * @param facultyName
     * @param salary 
     */
    public Faculty(String facultyName, double salary){
        super(facultyName, salary);
    }

    /**
     * Return toString
     * pre: none
     * post: toString has been returned.
     * @return 
     */
    public String toString(){
        return "Faculty: " + getEmployee();
    }
}
