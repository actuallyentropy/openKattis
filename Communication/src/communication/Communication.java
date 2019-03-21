package communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Communication 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int[] key = new int[256];
       
       input.readLine();
       
       for(int i = 0; i < 256; i++)
       {
           String base = Integer.toBinaryString(i);
           String binary = "";
           
           for(int j = 0; j < 8 - base.length(); j++)
           {
               binary += "0";
           }
           
           binary += base;
                      
           StringBuilder decodeString = new StringBuilder("");
           decodeString.append(binary.charAt(7));
           
           for(int j = 6; j >= 0; j--)
           {
               if((decodeString.charAt(6 - j) == '1' && binary.charAt(j) == '1') || (decodeString.charAt(6 - j) == '0' && binary.charAt(j) == '0'))
               {
                   decodeString.append("0");
               }else
               {
                   decodeString.append("1");
               }               
           }
           
           key[i] = Integer.parseInt(decodeString.reverse().toString(), 2);
       }
       
       String[] vals = input.readLine().split(" ");
       
       for(int i = 0; i < vals.length; i++)
       {
           System.out.print(key[Integer.parseInt(vals[i])] + " ");
       }
    }
}
