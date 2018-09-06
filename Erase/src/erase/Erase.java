package erase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Erase 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String original = input.readLine();
        boolean success = true;
        String outcome = input.readLine();
        
        if(n % 2 == 0)
        {
            if(!original.equals(outcome))           
                success = false;
        }else
        {            
            for(int i = 0; i < original.length(); i++)
            {
                if(original.charAt(i) == '0')
                {
                    if(outcome.charAt(i) != '1')
                    {
                        success = false;
                        break;
                    }
                } else
                {
                    if(outcome.charAt(i) != '0')
                    {
                        success = false;
                        break;
                    }
                }
            }
        }
        
        if(success)
            System.out.println("Deletion succeeded");
        else
            System.out.println("Deletion failed");
    }
}
