package completingthesquare;

import java.util.Scanner;

public class CompletingTheSquare 
{
    public static double getDistance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] xCoords = new int[3];
        int[] yCoords = new int[3];
        int referenceX = 0;
        int referenceY = 0;
        int oppositeX = 0;
        int oppositeY = 0;
        int internalX = 0;
        int internalY = 0;
        
        for(int i = 0; i < 3; i++)
        {
            xCoords[i] = input.nextInt();
            yCoords[i] = input.nextInt();
        }
        
        double lineA = getDistance(xCoords[0], yCoords[0], xCoords[1], yCoords[1]);
        double lineB = getDistance(xCoords[1], yCoords[1], xCoords[2], yCoords[2]);
        double lineC = getDistance(xCoords[0], yCoords[0], xCoords[2], yCoords[2]);
        
        if(lineA == lineB)
        {
            referenceX = xCoords[0];
            referenceY = yCoords[0];
            oppositeX = xCoords[2];
            oppositeY = yCoords[2];
            internalX = xCoords[1];
            internalY = yCoords[1];
        }else if(lineB == lineC)
        {
            referenceX = xCoords[0];
            referenceY = yCoords[0];
            oppositeX = xCoords[1];
            oppositeY = yCoords[1];
            internalX = xCoords[2];
            internalY = yCoords[2];
        }else
        {
            referenceX = xCoords[1];
            referenceY = yCoords[1];
            oppositeX = xCoords[2];
            oppositeY = yCoords[2];
            internalX = xCoords[0];
            internalY = yCoords[0];
        }
                
        int offsetX;
        int offsetY;
        
        offsetX = referenceX - internalX;       
        offsetY = referenceY - internalY;
                
        System.out.println((oppositeX + offsetX) + " " + (oppositeY + offsetY));
    }
}
