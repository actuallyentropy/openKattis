package plantingtrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlantingTrees 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numTrees = Integer.parseInt(input.readLine());
       String[] rawTrees = input.readLine().split(" ");
       ArrayList<Integer> trees = new ArrayList<>();
       
       for(int i = 0; i < numTrees; i++)
       {
           trees.add(Integer.parseInt(rawTrees[i]));
       }
       
       Collections.sort(trees, Collections.reverseOrder());
       int numDays = 0;
       
       for(int i = 0; i < numTrees; i++)
       {
           int finalDay = (i + 1) + trees.get(i);
           
           if(finalDay > numDays)
           {
               numDays = finalDay; 
           }
       }
       
       numDays++;
       System.out.println(numDays);
    }
}
