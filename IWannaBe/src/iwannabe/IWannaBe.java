package iwannabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class IWannaBe 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       String[] inits = input.readLine().split(" ");
       int numNoms = Integer.parseInt(inits[0]);
       int numBest = Integer.parseInt(inits[1]);
       
       PriorityQueue<Long> bestAttack = new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Long> bestDefense = new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Long> bestHealth = new PriorityQueue<>(Collections.reverseOrder());
       HashMap<Long, Integer> byAttack = new HashMap<>();
       HashMap<Long, Integer> byDefense = new HashMap<>();
       HashMap<Long, Integer> byHealth = new HashMap<>();
       
       for(int i = 0; i < numNoms; i++)
       {
           String[] stats = input.readLine().split(" ");
           long attack = Long.parseLong(stats[0]);
           long defense = Long.parseLong(stats[1]);
           long health = Long.parseLong(stats[2]);
           
           bestAttack.add(attack);
           byAttack.put(attack, i);
           
           bestDefense.add(defense);
           byDefense.put(defense, i);
           
           bestHealth.add(health);
           byHealth.put(health, i);
       }
       
       HashMap<Integer, Boolean> isBest = new HashMap<>();
       int total = 0;
       
       for(int i = 0; i < numBest; i++)
       {
           Long currAttack = bestAttack.poll();
           Long currDefense = bestDefense.poll();
           Long currHealth = bestHealth.poll();
           
           if(!isBest.containsKey(byAttack.get(currAttack)))
           {
               isBest.put(byAttack.get(currAttack), Boolean.FALSE);
               total++;
           }
           
           if(!isBest.containsKey(byDefense.get(currDefense)))
           {
               isBest.put(byDefense.get(currDefense), Boolean.FALSE);
               total++;
           }
           
           if(!isBest.containsKey(byHealth.get(currHealth)))
           {
               isBest.put(byHealth.get(currHealth), Boolean.FALSE);
               total++;
           }                 
       }
       
       System.out.println(total);
       
       /*
       int[] bestAttack = new int[numBest];
       int[] bestAttackIndex = new int[numBest];
       int[] bestDefense = new int[numBest];
       int[] bestDefenseIndex = new int[numBest];
       int[] bestHealth = new int[numBest];
       int[] bestHealthIndex = new int[numBest];
       
       for(int i = 0; i < numNoms; i++)
       {
           String[] stats = input.readLine().split(" ");
           int attack = Integer.parseInt(stats[0]);
           int defense = Integer.parseInt(stats[1]);
           int health = Integer.parseInt(stats[2]);
           
           for(int j = 0; j < numBest; j++)
           {
               if(attack > bestAttack[j])
               {
                   for(int k = numBest - 1; k >= j; k--)
                   {
                       bestAttack[k] = bestAttack[k - 1];
                       bestAttackIndex[k] = bestAttackIndex[k - 1];
                   }
               }
           }
       }

       */
    }
}
