package jewelrybox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JewelryBox 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            String[] data = input.readLine().split(" ");
            
            double A = 12;
            double B = (-4 * Double.parseDouble(data[0])) + (-4 * Double.parseDouble(data[1]));
            double C = Double.parseDouble(data[0]) * Integer.parseInt(data[1]);
                        
            double h = ((B * -1) - Math.sqrt((B * B) - (4 * A * C))) / (2 * A);                      
            
            double solution = (Double.parseDouble(data[0]) - (2 * h)) * (Double.parseDouble(data[1]) - (2 * h)) * h;
            
            System.out.println(solution);
        }
    }
}
