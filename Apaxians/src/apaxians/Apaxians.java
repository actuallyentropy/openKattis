/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apaxians;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Apaxians {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String name = input.readLine();
        String solution = "";
        char lastChar = ' ';
        
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) != lastChar)
            {
                lastChar = name.charAt(i);
                solution += lastChar;
            }
        }
        
        System.out.println(solution);
    }
    
}
