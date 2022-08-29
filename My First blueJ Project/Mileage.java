/**
 * Calculates how much mileage was used for work and personal use.
 * Emma Dram / Adeline Tse
 * 8/26/22
 */

import java.util.Scanner;
import java.text.*;

public class Mileage
{
    // variables
    private double distance;
    private int workDays;
    private double beginMile;
    private double endMile;
    private int time;


    /**Constructor for objects of class Mileage*/
    public static void main(String[] args)
    {
        // scanner object
        Scanner scanObj = new Scanner(System.in);
        // initialise instance variables
        double distance = 20;
        
        // gets values from user
        System.out.println("Work days: ");
        int workDays = scanObj.nextInt();
        System.out.println("\nBeginning mileage: ");
        double beginMile = scanObj.nextDouble();
        System.out.println("\nEnding mileage: ");
        double endMile = scanObj.nextDouble();
        
        // does calculations
        double totalMiles = endMile - beginMile;
        double workMiles = (workDays * distance) * 2;
        double personalMiles = (totalMiles - workMiles);
        double percentageWork = 100*(workMiles/totalMiles);
        double percentagePersonal = 100*(personalMiles/totalMiles);
        
        
        // displays values
        System.out.printf("%-15s %10s %n", "\nWork miles percentage:", percentageWork);
        System.out.printf("%-15s %10s %n", "Personal miles percentage:", percentagePersonal);
        
        
    }

}

