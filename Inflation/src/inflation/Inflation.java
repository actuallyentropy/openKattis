package inflation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Inflation 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int range = Integer.parseInt(input.readLine());
       String[] heliumStrings = input.readLine().split(" ");
       ArrayList<Integer> helium = new ArrayList<>();
       
       for(int i = 0; i < heliumStrings.length; i++)
       {
           helium.add(Integer.parseInt(heliumStrings[i]));
       }
       
       Collections.sort(helium);
       
       double best = Double.MAX_VALUE;
       
       for(int i = 1; i <= range; i++)
       {
           if(helium.get(i-1) > i)
           {
               
               System.out.println("impossible");
               return;
           }else
           {
               if((double)(helium.get(i-1)) / (double)i <= best)
               {
                   best = (double) (helium.get(i-1)) / (double) i;
               }
           }
       }
       
       System.out.println(best);
    }
}
