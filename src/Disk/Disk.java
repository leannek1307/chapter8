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
public class Disk implements Comparable{
    private static final double PI = 3.14;
    private double radius, thickness;
    
    public Disk(){
        radius = 1;     // default radius
        thickness = 1;  // default thickness
    }
    
    public Disk(double r, double t){
        radius = r;
        thickness = t;
    }
    
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
    public void setThickness(double newThickness){
        thickness = newThickness;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getThickness(){
        return thickness;
    }
    
    public int compareTo(Object obj){
        Disk testCircle = (Disk)obj;
        
        if (radius == testCircle.getRadius() && thickness == testCircle.getThickness()){
            return (0);
        } else if (radius < testCircle.getRadius() && thickness < testCircle.getThickness()){
            return(-1);
        } else{
            return(1);
        }
    }
    
    public String toString(){
        return "Circle has radius " + radius + " and thickness " + thickness;
    }
}
