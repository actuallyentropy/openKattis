package oktalni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oktalni 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String data = input.readLine();
       
       String curr = "";
       
       if(data.length() % 3 != 0)
       {
           for(int i = 0; i < (((data.length() / 3) + 1) * 3) - data.length(); i++)
           {
               curr += "0";
           }
       }
       
       curr += data;
       String result = "";
       
       for(int i = 0; i < curr.length(); i += 3)
       {
           String sub = curr.substring(i, i + 3);
           
           int calc = 0;
           
           for(int j = 0; j < 3; j++)
           {
               if(sub.charAt(2 - j) == '1')
               {
                   calc += Math.pow(2, j);
               }
           }
           
           result += calc;
       }
       
       System.out.println(result);
    }
}
