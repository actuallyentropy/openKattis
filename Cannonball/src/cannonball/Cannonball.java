/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cannonball;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Cannonball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numCases = input.nextInt();
        
        for(int i = 0; i < numCases; i++)
        {
            double vel = input.nextDouble();
            double angle = input.nextDouble();
            double x = input.nextDouble();
            double lowerLimit = input.nextDouble();
            double upperLimit = input.nextDouble();
            
            double time = Math.cos(Math.toRadians(angle)) * vel;
            time = x / time;
            
            
            double position = (vel * time * (Math.sin(Math.toRadians(angle)))) - (0.5 * 9.81 * (time * time));
                        
            if(position >= lowerLimit+1 && position <= upperLimit-1)
            {
                System.out.println("Safe");
            }else
            {
                System.out.println("Not Safe");
            }
        }
    }
    
}
