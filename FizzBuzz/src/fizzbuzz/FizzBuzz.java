/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            if(i % x == 0)
            {
                if(i % y == 0)
                {
                    System.out.println("FizzBuzz");
                }else
                {
                    System.out.println("Fizz");
                }
            }else if(i % y == 0)
            {
                System.out.println("Buzz");
            }else
            {
                System.out.println(i);
            }
        }
    }
    
}
