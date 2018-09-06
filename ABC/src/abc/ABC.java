package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int[] ABC = new int[3];
        ABC[0] = input.nextInt();
        ABC[1] = input.nextInt();
        ABC[2] = input.nextInt();
        Arrays.sort(ABC);
        input.nextLine(); //clear the buffer
        String key = input.nextLine();
        
        for(int i = 0; i < key.length(); i++)
        {
            char curr = key.charAt(i);
            
            switch(curr)
            {
                case 'A': System.out.print(ABC[0] + " ");
                break;
                case 'B': System.out.print(ABC[1] + " ");
                break;
                case 'C': System.out.print(ABC[2] + " ");
                break;
            }
        }
    }
}
