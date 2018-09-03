/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everywhere;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author Lexie
 */
public class Everywhere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            Vector<String> cities = new Vector<>();
            int numCities = Integer.parseInt(input.readLine());
            
            for(int j = 0; j < numCities; j++)
            {
                String city = input.readLine();
                
                if(!cities.contains(city))
                {
                    cities.add(city);
                }
            }
            
            System.out.println(cities.size());
        }
    }
    
}
