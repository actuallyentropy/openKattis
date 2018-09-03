/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int numCases = input.nextInt();
       
       for(int curr = 0; curr < numCases; curr++)
       {
           int min = 999;
           int max = 0;
           int total = 0;
           
           int numStops = input.nextInt();
           
           for(int i = 0; i < numStops; i++)
           {
               int stop = input.nextInt();
               total += stop;
               
               if(stop < min)
               {
                   min = stop;
               }
               
               if(stop > max)
               {
                   max = stop;
               }
           }
           
           int spot = total / numStops;
           int ans = ((max - spot) * 2) + ((spot - min) *2);
           System.out.println(ans);
       }
    }
    
}
