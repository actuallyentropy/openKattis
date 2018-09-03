/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdifferences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class StringDifferences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int numCycles = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCycles; i++)
        {
            String firstString = input.readLine();
            String secondString = input.readLine();
            
            System.out.println(firstString);
            System.out.println(secondString);
            
            String solution = "";
            
            for(int j = 0; j < firstString.length(); j++)
            {
                if(firstString.charAt(j) != secondString.charAt(j))
                {
                    solution+= '*';
                }else
                {
                    solution += ".";
                }
            }
            System.out.println(solution);
        }
    }
    
}
