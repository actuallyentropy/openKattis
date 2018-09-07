//Broken

package raggedright;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class RaggedRight 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        int longest = 0;
        Vector<String> lines = new Vector<>();
        
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            if(longest < line.length())
                longest = line.length();
            lines.add(line);
        }
              
        int raggedness = 0;
        
        for(int i = 0; i < lines.size() - 1; i++)
        {
            int length = lines.get(i).length();
            raggedness += ((longest - length) * (longest - length));            
        }
        
        System.out.println(raggedness);
    }
}
