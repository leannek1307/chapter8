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

// base class.

abstract class Vehicle {
    protected String carName;
    protected int numDoor;
    protected int numWheel;
    protected int numSeat;
    
    /**
     * constructor
     * pre: none
     * post: Vehicle object has been created.
     * @param n 
     */
    public Vehicle(String n){
        carName = n;
    }

    /**
     * Returns the number of doors of the vehicle.
     * pre: none
     * post: number of doors has been returned.
     * @param d
     * @return 
     */
    public abstract int numDoor(int d);
    
    /**
     * Returns the number of wheels of the vehicle.
     * pre: none
     * post: number of wheels has been returned.
     * @param w
     * @return 
     */
    public abstract int numWheel(int w);
    
    /**
     * Returns the number of seats of the vehicle.
     * pre: none
     * post: number of seats of has been returned.
     * @param s
     * @return 
     */
    public abstract int numSeat(int s);
    
    
}
