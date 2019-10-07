/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disk;

/**
 *
 * @author leannekim
 */
public class Main {
    public static void main(String[] args) {
        Disk spot1 = new Disk(3,5);
        Disk spot2 = new Disk(5,5);
        
        if(spot1.compareTo(spot2) == 0){
            System.out.println("Objects are equal.");
        } else if (spot1.compareTo(spot2) < 0){
            System.out.println("spot1 is smaller than spot2.");
        } else {
            System.out.println("spot1 is larger than spot2.");
        }
        
        System.out.println(spot1);
        System.out.println(spot2);
    }
}
