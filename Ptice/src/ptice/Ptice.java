/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Ptice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input.readLine();
        String key = input.readLine();
        
        char[] adrianKey = {'A', 'B', 'C'};
        char[] brunoKey = {'B', 'A', 'B', 'C'};
        char[] goranKey = {'C', 'C', 'A', 'A', 'B', 'B'};
        
        int[] good = new int[3];
        
        for(int i = 0; i < key.length(); i++)
        {
            if(key.charAt(i) == adrianKey[i % 3])
            {
                good[0]++;
            }
            
            if(key.charAt(i) == brunoKey[i % 4])
            {
                good[1]++;
            }
            
            if(key.charAt(i) == goranKey[i % 6])
            {
                good[2]++;
            }
        }
        
        int max = 0;
        for(int i = 0; i < 3; i++)
        {
            if(good[i] > max)
                max = good[i];
        }
        
        System.out.println(max);
        
        if(good[0] == max)
        {
            System.out.println("Adrian");
        }
        
        if(good[1] == max)
        {
            System.out.println("Bruno");
        }
        
        if(good[2] == max)
        {
            System.out.println("Goran");
        }
    }
    
}
