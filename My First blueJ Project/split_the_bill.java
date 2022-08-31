
 //Emma Dram & Adeline Tse
 //8/30/22
/*Write code for calculating total costs at a luxury restaurant (McDavid's).
 */
//who helped me: Alex
import java.util.Scanner;
import java.text.*;
public class split_the_bill{
    public static void main(String[] args){
        //create scanner object
        Scanner keyboard  = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        //gets information from user
        System.out.print("Thank you for dining at McDavid's! Please enter the following.");
        System.out.println("\nBill without tip: $");
        double bill = keyboard.nextDouble();
        System.out.print("People in the Party: ");
        int people = keyboard.nextInt();
        
        //does the calculations for all costs
        double cost_per_person = bill/ people;
        double tip_per_person = cost_per_person * 0.2;
        double bill_total = bill * 1.2;
        
        //displays information
        System.out.println("------------------------------");
        System.out.println("Thank you! Here are your costs:");
        System.out.println("Bill before tip: " + money.format( bill));
        System.out.println("Bill after tip: " + money.format(bill_total));
        System.out.println("Tip per person: " + money.format(tip_per_person));
        System.out.println("Cost per person without tip: " + money.format(cost_per_person));
        System.out.println("Total cost per person (includes tip):  " + money.format(cost_per_person + tip_per_person));
        
        
    }
}

