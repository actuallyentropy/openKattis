/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Trik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String inLine = input.readLine();
        boolean[] balls = new boolean[]{true, false, false};
        
        for(int i = 0; i < inLine.length(); i++)
        {
            switch (inLine.charAt(i)) {
                case 'A':
                    {
                        boolean temp = balls[0];
                        balls[0] = balls[1];
                        balls[1] = temp;
                        break;
                    }
                case 'B':
                    {
                        boolean temp = balls[1];
                        balls[1] = balls[2];
                        balls[2] = temp;
                        break;
                    }
                default:
                    {
                        boolean temp = balls[0];
                        balls[0] = balls[2];
                        balls[2] = temp;
                        break;
                    }
            }
        }
        
        for(int i = 0; i < 3; i++)
        {
            if(balls[i])
            {
                System.out.println(i+1);
                return;
            }
        }
    }
    
}
