package pokerhand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PokerHand 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       HashMap<Character, Integer> cards = new HashMap<>();
       String data[] = input.readLine().split(" ");
       
       int max = 1;
       
       for(int i = 0; i < 5; i++)
       {
           if(cards.containsKey(data[i].charAt(0)))
           {
               cards.put(data[i].charAt(0), cards.get(data[i].charAt(0)) + 1);
               if(cards.get(data[i].charAt(0)) > max)
                   max = cards.get(data[i].charAt(0));             
           }else
           {
               cards.put(data[i].charAt(0), 1);
           }
       }
       
       System.out.println(max);
    }
}
