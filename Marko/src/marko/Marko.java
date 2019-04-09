package marko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marko 
{
    public static void main(String[] args) throws IOException 
    {
       char[] key = {'2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5', '6', '6', '6', '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9'};
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numWords = Integer.parseInt(input.readLine());
       String[] words = new String[numWords];
       
       for(int i = 0; i < numWords; i++)
       {
           words[i] = input.readLine();
       }
       
       String digits = input.readLine();
       int total = 0;
       
       for(int i = 0; i < numWords; i++)
       {
           boolean good = false;
           
           if(words[i].length() == digits.length())
           {
               good = true;
               
               for(int j = 0; j < words[i].length(); j++)
               {
                   if(key[(int)(words[i].charAt(j)) - 97] != digits.charAt(j))
                   {
                       good = false;
                       break;
                   }
               }
           }
           
           if(good)
               total++;
       }
       
       System.out.println(total);
    }
}
