package glitchbot;

import java.util.ArrayList;
import java.util.Scanner;

public class Glitchbot 
{
    public static boolean tryCase(ArrayList<String> directions, int xGoal, int yGoal)
    {
        int x = 0;
        int y = 0;
        int direction = 0;
        
        for(int i = 0; i < directions.size(); i++)
        {
            if(directions.get(i).equals("Forward"))
            {
                if(direction == 0)
                    y++;
                if(direction == 1)
                    x++;
                if(direction == 2)
                    y--;
                if(direction == 3)
                    x--;
                
            } else if(directions.get(i).equals("Right"))
            {
                direction = (direction + 1) % 4;
            }else
            {
                direction -= 1;
                if(direction == -1)
                    direction = 3;
            }
        }
                
        return x == xGoal && y == yGoal;
    }
    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int xGoal = input.nextInt();
       int yGoal = input.nextInt();
       int numSteps = input.nextInt();
       
       ArrayList<String> directions = new ArrayList<>();
       
       for(int i = 0; i < numSteps; i++)
       {
           directions.add(input.next());
       }
              
       for(int i = 0; i < directions.size(); i++)
       {
           ArrayList<String> modDirections = (ArrayList<String>) directions.clone();
           
           
           if(!directions.get(i).equals("Forward"))
           {
               modDirections.set(i, "Forward");
               
               if(tryCase(modDirections, xGoal, yGoal))
               {
                   System.out.println((i + 1) + " Forward");
                   return;
               }
           }
           
           if(!directions.get(i).equals("Right"))
           {
               modDirections.set(i, "Right");
               
               if(tryCase(modDirections, xGoal, yGoal))
               {
                   System.out.println((i + 1) + " Right");
                   return;
               }
           }
           
           if(!directions.get(i).equals("Left"))
           {
               modDirections.set(i, "Left");
               
               if(tryCase(modDirections, xGoal, yGoal))
               {
                   System.out.println((i + 1) + " Left");
                   return;
               }
           }
       }
    }
}
