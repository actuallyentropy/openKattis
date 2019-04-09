package earlywinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EarlyWinter 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
       String[] inits = input.readLine().split(" ");
       String[] days = input.readLine().split(" ");
       
       boolean hasBeenEarly = false;
       int total = 0;
       
       for(int i = 0; i < days.length; i++)
       {
           if(Integer.parseInt(days[i]) > Integer.parseInt(inits[1]))
               total++;
              else
           {             
               hasBeenEarly = true;
               break;
           }
       }
       
       if(hasBeenEarly)
       {
           System.out.println("It hadn't snowed this early in " + total + " years!");
       }else
       {
           System.out.println("It had never snowed this early!");
       }
    }
}
