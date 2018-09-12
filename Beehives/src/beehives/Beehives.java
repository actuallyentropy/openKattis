package beehives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beehives 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String[] data = input.readLine().split(" ");
            
            if(data[0].equals("0.0") && data[1].equals("0"))
                break;
            
            double acceptableDistance = Double.parseDouble(data[0]);
            int numHives = Integer.parseInt(data[1]);
            double[] xCoords = new double[numHives], yCoords = new double[numHives];
            int sweet = numHives;
            
            for(int i = 0; i < numHives; i++)
            {
                String[] hive = input.readLine().split(" ");
                xCoords[i] = Double.parseDouble(hive[0]);
                yCoords[i] = Double.parseDouble(hive[1]);
            }
            
            for(int i = 0; i < numHives; i++)
            {
                for(int j = 0; j < numHives; j++)
                {
                    if(j != i)
                    {
                        double distance = Math.sqrt(Math.pow(xCoords[j] - xCoords[i], 2) + Math.pow(yCoords[j] - yCoords[i], 2));
                        if(distance <= acceptableDistance)
                        {
                            sweet--;
                            break;
                        }
                    }
                }
            }
            
            System.out.println((numHives - sweet) + " sour, " + sweet + " sweet");
        }
    }
}
