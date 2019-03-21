package coconut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Coconut 
{
    public static class Hand
    {
        public int owner;
        public int state;
        
        public Hand(int own, int st)
        {
            owner = own;
            state = st;
        }
    }
       
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int syl = input.nextInt();
       syl--;
       int playerCount = input.nextInt();    
       int place = 0;
       ArrayList<Hand> hands = new ArrayList<>();
       HashMap<Integer, Integer> inPlay = new HashMap<>();
       
       for(int i = 0; i < playerCount; i++)
       {
           hands.add(new Hand(i, 0));
           inPlay.put(i, 2);
       }
       
       while(playerCount > 1)
       {
           place = (place + syl) % hands.size();
           int currState = hands.get(place).state;
           
           if(currState == 0)
           {
               hands.get(place).state = 1;
               hands.add(place, new Hand(hands.get(place).owner, 1));
           }else if(currState == 1)
           {
               hands.get(place).state = 2;
               place = (place + 1) % hands.size();
           }else if(currState == 2)
           {
               int currOwn = hands.get(place).owner;
               hands.remove(place);           
               inPlay.put(currOwn, inPlay.get(currOwn) - 1);
               
               if(inPlay.get(currOwn) == 0)
                   playerCount--;
           }
       }
       
       System.out.println(hands.get(0).owner + 1);
    }
}
