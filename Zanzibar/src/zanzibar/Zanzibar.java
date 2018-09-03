/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zanzibar;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Zanzibar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);        
        int numCases = input.nextInt();
        
        for(int i = 0; i< numCases; i++)
        {
            int total = 0;
            int last = 1;

            while(true)
            {
                int curr = input.nextInt();
                
                if(curr == 0)
                    break;
                
                if(curr > last * 2)
                {
                    total += curr - (last * 2);
                }
                
                last = curr;
            }
            
            System.out.println(total);
        }
    }
    
}
