/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railroad;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Railroad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        if(y % 2 == 0)
        {
            System.out.println("possible");
        }else
        {
            System.out.println("impossible");
        }
    }
    
}
