/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarifa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Tarifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int megs = Integer.parseInt(input.readLine());
        int numLines = Integer.parseInt(input.readLine());
        
        int current = 0;
        
        for(int i = 0; i < numLines; i++)
        {
            current += megs;
            current -= Integer.parseInt(input.readLine());
        }
        
        System.out.println(current + megs);
    }
    
}
