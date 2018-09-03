/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevenwonders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class SevenWonders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));       
        String played = input.readLine();
        int[] vals = new int[3];
        
        for(int i = 0; i < played.length(); i++)
        {
            switch(played.charAt(i))
            {
                case 'T': vals[0]++;
                break;
                case 'C': vals[1]++;
                break;
                case 'G': vals[2]++;
                break;
            }
        }
        int lowest = 999;
        
        for(int i = 0; i < 3; i++)
        {
            if(vals[i] < lowest)
            {
                lowest = vals[i];
            }
        }
        
        int total = 0;
        
        total += (vals[0] * vals[0]) + (vals[1] * vals[1]) + (vals[2] * vals[2]);
        if(lowest != 0)
        {
            total += 7 * lowest;
        }
        
        System.out.println(total);
    }
    
}
