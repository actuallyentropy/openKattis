
package circlearea;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class CircleArea 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            double radius = input.nextDouble();
            int pointsMade = input.nextInt();
            int pointsLanded = input.nextInt();
            
            if(radius == 0 && pointsMade == 0 && pointsLanded == 0)
            {
                break;
            }
            
            double actual = (radius * radius) * Math.PI;
            double estimate = (double)pointsLanded / (double)pointsMade;
            estimate = ((radius * 2) * (radius * 2)) * estimate;
                    
            System.out.println(actual + " " + estimate);
        }
    }
    
}
