/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judgingmoose;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class JudgingMoose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        
        if(left == right)
        {
            if(left == 0)
                System.out.println("Not a moose");
            else
              System.out.println("Even " + (left * 2));
        }else
        {
            if(left > right)
            {
                System.out.println("Odd " + (left * 2));
            }else
            {
                System.out.println("Odd " + (right * 2));
            }
        }
    }
    
}
