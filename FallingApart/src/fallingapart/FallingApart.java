package fallingapart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FallingApart 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int numParts = input.nextInt();
       ArrayList<Integer> parts = new ArrayList<>();
       
       for(int i = 0; i < numParts; i++)
       {
           parts.add(input.nextInt());
       }
       
       Collections.sort(parts);
       
       boolean turn = true;
       int aliceTotal = 0;
       int bobTotal = 0;
       
       while(parts.size() != 0)
       {
           if(turn)
               aliceTotal += parts.get(parts.size() - 1);
           else
               bobTotal += parts.get(parts.size() - 1);
           
           turn = !turn;
           parts.remove(parts.size() - 1);
       }
       
       System.out.println(aliceTotal + " " + bobTotal);
    }
}
