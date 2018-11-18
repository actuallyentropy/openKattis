package earlywinter;

import java.util.Scanner;

public class EarlyWinter 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int numDays = input.nextInt();
       int currentYear = input.nextInt();
       int recent = -1;
       
       for(int i = 0; i < numDays; i++)
       {
           int curr = input.nextInt();
           
           if(curr <= currentYear)
               recent = i;
       }
       
       if(recent == -1)
           System.out.println("It had never snowed this early!");
       else
           System.out.println("It hadn't snowed this early in " + recent + " years!");
    }
}
