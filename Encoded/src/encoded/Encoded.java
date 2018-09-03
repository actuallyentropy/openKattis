/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encoded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Encoded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCycles = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCycles; i++)
        {
            String data = input.readLine();
            int sectionSize = (int)Math.sqrt((double)data.length());
                  
            String decipher = "";
            
            for(int j = 0; j < data.length(); j++)
            {
                //you got the rotation direction wrong
                int offset = (j / sectionSize) + 1;
                int pos = ((j+1) * sectionSize) % data.length();
                pos -= offset;
                
                if(pos < 0)
                {
                    pos += data.length();
                }
                
                decipher += data.charAt(pos);
            }
            
            
            /*
            for(int j = sectionSize-1; j >= 0; j--)
            {
                for(int k = j; k < data.length(); k += sectionSize)
                {
                    decipher += data.charAt(k);
                }
            }
            */
            
            System.out.println(decipher);
        }
    }
    
}
