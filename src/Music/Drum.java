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
public class Drum extends Percussion{
    
    /**
     * constructor
     * pre: none
     * post: Drum object has been created.
     * @param drummer 
     */
    public Drum(String drummer){
        super(drummer);
    }
    
    /** 
    * Returns the sound of the instrument.
    * pre: none
    * post: The sound made by the instrument is returned.
    */
    public String makeSound(){
        return("boom");
    }
    
    /** 
    * Returns a String that represents the instrument.
    * pre: none
    * post: A string representing the instrument has 
    * been returned.
    */
    public String toString(){
        return (super.getMusician() + " plays " + makeSound() + ".");
    }
    
}
