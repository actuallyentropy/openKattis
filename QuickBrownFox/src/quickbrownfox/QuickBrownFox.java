package quickbrownfox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class QuickBrownFox 
{
    public static void main(String[] args) throws IOException 
    {        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCycles = Integer.parseInt(input.readLine());
        
        for(int currCycle = 0; currCycle < numCycles; currCycle++)
        {
            Vector<Character> letters = new Vector<>();
            boolean[] found = new boolean[26];
            
            for(char i = 'a'; i <= 'z'; i++)
            {
                letters.add(i);
            }
            
            String data = input.readLine();
            
            for(int i = 0; i < data.length(); i++)
            {
                char curr = data.charAt(i);
                curr = Character.toLowerCase(curr);
                
                if(letters.contains(curr))
                    found[curr - 97] = true;
            }
            
            boolean allGood = true;
            
            for(int i = 0; i < 26; i++)
            {
                if(!found[i])
                {
                    allGood = false;
                    break;
                }
            }
            
            if(allGood)
            {
                System.out.println("pangram");              
            } else
            {
                System.out.print("missing ");
                
                for(int i = 0; i < 26; i++)
                {
                    if(!found[i])
                        System.out.print((char)(i + 97));
                }
                
                System.out.println("");
            }
        }
    }
}
