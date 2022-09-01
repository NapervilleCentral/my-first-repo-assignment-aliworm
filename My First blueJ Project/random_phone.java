
/**
 * Write a description of class random_phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random; 

public class random_phone
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int first_digit = generator.nextInt(8);
        int second_digit = generator.nextInt(8);
        int third_digit = generator.nextInt(8);
        
        int second_set = generator.nextInt(900) + 100;
        int third_set = generator.nextInt(9000) + 1000;
        
        System.out.println(first_digit + second_digit + third_digit
        + "-" + second_set
        + "-" + third_set);
    }
}
