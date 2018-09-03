/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Oddities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int numNums = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numNums; i++)
        {
            int num = Integer.parseInt(input.readLine());
            
            if(num % 2 == 0)
            {
                System.out.println(num + " is even");
            }else
            {
                System.out.println(num + " is odd");
            }
        }
    }
    
}
