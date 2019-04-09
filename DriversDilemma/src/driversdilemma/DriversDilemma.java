package driversdilemma;

import java.util.Scanner;

public class DriversDilemma 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       double capacity = input.nextDouble();
       capacity = capacity / 2;
       double leakRate = input.nextDouble();
       double distance = input.nextDouble();
       
       boolean canReach = false;
       int maxSpeed = 0;
       
       for(int i = 0; i < 6; i++)
       {
           int speed = input.nextInt();
           double efficiency = input.nextDouble();
           double time = distance / speed;
           
           if(capacity - ((distance / efficiency) + (time * leakRate)) >= 0.000001)
           {
               maxSpeed = speed;
               canReach = true;
           }
       }
       
       if(!canReach)
           System.out.println("NO");
       else
           System.out.println("YES " + maxSpeed);
    }
}