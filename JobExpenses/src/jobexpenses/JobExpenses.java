package jobexpenses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JobExpenses 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int numCases = Integer.parseInt(input.readLine());
       String[] values = input.readLine().split(" ");
       long total = 0;
       
       for(int i = 0; i < numCases; i++)
       {
           int curr = Integer.parseInt(values[i]);
           
           if(curr < 0)
               total += curr * -1;
       }
       
       System.out.println(total);
    }
}
