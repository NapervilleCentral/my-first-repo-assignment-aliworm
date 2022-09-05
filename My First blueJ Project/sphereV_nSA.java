
/**
 * Name: Adeline Tse
 * 8/31
 * Program name: Sphere Volume and Surface Area
 * Find the surface area and volume of a sphere using radius from user input
*/
import java.util.Scanner;
import java.text.DecimalFormat;                                                                        
public class sphereV_nSA
{
    public static void main (String[] args){
    
        double volume, surface_area, circumference;
        
        //initiates scanner keyboard
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("radius of sphere: ");
        double radius = keyboard.nextDouble();
        
        //calculates volume
        volume = (Math.pow(radius, 3)) * (Math.PI)*(4/(double)3)  ;
        //calculate SA
        surface_area = (Math.pow(radius, 2)) * (4) * Math.PI;
        
        //calculate circumference
        circumference = 2* radius * Math.PI;
        
        DecimalFormat fmt = new DecimalFormat ("0.####");
        
        //displays data
        System.out.println("volume: " + fmt.format(volume));
        System.out.println("surface area: " + fmt.format(surface_area));
        System.out.println("circumference: " + fmt.format(circumference));
        
        
    }
}
