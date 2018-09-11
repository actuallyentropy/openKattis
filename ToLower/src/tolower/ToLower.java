package tolower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToLower 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] problemCounts = input.readLine().split(" ");
        int numGood = 0;
        
        for(int i = 0; i < Integer.parseInt(problemCounts[0]); i++)
        {
            boolean passed = true;
            
            for(int j = 0; j < Integer.parseInt(problemCounts[1]); j++)
            {
                String data = input.readLine();
                
                for(int k = 1; k < data.length(); k++)
                {
                    if(Character.isUpperCase(data.charAt(k)))
                        passed = false;
                }
            }
            
            if(passed)
                numGood++;
        }
        
        System.out.println(numGood);
    }
}
