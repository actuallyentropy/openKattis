package vacuumba;

import java.util.Scanner;

public class Vacuumba 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int numCases = input.nextInt();
       
       for(int i = 0; i < numCases; i++)
       {
           int numInstructions = input.nextInt();
           
           double angle = 90;
           double x = 0;
           double y = 0;
           
           for(int j = 0; j < numInstructions; j++)
           {
               double rotationAngle = input.nextDouble();
               double distance = input.nextDouble();
               
               angle += rotationAngle;
               x = x + (distance * Math.cos(Math.toRadians(angle)));
               y = y + (distance * Math.sin(Math.toRadians(angle)));
           }
           
           System.out.println(x + " " + y);
       }
    }
}
