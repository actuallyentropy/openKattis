/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batterup;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Batterup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numBats = input.nextInt();
        int modifiedBats = numBats;
        int total = 0;
        
        for(int i = 0; i < numBats; i++)
        {
            int val = input.nextInt();
            
            if(val > -1)
            {
                total += val;
            }else
            {
                modifiedBats--;
            }
        }
        
        double ans = (double)total / (double)modifiedBats;
        System.out.println(ans);
    }
    
}
