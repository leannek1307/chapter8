/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

/**
 *
 * @author leannekim
 */
abstract class Percussion extends Instrument {
     
    /**
     * constructor
     * pre: none
     * post: Percussion object has been created.
     * @param player 
     */
    public Percussion (String player){
         super(player);
     }
     
    /** 
    * Returns the sound of the instrument.
    * pre: none
    * post: The sound made by the instrument is returned.
    */
     public String makeSound(){
         return("bang");
     
     }
}
