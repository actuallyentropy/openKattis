/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Bela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] setup = input.readLine().split(" ");
        
        int numCards = 4 * Integer.parseInt(setup[0]);
        char domSuit = setup[1].charAt(0);
        
        int total = 0;
        
        for(int i = 0; i < numCards; i++)
        {
            String nextCard = input.readLine();
            
            if(nextCard.charAt(1) == domSuit)
            {
                switch(nextCard.charAt(0))
                {
                    case 'A': total += 11;
                    break;
                    case 'K': total += 4;
                    break;
                    case 'Q': total += 3;
                    break;
                    case 'J': total += 20;
                    break;
                    case 'T': total += 10;
                    break;
                    case '9': total += 14;
                    break;
                    default: total += 0;
                    break;
                }
            }else
            {
                switch(nextCard.charAt(0))
                {
                    case 'A': total += 11;
                    break;
                    case 'K': total += 4;
                    break;
                    case 'Q': total += 3;
                    break;
                    case 'J': total += 2;
                    break;
                    case 'T': total += 10;
                    break;
                    default: total += 0;
                    break;
                }
            }
        }
        
        System.out.println(total);
    }
}
