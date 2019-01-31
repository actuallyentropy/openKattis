package hydrasheads;

import java.util.Scanner;

public class HydrasHeads 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       while(true)
       {
           int heads = input.nextInt();
           int tails = input.nextInt();
           
           if(heads == 0 && tails == 0)
               break;
           
           int total = 0;
           
           if(tails % 2 != 0)
           {
               total++;
               tails++;
           }
           
           if(((tails / 2) + heads) % 2 != 0)
           {
               total += 2;
               tails += 2;
           }
           
           total += tails / 2;
           heads += tails / 2;
           total += heads / 2;
           
           System.out.println(total);
       }
    }
}
