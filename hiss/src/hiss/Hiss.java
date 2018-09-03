/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Hiss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String inString = input.readLine();
        
        for(int i = 0; i < inString.length() - 1; i++)
        {
            if(inString.charAt(i) == 's' && inString.charAt(i+1) == 's')
            {
                System.out.println("hiss"); 
                return;
            }
        }
        
        System.out.println("no hiss");
    }
    
}
