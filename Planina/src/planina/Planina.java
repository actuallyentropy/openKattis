/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planina;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Planina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);        
        int numCycles = input.nextInt();
        
        long length = 2;
        
        for(int i = 0; i < numCycles; i++)
        {
            length += length - 1;
        }
        
        long points = length * length; 
        
        System.out.println(points);
    }
    
}
