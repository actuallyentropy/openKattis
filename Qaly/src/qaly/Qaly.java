package qaly;

import java.util.Scanner;

public class Qaly 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int numLoops = input.nextInt();
       
       double total = 0;
       
       for(int i = 0; i < numLoops; i++)
       {
           double quality = input.nextDouble();
           double time = input.nextDouble();
           
           total += quality * time;
       }
       
       System.out.println(total);
    }
}
