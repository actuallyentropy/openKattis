package countingclauses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingClauses 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       String[] inits = input.readLine().split(" ");
       
       if(Integer.parseInt(inits[0]) < 8)      
           System.out.println("unsatisfactory");
        else
           System.out.println("satisfactory");            
    }
}
