package owlandfox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OwlAndFox 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            int number = Integer.parseInt(input.readLine());
            String numberString = Integer.toString(number);
            
            int digit = 1;
            
            for(int j = numberString.length() - 1; j >= 0; j--)
            {
                if(numberString.charAt(j) != '0')
                {
                    break;
                }
                
                digit = digit * 10;
            }
            
            System.out.println((number - digit));
        }
    }
}
