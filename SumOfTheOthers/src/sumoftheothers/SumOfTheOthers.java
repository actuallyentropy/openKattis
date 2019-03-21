package sumoftheothers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTheOthers 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           String raw = input.readLine();
           
           if(raw == null)
               break;
           
           String[] nums = raw.split(" ");
           
           for(int i = 0; i < nums.length; i++)
           {
               int sum = 0;
               
               for(int j = 0; j < nums.length; j++)
               {
                   if(i != j)
                       sum += Integer.parseInt(nums[j]);
               }
               
               if(sum == Integer.parseInt(nums[i]))
               {
                   System.out.println(nums[i]);
                   break;
               }
           }
       }
    }
}
