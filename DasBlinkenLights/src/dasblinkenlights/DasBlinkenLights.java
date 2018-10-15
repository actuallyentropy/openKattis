package dasblinkenlights;

import java.util.Scanner;

public class DasBlinkenLights 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int firstBlink = input.nextInt();
       int secondBlink = input.nextInt();
       int patience = input.nextInt();
       
       int firstState = 1;
       int secondState = 1;
       
       for(int i = 0; i < patience; i++)
       {
           firstState = firstState % firstBlink;
           secondState = secondState % secondBlink;
           
           if(firstState == 0 && secondState == 0)
           {
               System.out.println("yes");
               return;
           }
           
           firstState++;
           secondState++;
       }
       
       System.out.println("no");
    }
}
