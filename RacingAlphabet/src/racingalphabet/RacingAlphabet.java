package racingalphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RacingAlphabet 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double circ = Math.PI * 60;
        double distance = circ / 28;
        
        String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
        int numCycles = Integer.parseInt(input.readLine());
        
        for(int currCycle = 0; currCycle < numCycles; currCycle++)
        {
            String aphorism = input.readLine();
            
            double total = 1;
            
            for(int i = 0; i < aphorism.length() - 1; i++)
            {
                int toCross = Math.abs((key.indexOf(aphorism.charAt(i))+ 1) - (key.indexOf(aphorism.charAt(i+1)) + 1));
                                
                if(toCross > 14)
                    toCross = 28 - toCross;
                
                total += (distance / 15) * toCross;
                total += 1;
            }
            
            System.out.println(total);
        }
    }
}
