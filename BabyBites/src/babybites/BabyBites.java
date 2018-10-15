package babybites;

import java.util.Scanner;

public class BabyBites 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        
        for(int i = 1; i <= limit; i++)
        {
            String data = input.next();
            
            if(data.compareTo("mumble") != 0)
                if(Integer.parseInt(data) != i)
                {
                    System.out.println("something is fishy");
                    return;
                }
        }
        
        System.out.println("makes sense");
    }
}
