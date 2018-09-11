package leftbeehind;

import java.util.Scanner;

public class LeftBeehind 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            int x = input.nextInt();
            int y = input.nextInt();
            
            if(x == 0 && y == 0)
                break;
            
            if(x + y == 13)
                System.out.println("Never speak again.");
            else if(x > y)
                System.out.println("To the convention.");
            else if(y > x)
                System.out.println("Left beehind.");
            else
                System.out.println("Undecided.");
        }
    }
}
