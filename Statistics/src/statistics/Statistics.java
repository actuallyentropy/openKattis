package statistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int caseNumber = 1;
        
        while(true)
        {
            String raw = input.readLine();
            
            if(raw == null)
                break;
            
            String[] data = raw.split(" ");
            
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for(int i = 1; i <= Integer.parseInt(data[0]); i++)
            {
                int curr = Integer.parseInt(data[i]);
                
                if(curr > max)
                    max = curr;
                if(curr < min)
                    min = curr;
            }
            
            System.out.println("Case " + caseNumber + ": " + min + " " + max + " " + (max - min));
            caseNumber++;
        }
    }
}
