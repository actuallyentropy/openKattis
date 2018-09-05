package skocimis;

import java.util.Scanner;

public class Skocimis 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        
        int distance = z - y;
        
        if(y - x > distance)
        {
            distance = y - x;
        }
        
        distance--;
        
        System.out.println(distance);
    }
}
