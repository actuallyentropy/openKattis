package ceiling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ceiling 
{
    public static void main(String[] args) throws IOException 
    {
        ArrayList<HashMap<Integer, Integer>> trees = new ArrayList<>();
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] initial = input.readLine().split(" ");
        int numPrototypes = Integer.parseInt(initial[0]);
        int numNodes = Integer.parseInt(initial[1]);
        int total = 1;
        
        for(int i = 0; i < numPrototypes; i++)
        {
            trees.add(new HashMap<>());
            
            String[] nodes = input.readLine().split(" ");
            trees.get(i).put(0, Integer.parseInt(nodes[0]));
            
            for(int j = 1; j < numNodes; j++)
            {
                int index = 0;
                int currentNumber = Integer.parseInt(nodes[j]);
                
                while(trees.get(i).containsKey(index))
                {
                    if(currentNumber < trees.get(i).get(index))
                        index = (index * 2) + 1;
                    else
                        index = (index * 2) + 2;
                }
                                
                trees.get(i).put(index, currentNumber);
            }
            
            boolean uniqueSet = false;
            
            for(int j = 0; j < trees.size(); j++)
                if(i != j)
                {
                    uniqueSet = false;
                    
                    for(Map.Entry entry : trees.get(j).entrySet())
                    {                        
                        if(!trees.get(i).containsKey((int)entry.getKey()))
                        {
                            uniqueSet = true;
                        }
                    }
                    
                    if(!uniqueSet)
                        break;                                   
                }
                
            
            if(uniqueSet)
                total++;
        }
        
        System.out.println(total);
    }
}
