package billiard;

import java.util.Scanner;

public class Billiard 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int s = input.nextInt();
            int m = input.nextInt();
            int n = input.nextInt();
            
            if(s == 0)
                break;
            
            int xDistance = a * m;
            int yDistance = b * n;
            System.out.printf("%.2f %.2f %n", Math.toDegrees(Math.atan2(yDistance, xDistance)), (Math.hypot(xDistance, yDistance) / s));
        }
    }
}
