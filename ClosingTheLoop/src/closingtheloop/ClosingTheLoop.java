package closingtheloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;

public class ClosingTheLoop 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int numCases = Integer.parseInt(input.readLine());
        
        for(int currCase = 1; currCase <= numCases; currCase++)
        {
            input.readLine(); //Not needed
            String[] lines = input.readLine().split(" ");
            Vector<Integer> redLines = new Vector<>();
            Vector<Integer> blueLines = new Vector<>();
            
            for(int i = 0; i < lines.length; i++)
            {
                if(lines[i].charAt(lines[i].length()-1) == 'B')
                {
                    blueLines.add(Integer.parseInt(lines[i].substring(0, lines[i].length() - 1)));
                }else
                {
                    redLines.add(Integer.parseInt(lines[i].substring(0, lines[i].length() - 1)));
                }
            }
            
            Collections.sort(redLines);
            Collections.reverse(redLines);
            Collections.sort(blueLines);
            Collections.reverse(blueLines);
            int total = 0;
            
            for(int i = 0; i < redLines.size() && i < blueLines.size(); i++)
            {
                total += (redLines.get(i) + blueLines.get(i)) - 2;
            }
            
            System.out.println("Case #" + currCase + ": " + total);  
        }
    }
}
