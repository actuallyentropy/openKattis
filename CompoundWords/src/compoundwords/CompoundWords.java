package compoundwords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompoundWords 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Set<String> words = new HashSet<>();
        Set<String> compounds = new HashSet<>();
        
        while(true)
        {
            String raw = input.readLine();
            
            if(raw == null)
                break;
            
            String[] parts = raw.split(" ");
            
            for (String part : parts)
                words.add(part);
        }
                
        for(String word1 : words)
        {
            for(String word2: words)
            {
                if(!word1.equals(word2))
                    compounds.add(word1 + word2);
            }
        }
        
        List<String> results = new ArrayList<>(compounds);
        Collections.sort(results);
        
        for(String word : results)
            System.out.println(word);
    }
}
