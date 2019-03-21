package eulersnumber;

import java.util.Scanner;

public class EulersNumber 
{
    public static double fact(int num)
    {
        long result = 1;
        
        while(num > 0)
        {
            result = result * num;
            num--;
        }
        
        return result;
    }
    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       long num = input.nextLong();
       
       if(num > 65)
       {
           System.out.println(Math.E);
           return;
       }
       
       double total = 0;
       
       for(int i = 0; i <= num; i++)
       {
           total += 1.0 / fact(i);
       }
              
       System.out.println(total);
    }
}
