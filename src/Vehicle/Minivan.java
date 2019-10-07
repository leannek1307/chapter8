/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author leannekim
 */

// minivan class inherits vehicle.

public class Minivan extends Vehicle{
    /**
     * constructor
     * pre: none
     * post: Minivan object has been created.
     * @param n 
     */
    public Minivan (String n){
        super(n);
    }
    
    /**
     * Returns the number of doors of the vehicle.
     * pre: none
     * post: number of doors has been returned.
     * @param d
     * @return 
     */
    public int numDoor(int d){
        numDoor = d;
        return d;
    }
    
    /**
     * Returns the number of wheels of the vehicle.
     * pre: none
     * post: number of wheels has been returned.
     * @param w
     * @return 
     */
    public int numWheel(int w){
        numWheel = w;
        return w;
    }
    
    /**
     * Returns the number of seats of the vehicle.
     * pre: none
     * post: number of seats of has been returned.
     * @param s
     * @return 
     */
    public int numSeat(int s){
        numSeat = s;
        return s;
    }
    
    /**
      * Returns string.
      * pre: none
      * post: String has been returned.
      * @return 
      */
    public String toString(){
        return "Number of doors: " + numDoor + "\nNumber of wheels: " + numWheel + "\nNumber of seats: " + numSeat;
    }
}
