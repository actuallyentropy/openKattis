/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Lexie
 */
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Vector<Integer> nums = new Vector<>();
        
        for(int i = 0; i < 10; i++)
        {
            nums.add(input.nextInt());
        }
        
        int total = 0;
        
        for(int i = 0; i < 10; i++)
        {
            boolean proceed = true;
            int curr = nums.get(i) % 42;
            
            
            for(int j = i-1; j >= 0; j--)
            {
                if(nums.get(j) % 42 == curr)
                    proceed = false;  
            }
            
            if(proceed)
                total++;
        }
        
        if(total == 0)
            total++;
        
        System.out.println(total);
    }
    
}
