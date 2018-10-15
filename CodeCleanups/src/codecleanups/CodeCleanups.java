package codecleanups;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeCleanups 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);    	
       int phases = 1;
       ArrayList<Integer> days = new ArrayList<>();
       int numDays = input.nextInt();
       
       for(int i = 0; i < numDays; i++)
       {
           days.add(input.nextInt());
           int dirtiness = 0;
           int base = days.get(days.size() - 1);
           
           for(int j = days.size() - 2; j >= 0; j--)
           {
               dirtiness += base - days.get(j);
           }
           
           if(dirtiness >= 20)
           {
               phases++;
               days.clear();
               days.add(base);
           }
       }
       
       System.out.println(phases);
    }
}
