
/**
 * Adeline Tse
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.*;
public class full_name
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your full name?");
        System.out.print("Enter 2 words: ");
        
        keyboard.nextLine();
        
        String first_name = keyboard.nextLine();
        first_name = keyboard.next();
        keyboard.next();
        String middle_name = keyboard.next();
        keyboard.next();
        String last_name = keyboard.next();
        
        char middle_intial = middle_name.charAt(0);
        
        System.out.printf(first_name+ middle_intial + "/n" );
    }
}
