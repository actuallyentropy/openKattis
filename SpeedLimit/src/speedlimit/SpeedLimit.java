/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedlimit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class SpeedLimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String numTimes = input.readLine();
            if(numTimes.equals("-1"))
                break;
            
            int total = 0;
            int previous = 0;
            
            for(int i = 0; i < Integer.parseInt(numTimes); i++)
            {
                String[] data = input.readLine().split(" ");
                
                total += (Integer.parseInt(data[1]) - previous) * Integer.parseInt(data[0]);
                previous = Integer.parseInt(data[1]);
            }
            
            System.out.println(total + " miles");
        }
    }
    
}
