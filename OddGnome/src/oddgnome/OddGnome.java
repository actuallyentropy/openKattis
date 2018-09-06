package oddgnome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddGnome 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int currCase = 0; currCase < numCases; currCase++)
        {
            String[] data = input.readLine().split(" ");
            int numGnomes = Integer.parseInt(data[0]);
            
            for(int i = 2; i < numGnomes; i++)
            {
                if(Integer.parseInt(data[i]) != Integer.parseInt(data[i-1]) + 1)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
