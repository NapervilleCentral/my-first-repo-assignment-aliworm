
/**
 * Adeline Tse
 * 9/4/22
 * Program name: Random phone mumber
 * Generates a random phone number for the user
 */
import java.util.Random; 

public class random_phone
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        
        //generates the first three digits
        int first_digit = generator.nextInt(8);
        int second_digit = generator.nextInt(8);
        int third_digit = generator.nextInt(8);
        
        int second_set = generator.nextInt(643) + 100;
        int third_set = generator.nextInt(9000) + 1000;
        
        String first_digit_str = Integer.toString(first_digit);
        String second_digit_str = Integer.toString(second_digit);
        String third_digit_str = Integer.toString(third_digit);
        
        System.out.println(first_digit_str + second_digit_str + third_digit_str
        + "-" + second_set
        + "-" + third_set);
    }
}
