/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathknight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class DeathKnight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));       
        int numTests = Integer.parseInt(input.readLine());
        
        int totalWon = 0;
        
        for(int i = 0 ; i < numTests; i++)
        {
            String attacks = input.readLine();
            
            for(int j = 0; j < attacks.length() - 1; j++)
            {
                if(attacks.charAt(j) == 'C' && attacks.charAt(j+1) == 'D')
                {
                    totalWon--;
                    break;
                }
            }
            
            totalWon++;
        }
        
        System.out.println(totalWon);
    }
    
}
