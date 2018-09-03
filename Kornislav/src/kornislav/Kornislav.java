/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kornislav;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Kornislav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] steps = new int[4];
        
        for(int i = 0; i < 4; i++)
        {
            steps[i] = input.nextInt();
        }
        
        Arrays.sort(steps);
        long solution = steps[0] * steps[2];
        
        System.out.println(solution);
    }
    
}
