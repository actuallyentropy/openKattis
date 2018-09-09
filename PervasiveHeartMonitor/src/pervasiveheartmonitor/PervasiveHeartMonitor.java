package pervasiveheartmonitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PervasiveHeartMonitor 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String raw = input.readLine();
            
            if(raw == null)
                break;
            
            String[] parts = raw.split(" ");
            
            int startPoint = 0;
            int endPoint = 0;
            String name = "";
            int nameSegments = 0;
            double totalRate = 0;
            
            for(int i = 0; i < parts.length; i++)
            {
                if(parts[i].charAt(0) >= 'A' && parts[i].charAt(0) <= 'Z')
                {
                    name += parts[i] + " "; 
                    nameSegments++;
                }else
                {
                    totalRate += Double.parseDouble(parts[i]);
                }
            }
            
            System.out.println(((totalRate) / (parts.length - nameSegments)) + " " + name);
        }
    }
}
