package SalesCenter;
/**
 * Manager class.
 */
class Manager extends Employee {
	double yearlySalary;

	/**
	 * constructor
	 * pre: none
	 * post: A manager has been created.
	 */
	public Manager(String fName, String lName, double sal) {
		super(fName, lName);
		yearlySalary = sal;
	}
	
		
	/**
	 * Returns the manager salary.
	 * pre: none
	 * post: The manager salary has been returned.
	 */
	public double getSalary() {
		return(yearlySalary);
	}


	/**
	 * Returns the manager pay for a specified period.
	 * pre: none
	 * post: The manager pay for the specified period 
	 * has been returned.
	 */
	public double pay(double weeks) {
		double payEarned;
		
		payEarned = (yearlySalary / 52) * weeks;
		return(payEarned);
	}
	
        /**
         * Returns the manager pay for the hours work.
         * pre: none
         * post: The manager pay for the hours worked has been returned.
         * @param weeks
         * @return 
         */
	public double payMore(double weeks){
            double payEarned;
            
            payEarned = yearlySalary / 52 * weeks;
            return (payEarned);
        }
        
	/** 
	 * Returns the employee name and title.
	 * pre: none
	 * post: The employee name and title has been returned.
	 */
	public String toString() {
		return(super.toString() + ", manager");
	}
}