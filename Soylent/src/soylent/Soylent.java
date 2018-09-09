package soylent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soylent 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            int calories = Integer.parseInt(input.readLine());
            
            int needed = calories / 400;
            
            if(needed * 400 >= calories)
                System.out.println(needed);
            else
                System.out.println(needed+1);
        }
    }
}
