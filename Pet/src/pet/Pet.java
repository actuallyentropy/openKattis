/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Pet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[5];
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                scores[i] += input.nextInt();
            }
        }
        
        int highest = 0;
        int highestIndex = 0;
        
        for(int i = 0; i < 5; i++)
        {
            if(scores[i] > highest)
            {
                highest = scores[i];
                highestIndex = i;
            }
        }
        
        System.out.println((highestIndex+1) + " " + highest);
    }
    
}
