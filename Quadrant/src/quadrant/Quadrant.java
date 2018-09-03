/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrant;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Quadrant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        if(x > 0)
        {
            if(y > 0)
            {
                System.out.println("1");
            } else
            {
                System.out.println("4");
            }
        }else
        {
            if(y > 0)
            {
                System.out.println("2");
            }else
            {
                System.out.println("3");
            }
        }
    }
    
}
