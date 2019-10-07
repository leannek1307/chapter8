package Puck;

/**
 * Disk class.
 */
public class Disk extends Circle {
//	Since this "child" class is inherited by the "parent" class, it can use all member variables and methods of the "parent" class without separately declaring it.
//      However, members with access level "private" of the "parent" class can be inherited by "child" class, but CANNOT access.
    
        private double thickness;
		
	/**
	 * constructor
	 * pre: none
	 * post: A Disk object has been created with radius r
	 * and thickness t.
	 */
        
//      parent class로부터 상속받은 member variable의 access level이 private일 경우 parent class의 constructor를 호출해서 reset 시킨다.
	public Disk(double r, double t) {
		super(r);
		thickness = t;
	}


	/** 
	 * Changes the thickness of the disc.
	 * pre: none
	 * post: Thickness has been changed.
	 */
	public void setThickness(double newThickness) {
	 	thickness = newThickness;
	}


	/** 
	 * Returns the thickness of the disc.
	 * pre: none
	 * post: The thickness of the disc has been returned.
	 */
	public double getThickness() {
	 	return(thickness);
	}
	
	
	/**
	 * Returns the volume of the disc.
	 * pre: none
	 * post: The volume of the disc has been returned.
	 */
	public double volume() {
		double v;
		
		v = super.area() * thickness;
		return(v);
	}

	
	/** 
	 * Determines if the object is equal to another
	 * Disk object.
	 * pre: none
	 * post: true has been returned if the objects have 
	 * the same radii and thickness. false has 
	 * been returned otherwise.
	 */
	public boolean equals(Object obj) {
		Disk testObj = (Disk)obj;
		
	 	if (testObj.getRadius() == super.getRadius() && 
                    testObj.getThickness() == thickness) {
                    return(true);
		} else {
                    return(false);
		}
	}


	/** 
	 * Returns a String that represents the Disk object.
	 * pre: none
	 * post: A string representing the Disk object has 
	 * been returned.
	 */
	public String toString() {
		String diskString;
// If the inherited member variable from the parent class is private, you cannot access it.
// Therefore, use the GETTER method.
		diskString = "The disk has radius " + getRadius() +
					 " and thickness " + thickness + ".";
	 	return(diskString);
	}
}