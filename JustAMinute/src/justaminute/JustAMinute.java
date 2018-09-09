package justaminute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JustAMinute 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine());
        double totalSeconds = 0;
        double sLSeconds = 0;
        
        for(int i = 0; i < n; i++)
        {
            String[] rawData = input.readLine().split(" ");
            
            totalSeconds += Double.parseDouble(rawData[0]) * 60;
            sLSeconds += Double.parseDouble(rawData[1]);
        }
        
        double total = sLSeconds / totalSeconds;
        
        if(total <= 1)
            System.out.println("measurement error");
        else
            System.out.println(total);
    }
}
