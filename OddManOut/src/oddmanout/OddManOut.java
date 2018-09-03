/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddmanout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Lexie
 */
public class OddManOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            input.readLine();
            Vector<String> nums = new Vector<>(Arrays.asList(input.readLine().split(" ")));
            Collections.sort(nums);
                                    
            for(int j = 0; j < nums.size() - 1; j++)
            {
                if(nums.get(j).equals(nums.get(j+1)))
                {
                    nums.remove(j);
                    nums.remove(j);
                    j--;
                }
            }
            
            System.out.println("Case #" + (i + 1) + ": " + nums.get(0));
        }
    }
    
}
