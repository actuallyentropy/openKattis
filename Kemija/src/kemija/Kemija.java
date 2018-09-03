package kemija;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class Kemija 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder result = new StringBuilder(input.readLine());
        
        for(int i = 0; i < result.length() - 2; i++)
        {
            char curr = result.charAt(i);
            
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u')
            {
                if(result.charAt(i) == result.charAt(i+2) && result.charAt(i+1) == 'p')
                {
                    result.deleteCharAt(i+1);
                    result.deleteCharAt(i+1);
                }
            }
        }
        
        System.out.println(result);
    }
    
}
