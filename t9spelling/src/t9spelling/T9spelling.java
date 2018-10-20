package t9spelling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class T9spelling 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       HashMap<Character, String> letters = new HashMap<>();
       
       letters.put('a', "2");
       letters.put('b', "22");
       letters.put('c', "222");
       letters.put('d', "3");
       letters.put('e', "33");
       letters.put('f', "333");
       letters.put('g', "4");
       letters.put('h', "44");
       letters.put('i', "444");
       letters.put('j', "5");
       letters.put('k', "55");
       letters.put('l', "555");
       letters.put('m', "6");
       letters.put('n', "66");
       letters.put('o', "666");
       letters.put('p', "7");
       letters.put('q', "77");
       letters.put('r', "777");
       letters.put('s', "7777");
       letters.put('t', "8");
       letters.put('u', "88");
       letters.put('v', "888");
       letters.put('w', "9");
       letters.put('x', "99");
       letters.put('y', "999");
       letters.put('z', "9999");
       letters.put(' ', "0");
       
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String encode = input.readLine();
           String result = "";
           
           for(int j = 0; j < encode.length(); j++)
           {
               String toAdd = letters.get(encode.charAt(j));
               if(result.length() != 0)
                   if (toAdd.charAt(0) == result.charAt(result.length() - 1) && toAdd.charAt(0) != ' ')
                        result += " ";
               result += toAdd;
           }
           
           System.out.println("Case #" + (i + 1) + ": " + result);
       }
    }
}
