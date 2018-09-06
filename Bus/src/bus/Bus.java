package bus;

import java.util.Scanner;

public class Bus 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);       
        int numCases = input.nextInt();
        
        for(int i = 0; i < numCases; i++)
        {
            System.out.println((int)(Math.pow(2, input.nextInt()) - 1));
        }
    }
}
