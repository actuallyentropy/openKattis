package harshadnumbers;

import java.util.Scanner;

public class HarshadNumbers 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       String line = input.next();
       
       while(true)
       {
           int total = 0;
           
           for(int i = 0; i < line.length(); i++)
           {
               total += Integer.parseInt(line.substring(i, i + 1));
           }
           
           if(Integer.parseInt(line) % total == 0)
           {
               System.out.println(line);
               break;
           }
           
           line = Integer.toString(Integer.parseInt(line) + 1);
       }
    }
}
