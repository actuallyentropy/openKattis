package lastfactorialdigit;

import java.util.Scanner;

public class LastFactorialDigit 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int numCases = input.nextInt();
       
       for(int i = 0; i < numCases; i++)
       {
           int toTest = input.nextInt();
           
           int current = toTest;
           toTest--;
           
           for(; toTest > 0; toTest--)
           {
               current = (current * toTest) % 10;
           }
           
           System.out.println(current);
       }
    }
}
