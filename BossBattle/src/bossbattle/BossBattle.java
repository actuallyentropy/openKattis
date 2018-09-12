package bossbattle;

import java.util.Scanner;

public class BossBattle 
{
    public static void main(String[] args) 
    {
        int numPillars = new Scanner(System.in).nextInt();
        if(numPillars < 4)
            System.out.println("1");
        else
            System.out.println((numPillars - 2));
    }
}
