
/**
 * Write a description of class sphereV_nSA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;                                                                        
public class sphereV_nSA
{
    public static void main (String[] args){
    
        double volume, surface_area;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("radius of sphere: ");
        double radius = keyboard.nextDouble();
        volume = (Math.pow(radius, 3)) * (4/3) * Math.PI;
        surface_area = (Math.pow(radius, 2)) * (4/3) * Math.PI;
        DecimalFormat fmt = new DecimalFormat ("0.####");
        
        System.out.println("volume: " + fmt.format(volume));
        System.out.println("surface area: " + fmt.format(surface_area));
        
        
    }
}
