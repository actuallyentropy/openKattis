/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Autori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();
        String acr = "" + name.charAt(0);
        
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) == '-')
                acr += name.charAt(i+1);
        }
        
        System.out.println(acr);
    }
    
}
