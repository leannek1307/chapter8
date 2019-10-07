/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userChoice; 
        
        Car c = new Car("Car");
        Truck t = new Truck("Truck");
        Minivan m = new Minivan("Minivan");
    
        System.out.println("(C)ar, (T)ruck, or (M)inivan?: ");
        userChoice = input.nextLine();
        
        if (userChoice.equalsIgnoreCase("C")){
            c.numDoor(4);           //pass number of doors through parameters
            c.numWheel(4);          // pass number of wheels through parameters
            c.numSeat(5);           // pass number of seats through parameters
            System.out.println(c);  // print toString
        } else if (userChoice.equalsIgnoreCase("T")){
            t.numDoor(2);
            t.numWheel(8);
            t.numSeat(2);
            System.out.println(t);
        } else if (userChoice.equalsIgnoreCase("M")){
            m.numDoor(4);
            m.numWheel(6);
            m.numSeat(6);
            System.out.println(m);
        } else{
            System.out.println("Invalid input.");
        }
    }
}
