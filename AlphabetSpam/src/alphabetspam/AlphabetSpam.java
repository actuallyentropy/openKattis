/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetspam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class AlphabetSpam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String data = input.readLine();
        
        int whitespace = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int symbols = 0;
        
        for(int i = 0; i < data.length(); i++)
        {
            char toTest = data.charAt(i);
            
            if(Character.isUpperCase(toTest))
            {
                upperCase++;
            } else if (Character.isLowerCase(toTest))
            {
                lowerCase++;
            } else if (toTest == '_')
            {
                whitespace++;
            }else
            {
                symbols++;
            }
        }
        
        double whitespaceRatio = whitespace / (double)data.length();
        System.out.println(whitespaceRatio);
        double lowerCaseRatio = lowerCase / (double)data.length();
        System.out.println(lowerCaseRatio);
        double upperCaseRatio = upperCase / (double)data.length();
        System.out.println(upperCaseRatio);
        double symbolRatio = symbols / (double)data.length();
        System.out.println(symbolRatio);
    }
    
}
