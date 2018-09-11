package toilet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toilet 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String sequence = input.readLine();
        
        char init = sequence.charAt(0);
        char[] states = {init, init};
        int[] swaps = {0, 0, 0};
               
        for(int i = 1; i < sequence.length(); i++)
        {
            if(sequence.charAt(i) == 'U')
            {
                if(states[0] == 'D')
                {
                    swaps[0]++;
                    states[0] = 'U';
                }
                
                if(states[1] == 'D')
                {
                    swaps[1] += 2;
                }else
                {
                    swaps[1]++;
                    states[1] = 'D';
                }
            }else
            {
                if(states[0] == 'D')
                {
                    swaps[0]++;
                    states[0] = 'U';
                }else
                {
                    swaps[0]+= 2;
                }
                
                if(states[1] == 'U')
                {
                    swaps[1]++;
                    states[1] = 'D';
                }
            }
            
            if(sequence.charAt(i) != sequence.charAt(i - 1))
                swaps[2]++;
        }
        
        System.out.println(swaps[0]);
        System.out.println(swaps[1]);
        System.out.println(swaps[2]);
    }
}
