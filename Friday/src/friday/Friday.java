package friday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Friday 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int numCases = Integer.parseInt(input.readLine());
       
       for(int curr = 0; curr < numCases; curr++)
       {
           int count = 0;
           input.readLine();          
           String[] days = input.readLine().split(" ");
           int dow = -1;
           
           for(int i = 0; i < days.length; i++)
           {
               for(int j = 0; j < Integer.parseInt(days[i]); j++)
               {
                   dow = (dow + 1) % 7; 
                   
                   if(j == 12 && dow == 5)
                       count++;
               }
           }
           
           System.out.println(count);
       }
    }
}
