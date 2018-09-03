/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmscoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Vector;

/**
 *
 * @author Lexie
 */
public class ACMScoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int time = 0;
        int totalRight = 0;
        int times[] = new int[24];
                     
        while(true)
        {
            String data = input.readLine();
            String[] results = data.split(" ");
            
            if(Integer.parseInt(results[0]) == -1)
            {
                break;
            }
            
            if(results[2].equals("right"))
            {
                totalRight++;
                char toSet = results[1].charAt(0);
                toSet -= 17;
                time += Integer.parseInt(results[0]) + (times[Integer.parseInt(Character.toString(toSet))]);
            }else
            {
                char toSet = results[1].charAt(0);
                toSet -= 17;
                times[Integer.parseInt(Character.toString(toSet))] += 20;
            }
        }
        
        System.out.println(totalRight + " " + time);
    }
}
