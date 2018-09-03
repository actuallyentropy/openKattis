/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartrate;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class HeartRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numCases = input.nextInt();
        
        for(int curr = 0; curr < numCases; curr++)
        {
            int numBeats = input.nextInt();
            double seconds = input.nextDouble();
            
            double time = 60 / seconds;
            double actual = numBeats * time;
            
            System.out.println((actual - time) + " " + actual + " " + (actual + time));
        }
    }
    
}
