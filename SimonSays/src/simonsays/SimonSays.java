package simonsays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimonSays 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            String instruction = input.readLine();
            if(instruction.length() > 9)
            {
                if(instruction.substring(0,10).equals("Simon says"))
                {
                    System.out.println(instruction.substring(11));
                }
            }
        }
    }
}
