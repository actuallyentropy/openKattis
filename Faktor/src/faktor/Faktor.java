/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktor;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Faktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int i = input.nextInt();
        
        int solution = a * i;
        
        while(Math.ceil(((float)(solution) / (float)(a))) >= i)
        {
            solution--;
        }
        solution++;
        System.out.println(solution);
    }
    
}
