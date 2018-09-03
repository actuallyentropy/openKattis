/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conondrum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Conondrum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String data = input.readLine();
        int total = 0;
        
        for(int i = 0; i < data.length(); i+= 3)
        {
            if(data.charAt(i) != 'P')
                total++;
            if(data.charAt(i+1) != 'E')
                total++;
            if(data.charAt(i+2) != 'R')
                total++;
        }
        System.out.println(total);
    }
    
}
