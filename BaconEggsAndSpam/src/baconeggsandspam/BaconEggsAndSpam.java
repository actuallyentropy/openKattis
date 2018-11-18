package baconeggsandspam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class BaconEggsAndSpam 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           int numOrders = Integer.parseInt(input.readLine());
           
           if(numOrders == 0)
               break;
           
           HashMap<String, ArrayList<String>> orders = new HashMap<>();
        
           for(int i = 0; i < numOrders; i++)
           {               
               String[] order = input.readLine().split(" ");
               
               for(int j = 1; j < order.length; j++)
               {
                   if(!orders.containsKey(order[j]))
                       orders.put(order[j], new ArrayList<>());
                   orders.get(order[j]).add(order[0]);
               }
           }
           
           ArrayList<ArrayList<String>> toSort = new ArrayList<>();
           
           for(Map.Entry entry : orders.entrySet())
           {
               toSort.add(new ArrayList<>());
               toSort.get(toSort.size() - 1).add((String) entry.getKey());
               toSort.get(toSort.size() - 1).addAll((Collection<? extends String>) entry.getValue());              
           }
           
           for(int j = 0; j < toSort.size() - 1; j++)
           {
                if(toSort.get(j).get(0).compareTo(toSort.get(j + 1).get(0)) > 0 )
                {
                    ArrayList<String> temp =  (ArrayList<String>) toSort.get(j).clone();
                    toSort.set(j, (ArrayList<String>) toSort.get(j + 1).clone());
                    toSort.set(j + 1, temp);
                       
                    j = -1;
                }
           }
           
           for(int j = 0; j < toSort.size(); j++)
           {
               for(int k = 1; k < toSort.get(j).size() - 1; k++)
               {
                   if(toSort.get(j).get(k).compareTo(toSort.get(j).get(k + 1)) > 0 )
                   {
                       String temp = toSort.get(j).get(k);
                       toSort.get(j).set(k, toSort.get(j).get(k + 1));
                       toSort.get(j).set(k + 1, temp);
                       
                       k = 0;
                   }
               }
           }
           
           for(int j = 0; j < toSort.size(); j++)
           {
               for(int k = 0; k < toSort.get(j).size(); k++)
               {
                   System.out.print(toSort.get(j).get(k) + " ");
               }
               System.out.println("");
           }
           
           System.out.println("");
       }
    }
}
