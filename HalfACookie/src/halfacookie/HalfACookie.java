package halfacookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalfACookie 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String raw = input.readLine();  
            
            if(raw == null)
                break;
            
            String[] data = raw.split(" ");
            
            double r = Double.parseDouble(data[0]);
            double x = Double.parseDouble(data[1]);
            double y = Double.parseDouble(data[2]);
            
            double distance = (Math.sqrt((x * x) + (y * y)));
            
            if(distance > r)
            {
                System.out.println("miss");
            }else
            {
                double chordAngle = Math.acos((distance / r)) * 2;
                double chordLength = Math.sqrt((r * r) - (distance * distance)) * 2;
                double perc = chordAngle / (Math.PI * 2);
                double baseArea = Math.PI * r * r;
                double segment = baseArea * perc;
                segment = segment - (0.5 * chordLength * distance);
                System.out.println((baseArea - segment) + " " + segment);
            }
        }
    }
}
