
/**
 * Mr. Hayes
 * 8/23/22
 * Notes for Ch 1
 * Write a description where we are going to take some code notes
 * Who helped me: Mr. Hayes, Mom, Dog, 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.*; //imports entire text package

public class chapter1Notes
{
    /**
     * main method
     * where we are going to code
     */
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        //these are the basic data types
        int x=9,y,z;
        double num = 5, num1 = 23.4, num2;
        char letter = 'd';
        boolean choice = false;
        float anum = 7;
        long a = 9;
        short b = 5;
        
        //Formatters
        DecimalFormat fmt = new DecimalFormat("0.###"); //This will not add an extra 0
        DecimalFormat fmt2 = new DecimalFormat("0.00"); //00 vs ##, this will add an extra 0
  
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        
        System.out.println("Sub Total:" + fmt.format(num1));
        System.out.println("Sub Total:" + fmt2.format(num1));
        System.out.println("Sub Total:" + money.format(num1));
        System.out.println("Sub Total:" + percent.format(num1));      
        
        //These are objects!
        //class     identifier     memory    constructor   
        String      word =          new      String("Kevin Hayes");
        Integer number = new Integer(47);
        Double number2 = new Double(34.5);
        
        String word1 = new String("Homer Simpson");
        String word2 = new String("Homer Simpson");
        String word3 = new String("Bart Simpson");
        String name = new String("Mike");
        String name2 = new String("Mikers Johnson");
        String last = "Hayes";


        int id = 590342;
        int id2 = 1923;
        System.out.printf("Name:  %-15s \t ID: %-7d \n", name,id);
        System.out.printf("Name:  %-15s \t ID: %-7d \n", name2,id2);
        System.out.println( 'a' + 100 ); // A char an an integer are the same thing; 
    
        System.out.println('a'   );
        System.out.println("A"+100  );
        
        
        // Calculate: workMiles = work days * one-way-distance * 2
        // Calculate: milesTravelled = ending miles - beginning miles
        // Calculate: workFraction = workMiles / milesTravelled
        // Calculate: personalFraction = 1 - workFraction
        
    }
}
