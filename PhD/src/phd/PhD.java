/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class PhD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            String problem = input.readLine();
            if(problem.charAt(0) == 'P')
            {
                System.out.println("skipped");
            }else
            {
                String[] data = problem.split("\\+");
                System.out.println((Integer.parseInt(data[0]) + Integer.parseInt(data[1])));
            }
        }
    }
    
}
