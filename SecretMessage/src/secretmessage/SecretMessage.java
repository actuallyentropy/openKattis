package secretmessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretMessage 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String message = input.readLine();
           String encoded = "";
           
           int square = 1;
           
           while(square * square < message.length())
               square++;
           
           for(int j = 0; j < square; j++)
           {
               for(int k = square - 1; k >= 0; k--)
               {
                   if((k * square) + j < message.length())
                       encoded += message.charAt((k * square) + j);
               }
           }
           
           System.out.println(encoded);
       }
    }
}
