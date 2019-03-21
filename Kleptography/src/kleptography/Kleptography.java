package kleptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kleptography 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       String[] init = input.readLine().split(" ");     
       String end = input.readLine();
       String cypher = input.readLine();
       StringBuilder result = new StringBuilder(end).reverse();
       
       for(int i = cypher.length() - 1, j = 0; i >= 0; i--, j++)
       {
           int currPlain = (int)result.charAt(j) - 97;
           int currCipher = (int)cypher.charAt(i) - 97;
           int next;
           
           if(currPlain > currCipher)
           {
               next = 26 - (currPlain - currCipher);
           } else
           {
               next = currCipher - currPlain;
           }
           
           result.append((char)(next + 97));
       }
       
       System.out.println(result.reverse().substring(end.length()));
    }
}
