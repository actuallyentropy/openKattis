package carefulascent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarefulAscent 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] fireflyCoords = input.readLine().split(" ");
        int numShields = Integer.parseInt(input.readLine());
        
        int shieldDistance = 0;
        double totalDistance = 0;
        
        for(int i = 0; i < numShields; i++)
        {
            String[] shieldData = input.readLine().split(" ");
            shieldDistance += Integer.parseInt(shieldData[1]) - Integer.parseInt(shieldData[0]);
            totalDistance += (Integer.parseInt(shieldData[1]) - Integer.parseInt(shieldData[0])) * Double.parseDouble(shieldData[2]);
        }
        
        double solution = Double.parseDouble(fireflyCoords[0]) / (totalDistance + (Integer.parseInt(fireflyCoords[1]) - shieldDistance));
        System.out.println(solution);
    }
}
