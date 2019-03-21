package costumecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CostumeContest 
{
    public static void main(String[] args) throws IOException 
    {
       HashMap<String, Integer> entries = new HashMap<>();
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numEntries = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numEntries; i++)
       {
           String entry = input.readLine();
           
           if(entries.containsKey(entry))
           {
               entries.put(entry, entries.get(entry) + 1);
           }else
           {
               entries.put(entry, 1);
           }
       }
       
       int lowest = Integer.MAX_VALUE;
       
       for(Map.Entry entry : entries.entrySet())
       {
           if((int)entry.getValue() < lowest)
           {
               lowest = (int)entry.getValue();
           }
       }
       
       List<String> best = new ArrayList<>();
       
       for(Map.Entry entry : entries.entrySet())
       {
           if((int)entry.getValue() == lowest)
           {
               best.add((String)entry.getKey());
           }
       }
       
       Collections.sort(best);
       
       for(int i = 0; i < best.size(); i++)
       {
           System.out.println(best.get(i));
       }
    }
}
