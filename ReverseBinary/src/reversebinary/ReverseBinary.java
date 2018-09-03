/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversebinary;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class ReverseBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long data = input.nextLong();
        long solution = Long.parseLong(new StringBuilder(Long.toBinaryString(data)).reverse().toString(), 2);
        System.out.println(solution);
    }
    
}
