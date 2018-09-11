package peragrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Peragrams 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String phrase = input.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < phrase.length(); i++)
        {
            if(map.containsKey(phrase.charAt(i)))
                map.replace(phrase.charAt(i), map.get(phrase.charAt(i)) + 1);
            else
                map.put(phrase.charAt(i), 1);
        }
        
        int removed = 0;
        
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue() % 2 != 0)
            {             
                    removed++;
            }           
        }
        
        if(removed > 0)
            removed--;
        
        System.out.println(removed);
    }
}
