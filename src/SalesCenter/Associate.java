package SalesCenter;
/**
 * Associate class.
 */
class Associate extends Employee {
	double hourlyPayRate;

	/**
	 * constructor
	 * pre: none
	 * post: An associate has been created.
	 */
	public Associate(String fName, String lName, double rate) {
		super(fName, lName);
		hourlyPayRate = rate;
	}
	
		
	/** 
	 * Returns the associate pay rate.
	 * pre: none
	 * post: The associate pay rate has been returned.
	 */
	public double getRate() {
		return(hourlyPayRate);
	}


	/** 
	 * Returns the associate pay for the hours worked.
	 * pre: none
	 * post: The associate pay for the hours worked has been returned.
         * @param hours
         * @return 
	 */
	public double pay(double hours) {
		double payEarned;
		
		payEarned = hourlyPayRate * hours;
		return(payEarned);
	}
	
        
        /**
         * Returns the associate pay for the hours work including the over work pay.
         * pre: none
         * post: The associate pay for the hours worked including the overwork pay has been returned.
         * @param hours
         * @return 
         */
        public double payMore(double hours){
                double payEarned;

                payEarned = hourlyPayRate * hours + (hours - 40) * hourlyPayRate * 1.5;
                return payEarned;
        }	
	/** 
	 * Returns the employee name and title.
	 * pre: none
	 * post: The employee name and title has been returned.
	 */
	public String toString() {
		return(super.toString() + ", associate");
	}	
}