/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r2;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class R2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int r = input.nextInt();
        int s = input.nextInt();
        
        int solution = (s * 2) - r;
        System.out.println(solution);
    }
    
}
