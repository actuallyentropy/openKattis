/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class NumberFun {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCycles = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCycles; i++)
        {
            String data = input.readLine();
            String[] numbers = data.split(" ");
            
            if(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) == Integer.parseInt(numbers[2]))
            {
                System.out.println("Possible");
            } else if(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]) == Integer.parseInt(numbers[2]))
            {
                System.out.println("Possible");
            } else if(Integer.parseInt(numbers[1]) - Integer.parseInt(numbers[0]) == Integer.parseInt(numbers[2]))
            {
                System.out.println("Possible");
            }else if(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]) == Integer.parseInt(numbers[2]))
            {
                System.out.println("Possible");
            } else if(Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]) == Double.parseDouble(numbers[2]))
            {
                System.out.println("Possible");
            }else if(Double.parseDouble(numbers[1]) / Double.parseDouble(numbers[0]) == Double.parseDouble(numbers[2]))
            {
                System.out.println("Possible");
            } else
            {
                System.out.println("Impossible");
            }
        }
    }
    
}
