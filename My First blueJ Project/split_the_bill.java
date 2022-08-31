
 //Emma Dram & Adeline Tse
 //8/30/22
/*You and a number of friends go to a luxury restaurant,
 * and when you ask for the bill you want to 
 * split the amount and the tip (20%) between all.
Write code for calculating
 the amount of money that everyone has to pay.
Your program should print the amount of the bill,
 the tip, the total cost and the amount each person has to pay.
It should also print how much of what 
each person pays is for the bill and for the tip.
 */
//who helped me:
import java.util.Scanner;
import java.text.*;
public class split_the_bill{
    public static void main(String[] args){
        Scanner keyboard  = new Scanner(System.in);
        
        System.out.print("Bill without tip: $");
        double bill = keyboard.nextDouble();
        System.out.print("People in the Party: ");
        int people = keyboard.nextInt();
        
        double cost_per_person = bill/ people;
        double tip_per_person = cost_per_person * 0.2;
        double bill_total = bill * 1.2;
        System.out.println("Bill before tip: $" + String.format("%.2f", bill));
        System.out.println("Bill after tip: $" + String.format("%.2f", bill_total));
        System.out.println("Tip per person: $" + String.format("%.2f",tip_per_person));
        System.out.println("Total cost per person(includes tip): $" +  String.format( "%.2f", (cost_per_person + tip_per_person)));
        
        
    }
}

