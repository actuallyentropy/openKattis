package heirsdilemma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class HeirsDilemma 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String[] ranges = input.readLine().split(" ");
       int solution = 0;
       
       for(int i = Integer.parseInt(ranges[0]); i <= Integer.parseInt(ranges[1]); i++)
       {
           boolean valid = true;          
           HashMap<Integer, Boolean> used = new HashMap<>();
           
           for(int j = 0; j < 6; j++)
           {
               int curr = Integer.parseInt(Character.toString(Integer.toString(i).charAt(j)));
                              
               if(curr == 0)
               {
                   valid = false;
                   break;
               }                           
               
               if(i % curr != 0)
               {
                   valid = false;
                   break;
               }
               
               if(used.containsKey(curr))
               {
                   valid = false;
                   break;
               }else
               {
                   used.put(curr, true);
               }
           }
           
           if(valid)
               solution++;
       }
       
       System.out.println(solution);
    }
}
