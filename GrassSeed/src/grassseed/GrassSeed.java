/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grassseed;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class GrassSeed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double cost = input.nextDouble();
        int numLawns = input.nextInt();
        
        double totalSpace = 0;
        
        for(int i = 0; i < numLawns; i++)
        {
            double width = input.nextDouble();
            double length = input.nextDouble();                      
            totalSpace += width * length;
        }
        
        double solution = totalSpace * cost;
        
        System.out.println(solution);
    }
    
}
