package rijeci;

import java.util.Scanner;

public class Rijeci 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numTimes = input.nextInt();
        int A = 1;
        int B = 0;
        
        for(int i = 0; i < numTimes; i++)
        {
            int newA = B;
            B += A;
            A = newA;
        }
        
        System.out.print(A + " " + B);
    }
}
