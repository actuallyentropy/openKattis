package bachetsgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BachetsGame 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           String in = input.readLine();
           String[] vals;
           
           if(in == null)
               break;
           else
               vals = in.split(" ");
           
           boolean[] stones = new boolean[Integer.parseInt(vals[0]) + 1];
           
           for(int i = 1; i < stones.length; i++)
           {
               for(int j = 2; j < vals.length; j++)
               {
                   int stoneVal = Integer.parseInt(vals[j]);
                   
                   if(i - stoneVal >= 0 && !stones[i - stoneVal])
                   {
                       stones[i] = true;
                       break;
                   }
               }
           }
           
           if(stones[Integer.parseInt(vals[0])])
               System.out.println("Stan wins");
           else
               System.out.println("Ollie wins");                  
       }
    }
}
