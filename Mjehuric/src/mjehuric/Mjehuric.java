package mjehuric;

import java.util.Scanner;

public class Mjehuric 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] logs = new int[5];
        
        for(int i = 0; i < 5; i++)
        {
            logs[i] = input.nextInt();
        }
        
        for(int i = 0; i < 4; i++)
        {
            if(logs[i] > logs[i+1])
            {
                int temp = logs[i];
                logs[i] = logs[i + 1];
                logs[i + 1] = temp;
                
                for(int log : logs)
                    System.out.print(log + " ");
                System.out.println("");                              
            }
            
            if(i == 3)
            {
                for(int j = 0; j < 4; j++)
                {
                    if(logs[j] > logs[j + 1])
                        i = -1;
                }
            }
        }
    }
}
