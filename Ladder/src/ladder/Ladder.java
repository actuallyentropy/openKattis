/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladder;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Ladder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int opp = input.nextInt();
        double angle = input.nextDouble();     
        double radians = Math.toRadians(angle);
        double solution = opp / Math.sin(radians);
        System.out.println((int)Math.ceil(solution));
    } 
}
