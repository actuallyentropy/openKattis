package egypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Egypt 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String[] data = input.readLine().split(" ");
            
            if(data[0].equals("0"))
                break;
            
            double[] lines = new double[3];
            
            lines[0] = Double.parseDouble(data[0]);
            lines[1] = Double.parseDouble(data[1]);
            lines[2] = Double.parseDouble(data[2]);
            Arrays.sort(lines);
            
            double angle = Math.acos(((lines[0] * lines[0]) + (lines[1] * lines[1]) - (lines[2] * lines[2])) / (2 * lines[0] * lines[1]));
            
            if(Math.toDegrees(angle) == 90)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
