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
public class BusinessAcct extends Account{
    
    private double MIN = 500;
    
    public BusinessAcct(double bal){
        super(bal);
    }
    
    public void withdrawal(double amt){
        double balance = getBalance();
        
        if (amt <= balance){
            super.withdrawal(amt);
            if (getBalance() < MIN){
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
