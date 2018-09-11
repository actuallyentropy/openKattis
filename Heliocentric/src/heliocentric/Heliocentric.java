package heliocentric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Heliocentric 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 1; i <= 10; i++)
        {
            String line = input.readLine();
            
            if(line == null)
                break;
            
            String[] data = line.split(" ");
            
            int e = Integer.parseInt(data[0]);
            int m = Integer.parseInt(data[1]);
            int days = 0;
            
            while(e != 0 || m != 0)
            {
                days++;
                e = (e + 1) % 365;
                m = (m + 1) % 687;
            }
            
            System.out.println("Case " + i + ": " + days);
        }
    }
}
