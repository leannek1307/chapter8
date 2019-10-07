/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author leannekim
 */
public class PersonalAcct extends Account{
    
    private double MIN = 100;
    
    public PersonalAcct(double bal){
        super(bal);
    }
    
    public void withdrawal(double amt){
        double balance = getBalance();
        
        if (amt <= balance){
            super.withdrawal(amt);
            if (getBalance() < MIN){
                System.out.println("Less than $100 left in account.");
                super.withdrawal(2);
            }
        }else {
            System.out.println("Not enough money in account.");
        }
    }
    
    public String toString(){
        String persAcctString;
        
        persAcctString = "The balance is: " + super.getBalance();
        
        return persAcctString;
    }
}
