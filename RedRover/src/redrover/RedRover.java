package redrover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class RedRover 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String directions = input.readLine();
        HashSet<String> patterns = new HashSet<>();
        
        for(int i = 0; i < directions.length()-1; i++)
        {        
            for(int j = i + 2; j <= directions.length(); j++)
            {
                String sub = directions.substring(i, j);
                patterns.add(sub);
            }
        }
        
        int baseSize = directions.length();
        int size = baseSize;
                
        for(String pattern : patterns)
        {
            int occurences = 0;
            
            for(int i = 0; i < directions.length() - pattern.length() + 1; i++)
            {
                if(pattern.equals(directions.substring(i, i+pattern.length())))
                {
                    occurences++;
                    i += (pattern.length() - 1);
                }
            }
                        
            int patternSize = baseSize;
            patternSize -= occurences * pattern.length();
            patternSize += pattern.length() + occurences;
            
            if(patternSize < size)
                size = patternSize;
        }
        
        System.out.println(size);
    }
}
