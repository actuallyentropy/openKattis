/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stararrangements;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class StarArrangements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int toFind = input.nextInt();
        
        System.out.println(toFind + ":");
        
        for(int i = 2; i <= (toFind / 2) + 1; i++)
        {
            if(toFind % ((i*2) - 1) == 0 || (((i*2) -1) * (toFind / ((i*2) - 1))) + i == toFind)
            {
                System.out.println(i + "," + (i - 1));
            }
            
            if(toFind % i == 0)
            {
                System.out.println(i + "," + i);
            }
        }
    }
    
}
