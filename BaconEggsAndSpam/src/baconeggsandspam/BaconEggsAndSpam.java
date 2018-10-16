package baconeggsandspam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;



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
           
           for(int i = 0; i < numOrders; i++)
           {
               HashMap<String, ArrayList<String>> orders = new HashMap<>();
               
               String[] order = input.readLine().split(" ");
               
               for(int j = 1; i < order.length; i++)
               {
                   // fix later                       
               }
           }
       }
    }
}
