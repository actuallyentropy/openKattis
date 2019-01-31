package warehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Warehouse 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numCases = Integer.parseInt(input.readLine());
       
       for(int currCase = 0; currCase < numCases; currCase++)
       {
           HashMap<String, Integer> toyCounts = new HashMap<>();
           int numToys = Integer.parseInt(input.readLine());
           
           for(int i = 0; i < numToys; i++)
           {
               String[] toyData = input.readLine().split(" ");
               
               if(toyCounts.containsKey(toyData[0]))
                   toyCounts.put(toyData[0], toyCounts.get(toyData[0]) + Integer.parseInt(toyData[1]));
               else
                   toyCounts.put(toyData[0], Integer.parseInt(toyData[1]));
           }
           
           ArrayList<String> toyNames = new ArrayList<>();
           ArrayList<Integer> toyNumbers = new ArrayList<>();
           
           for(Map.Entry<String, Integer> entry : toyCounts.entrySet())
           {
               toyNames.add(entry.getKey());
               toyNumbers.add(entry.getValue());
           }
           
           for(int i = 0; i < toyNames.size() - 1; i++)
           {
               if(toyNumbers.get(i) == toyNumbers.get(i + 1))
               {
                   if(toyNames.get(i).compareTo(toyNames.get(i + 1)) > 0)
                   {
                       String tempName = toyNames.get(i);
                       int tempNum = toyNumbers.get(i);
                       
                       toyNames.set(i, toyNames.get(i + 1));
                       toyNumbers.set(i, toyNumbers.get(i + 1));
                       toyNames.set(i + 1, tempName);
                       toyNumbers.set(i + 1, tempNum);
                       i = -1;
                   }
               }else if(toyNumbers.get(i) < toyNumbers.get(i + 1))
               {
                   String tempName = toyNames.get(i);
                    int tempNum = toyNumbers.get(i);
                       
                    toyNames.set(i, toyNames.get(i + 1));
                    toyNumbers.set(i, toyNumbers.get(i + 1));
                    toyNames.set(i + 1, tempName);
                    toyNumbers.set(i + 1, tempNum);
                    i = -1;
               }
           }
           
           System.out.println(toyNames.size());
           
           for(int i = 0; i < toyNames.size(); i++)
           {
               System.out.println(toyNames.get(i) + " " + toyNumbers.get(i));
           }
       }
    }
}
