/**
 * Simulates a bank and its customers.
 * Lawrenceville Press
 * June 10, 2011
 */
package Account;
 /**
 * A bank where accounts can be opened and customers can
 * make transactions.
 */

 import java.util.Scanner;
 import java.text.NumberFormat;

 public class Main {

        
    public static void main(String[] args) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        PersonalAcct perAcct = new PersonalAcct(345);
        BusinessAcct busAcct = new BusinessAcct(575);

        double data;
        String bOrPChoice;

        System.out.print("(B)usiness or (P)ersonal?: ");
        bOrPChoice = input.nextLine();

        if (bOrPChoice.equalsIgnoreCase("B")){
            System.out.println(busAcct);
        } else {
            System.out.println(perAcct);
        }

        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();

        if (bOrPChoice.equalsIgnoreCase("B")){
            busAcct.withdrawal(data);
            System.out.println(busAcct.getBalance());

        } else {
            perAcct.withdrawal(data);
            System.out.println(perAcct.getBalance());
            }
    } 
}
