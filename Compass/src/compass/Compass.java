package compass;

import java.util.Scanner;

public class Compass 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int start = input.nextInt();
       int end = input.nextInt();
       
       int clockwise = 0;
       int counter = 0;
       
       if(start <= end)
       {
           clockwise = end - start;
           counter = (360 - clockwise);
       }else
       {
           clockwise = (360 - start) + end;
           counter = (360 - clockwise);
       }
              
       if(clockwise <= counter)
           System.out.println(clockwise);
       else
           System.out.println(counter * -1);
    }
}
