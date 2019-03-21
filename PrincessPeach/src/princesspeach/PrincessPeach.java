package princesspeach;

import java.util.Scanner;

public class PrincessPeach 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int numObstacles = input.nextInt();
       boolean[] obstacles = new boolean[numObstacles];
       
       int numCases = input.nextInt();
       
       for(int i = 0; i < numCases; i++)
       {
           int curr = input.nextInt();
           obstacles[curr] = true;
       }
       
       int total = 0;
       
       for(int i = 0; i < numObstacles; i++)
       {
           if(!obstacles[i])
               System.out.println(i);
           else
               total++;
       }
       
       System.out.println("Mario got " + total + " of the dangerous obstacles.");
    }
}
