/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spavanac;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Spavanac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int h = input.nextInt();
        int m = input.nextInt();
        
        if(m < 45)
        {
            if(h == 0)
                h = 23;
            else
                h--;
            m = 60 - 45 + m;
        } else
        {
            m = m - 45;
        }
        
        System.out.println(h + " " + m);
    }
    
}
