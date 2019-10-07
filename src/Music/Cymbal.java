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
public class Cymbal extends Percussion{
    
    /**
     * constructor
     * pre: none
     * post: Cymbal Object has been created.
     * @param cymbalist 
     */
    public Cymbal(String cymbalist){
        super(cymbalist);
    }
    
    /** 
    * Returns the sound of the instrument.
    * pre: none
    * post: The sound made by the instrument is returned.
    */
    public String makeSound(){
        return("clang");
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
