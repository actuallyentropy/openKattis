/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beavergnaw;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Beavergnaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        
        while(true)
        {
            int diam = input.nextInt();
            int volRemoved = input.nextInt();
            
            if(diam == 0 && volRemoved == 0)
                break;
            
            double totalVol = Math.PI * Math.pow((double)diam / 2, 2) * diam;
            //System.out.println(totalVol);
            totalVol -= volRemoved;
            //System.out.println(totalVol);
            double cones = Math.PI * Math.pow((double)diam / 2, 2) * ((double)diam / 6);
            totalVol -= (cones * 2);
            //System.out.println(totalVol);
            totalVol = totalVol / Math.PI;
            totalVol = totalVol * 24;
            totalVol = totalVol / 4;
            double solution = Math.cbrt(totalVol);
            System.out.println(solution);
        }       
    }
    
}
