/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nastyhacks;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class NastyHacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numCycles = input.nextInt();
        
        for(int i = 0; i < numCycles; i++)
        {
            int nonAd = input.nextInt();
            int ad = input.nextInt();
            ad -= input.nextInt();
            
            if(nonAd == ad)
            {
                System.out.println("does not matter");
            }else if(nonAd > ad)
            {
                System.out.println("do not advertise");
            }else
            {
                System.out.println("advertise");
            }
        }
    }
    
}
