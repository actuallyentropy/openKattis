/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodupe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class NoDupe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String unprocessed = input.readLine();
        
        String[] words = unprocessed.split(" ");
        
        for(int i = 0; i < words.length - 1; i++)
        {
            String word = words[i];
            
            for(int j = i + 1; j < words.length; j++)
            {
                if(words[j].equals(word))
                {
                    System.out.println("no");
                    return;
                }
            }
        }
        
        System.out.println("yes");
    }
    
}
