 
/**
 * Adeline Tse
 * 9/5/22
 * Program name: Full name
 * Ask user for their full name, and then index and format it
 */
import java.util.Scanner;
import java.text.*;
public class full_name
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your full name?");
        System.out.println("Enter 3 words: ");

        String name = keyboard.nextLine();
        int endOfFirstname = name.indexOf(" ");
        String firstname = name.substring(0, endOfFirstname);
        
        //Indexing the middle name and last name and assigning them variables 
        int endOfMiddlename = name.indexOf(" ", (endOfFirstname + 1));
        String middlename = name.substring((endOfFirstname + 1), endOfMiddlename);
        String lastname = name.substring((endOfMiddlename + 1), name.length());
        
        
        //Index middle initial to be the only character
        String middleInitial = "" + middlename.charAt(0);
        
        //Output name
        System.out.print(firstname+ " " + middleInitial.toUpperCase() + "." + "\n" + lastname);
    }
}
