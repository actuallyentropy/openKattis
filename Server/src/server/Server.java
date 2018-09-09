package server;

import java.util.Scanner;

public class Server 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numTasks = input.nextInt();
        int maxMinutes = input.nextInt();
        int minutes = 0;
        
        for(int i = 0; i < numTasks; i++)
        {
            int task = input.nextInt();
            
            if(minutes + task > maxMinutes)
            {
                System.out.println(i);
                return;
            }else
            {
                minutes += task;
            }
        }
        
        System.out.println(numTasks);
    }
}
