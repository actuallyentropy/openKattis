package freefood;

import java.util.Scanner;

public class FreeFood 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int numCases = input.nextInt();
       int totalDays = 0;
       boolean[] days = new boolean[365];
       
       for(int i = 0; i < numCases; i++)
       {
           int day1 = input.nextInt();
           int day2 = input.nextInt();
           
           for(int j = day1; j <= day2; j++)
           {
               if(!days[j - 1])
               {
                   days[j - 1] = true;
                   totalDays++;
               }
           }                     
       }
       
       System.out.println(totalDays);
    }
}
