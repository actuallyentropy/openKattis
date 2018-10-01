package mancala;

import java.util.ArrayList;
import java.util.Scanner;

public class Mancala 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        
        for(int currCase = 1; currCase <= numCases; currCase++)
        {
            input.nextInt(); 
            int numStones = input.nextInt();
            int stoneCount = 0;
            ArrayList<Integer> bins = new ArrayList<>();
            int index = 0;
            
            while(stoneCount < numStones)
            {
                if(!(index < bins.size()))
                {
                    bins.add(0);
                }
                
                if(bins.get(index) == 0)
                {
                    bins.set(index, index + 1);
                    stoneCount++;
                    
                    for(index--; index >= 0; index--)
                    {
                        bins.set(index, bins.get(index) - 1);
                    }
                }
                    index++;
            }
            
            System.out.println(currCase + " " + bins.size());
            
            for(int i = 0; i < bins.size(); i++)
            {
                System.out.print(bins.get(i) + " ");
                
                if((i + 1) % 10 == 0 && i != 0)
                    System.out.println("");
            }
            
            System.out.println("");
        }
    }
}
