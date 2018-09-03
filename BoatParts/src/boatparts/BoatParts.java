package boatparts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author Lexie
 */
public class BoatParts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] init = input.readLine().split(" ");       
        Vector<String> parts = new Vector<>();
        int day = 0;
        
        for(int i = 1; i <= Integer.parseInt(init[1]); i++)
        {
            String part = input.readLine();
            if(!parts.contains(part))
            {
                parts.add(part);
                day = i;
                
                if(parts.size() == Integer.parseInt(init[0]))
                    break;
            }
        }
        
        if(parts.size() == Integer.parseInt(init[0]))
            System.out.println(day);
        else
            System.out.println("paradox avoided");
    }
    
}
