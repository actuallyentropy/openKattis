/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcawards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Lexie
 */
public class ICPCAwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Vector<String> winners = new Vector<>();
       
        int numLines = Integer.parseInt(input.readLine());
        
        int currentVictories = 0;
        
        for(int i = 0; i < numLines; i++)
        {
            if(currentVictories == 12)
                return;
            
            String temp = input.readLine();
                        
            String[] parts = temp.split(" ");
            
            if(!winners.contains(parts[0]))
            {
                System.out.println(temp);
                winners.add(parts[0]);
                currentVictories++;
            }
        }
    }
    
}
