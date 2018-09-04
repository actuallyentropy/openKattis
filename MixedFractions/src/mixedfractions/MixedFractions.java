package mixedfractions;

import java.util.Scanner;

public class MixedFractions 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            int x = input.nextInt();
            int y = input.nextInt();
            int var = 0;
            
            if(x == 0 && y == 0)
                break;
            
            if(x >= y)
            {
                var = x / y;
                x = x - (y * var);
            }
            
            System.out.println(var + " " + x + " / " + y);
        }
    }
}
