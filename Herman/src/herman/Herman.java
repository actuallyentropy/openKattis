/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herman;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Herman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        
        double standardArea = Math.PI * radius * radius;
        System.out.println(standardArea);
        
        double taxicabArea = (double)2 * radius * radius;
        System.out.println(taxicabArea);
    }
    
}
