package unlockpattern;

import java.util.Scanner;

public class UnlockPattern 
{
    public static double unlockDistance(int[][] pattern, int currentStep, double distance)
    {
        if(currentStep == 9)
            return distance;
        
        int currentX = 0;
        int currentY = 0;
        int nextX = 0;
        int nextY = 0;
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(pattern[i][j] == currentStep)
                {
                    currentX = i;
                    currentY = j;
                }else if(pattern[i][j] == currentStep + 1)
                {
                    nextX = i;
                    nextY = j;
                }
            }
        }
                        
        distance += Math.sqrt(Math.pow(nextX - currentX, 2) + Math.pow(nextY - currentY, 2));       
        
        return unlockDistance(pattern, currentStep + 1, distance);      
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[][] pattern = new int[3][3];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                pattern[i][j] = input.nextInt();
            }
        }
        
        System.out.println(unlockDistance(pattern, 1, 0));
    }
}
