package otherparking;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OtherParking 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int[] costs = new int[3];
        
        costs[0] = input.nextInt();
        costs[1] = input.nextInt();
        costs[2] = input.nextInt();
        
        Integer[] arrivals = new Integer[3];
        Integer[] departure = new Integer[3];
        
        for(int i = 0; i < 3; i++)
        {
            arrivals[i] = input.nextInt();
            departure[i] = input.nextInt();
        }
        
        int total = 0;
        int currentTrucks = 0;
        
        int time = Collections.max(Arrays.asList(departure));
        
        for(int i = 1; i <= time; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(arrivals[j] == i)
                    currentTrucks++;
            }
            
            for(int j = 0; j < 3; j++)
            {
                if(departure[j] == i)
                    currentTrucks--;
            }
            
            if(currentTrucks != 0)
                total += costs[currentTrucks - 1] * currentTrucks;
        }
        
        System.out.println(total);
    }
}
