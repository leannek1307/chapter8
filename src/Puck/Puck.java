/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puck;

/**
 *
 * @author leannekim
 */
public class Puck extends Disk implements Comparable{
    private double minSWeight = 5;      // minimum standard weight
    private double maxSWeight = 5.5;
    private double minYWeight = 4;      // minimum youth weight
    private double maxYWeight = 4.5;
    private double weight;              // weight of the input puck
    private boolean standard, youth;
    
    /**
     * constructor
     * pre: none
     * post: Puck object is created. t for thickness, w for weight
     */
    public Puck(double t, double w){
        super(1.5,1); // diameter of 3, thickness of 1
        weight = w;
        
        if (weight >= minSWeight && weight <= maxSWeight){ // standard is true
            standard = true;
            youth = false;
        } else { // youth is true
            standard = false;
            youth = true;
        }
    }
    
    /**
     * Return weight of disk
     * pre: none
     * post: weight has been returned.
     * @return 
     */
    public double getWeight(){
        return (weight);
    }
    
    /**
     * Return division of puck
     * pre: none
     * post: return string stating if the puck is a standard or youth puck
     * @return 
     */
    public String getDivision(){
        String div;
        
        if (standard){
            div = "Standard";
        } else {
            div = "Youth";
        }
        return(div);
    }
    
    /**
     * Determines whether or not the two objects are equal.
     * pre: none
     * post: true has been returned if the objects have 
	 * the same radii and thickness. false has 
	 * been returned otherwise.
     * @param obj
     * @return 
     */
    public boolean equals(Object obj){
        Puck testObj = (Puck)obj;
        
        if (testObj.getDivision() == getDivision()){
            return (true);
        } else {
            return (false);
        }
    }
    
    /**
     * Return string that represents puck weight and division
     * pre: none
     * post: puckStr has been returned.
     * @return 
     */
    public String toString(){
        String puckStr;
        
        puckStr = "Puck weighs " + getWeight() + " and division is " + getDivision() + ".";
        return puckStr;
    }
    
    public int compareTo(Object obj){
        Puck testPuck = (Puck)obj;
        
        if (weight < testPuck.getWeight()){
            return (-1);
        } else if(weight == testPuck.getWeight()){
            return (0);
        } else { 
            return(1);
        }
    }
    
}
