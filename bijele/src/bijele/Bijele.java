/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bijele;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Bijele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int val = input.nextInt();
        System.out.print((1 - val) + " ");
        val = input.nextInt();
        System.out.print((1 - val) + " ");
        val = input.nextInt();
        System.out.print((2 - val) + " ");
        val = input.nextInt();
        System.out.print((2 - val) + " ");
        val = input.nextInt();
        System.out.print((2 - val) + " ");
        val = input.nextInt();
        System.out.print((8 - val) + " ");
    }
    
}
