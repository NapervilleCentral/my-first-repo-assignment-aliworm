
/**
 * Write a description of class coins_in_jar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  //variables:
import java.util.Scanner;
import java.text.*;
public class coins_in_jar
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Quarters: ");
        double quarters = keyboard.nextDouble();
        
        System.out.print("Dimes: ");
        double dimes = keyboard.nextDouble();
        
        System.out.print("Nickels: ");
        double nickels = keyboard.nextDouble();
        
        System.out.print("Pennies: ");
        double pennies = keyboard.nextDouble();
        
        double quarters_in_dollars = quarters * 0.25;
        double dimes_in_dollars = dimes * 0.1;
        double nickels_in_dollars = nickels * 0.05;
        double pennies_in_dollars = pennies *0.01;
        
        double total_dollars = quarters_in_dollars + dimes_in_dollars + nickels_in_dollars + pennies_in_dollars;
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();
        String total_dollars_string = dollarFormat.format(total_dollars);
        System.out.println("Your total change in dollars is " + total_dollars_string);
    }
}
