package purplerain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PurpleRain 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String data = input.readLine();
       int leastPurple = 0;
       int startIndex = 0;
       int endIndex = 0;
       
       for(int i = 0; i < data.length(); i++)
       {
           int red = 0;
           int blue = 0;
           
           for(int j = i; j < data.length(); j++)
           {
               if(data.charAt(j) == 'R')
                   red++;
               else
                   blue++;
               
               int current = Math.abs(red - blue);
               
               if(current > leastPurple)
               {
                   leastPurple = current;
                   startIndex = i;
                   endIndex = j;
               }
           }
       }
       
       startIndex++;
       endIndex++;
       System.out.println(startIndex + " " + endIndex);
    }
}
