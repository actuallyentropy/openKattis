package differentdistances;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferentDistances 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String[] data = input.readLine().split(" ");
            if(data.length == 1)
                break;
            
            double x1 = Double.parseDouble(data[0]);
            double y1 = Double.parseDouble(data[1]);
            double x2 = Double.parseDouble(data[2]);
            double y2 = Double.parseDouble(data[3]);
            double p = Double.parseDouble(data[4]);
            
            double result = Math.pow((Math.pow(Math.abs(x1 - x2), p)) + (Math.pow(Math.abs(y1 - y2), p)), (1 / p));
            System.out.println(result);
        }
    }
}
