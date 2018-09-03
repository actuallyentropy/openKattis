/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicecup;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class DiceCup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int firstDie = input.nextInt();
        int secondDie = input.nextInt();
        
        int smallest;
        int largest;
        
        if(firstDie > secondDie)
        {
            largest = firstDie;
            smallest = secondDie;
        }
        else
        {
            largest = secondDie;
            smallest = firstDie;
        }
        
        for(int i = smallest+1; i <= largest+1; i++)
        {
            System.out.println(i);
        }
    }
    
}
