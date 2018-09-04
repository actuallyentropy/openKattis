package tri;

import java.util.Scanner;

public class Tri 
{    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        
        if(x + y == z)
        {
            System.out.println(x + "+" + y + "=" + z);
        }
        
        else if(x - y == z)
        {
            System.out.println(x + "-" + y + "=" + z);
        }
        
        else if(x * y == z)
        {
            System.out.println(x + "*" + y + "=" + z);
        }
        
        else if((double)x / (double)y == (double)z)
        {
            System.out.println(x + "/" + y + "=" + z);
        }
        
        else if(y + z == x)
        {
            System.out.println(x + "=" + y + "+" + z);
        }
        
        else if(y - z == x)
        {
            System.out.println(x + "=" + y + "-" + z);
        }
        
        else if(y * z == x)
        {
            System.out.println(x + "=" + y + "*" + z);
        }
        
        else if((double)y / (double)z == (double)x)
        {
            System.out.println(x + "=" + y + "/" + z);
        }
    }
}
