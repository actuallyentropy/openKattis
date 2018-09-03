package hanginout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Hanginout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inits = input.readLine().split(" ");
        
        int current = 0;
        int notPermitted = 0;
        
        for(int i = 0; i < Integer.parseInt(inits[1]); i++)
        {
            String[] event = input.readLine().split(" ");
            
            if(event[0].equals("leave"))
            {
                current -= Integer.parseInt(event[1]);
            }else
            {
                if(current + Integer.parseInt(event[1]) > Integer.parseInt(inits[0]))
                {
                    notPermitted++;
                }else
                {
                    current += Integer.parseInt(event[1]);
                }
            }
        }
        
        System.out.println(notPermitted);
    }
    
}
