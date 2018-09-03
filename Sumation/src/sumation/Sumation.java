/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Sumation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int numCycles = Integer.parseInt(input.readLine());
        
        for(int i = 1; i <= numCycles; i++)
        {
            String data = input.readLine();
            String[] datum = data.split(" ");
            
            long val = Long.parseLong(datum[1]);
            
            long gaussSum = (val * (val + 1)) / 2;
            
            long oddSum = val * val;
            
            System.out.println(datum[0] + " " + gaussSum + " " + oddSum + " " + (gaussSum * 2));
        }
    }
    
}
