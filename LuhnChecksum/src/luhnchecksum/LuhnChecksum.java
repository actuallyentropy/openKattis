package luhnchecksum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuhnChecksum 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String sequence = input.readLine();
           int total = 0;
           
           for(int j = 0; j < sequence.length(); j++)
           {
               int index = (sequence.length() - 1) - j;
               
               if((j + 1) % 2 == 0)
               {
                   int curr = Integer.parseInt(sequence.substring(index, index+1));
                   curr = curr * 2;
                   
                   if(curr > 9)
                   {
                       curr = (curr / 10) + (curr % 10);
                   }
                   
                   total += curr;
               }else
               {
                   total += Integer.parseInt(sequence.substring(index, index+1));
               }              
           }    
           
           if(total % 10 == 0)
               System.out.println("PASS");
           else
               System.out.println("FAIL");
       }
    }
}
