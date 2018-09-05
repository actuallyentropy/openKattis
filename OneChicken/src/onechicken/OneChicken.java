package onechicken;

import java.util.Scanner;

public class OneChicken 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        
        if(M > N)
        {
            if(M - N == 1)           
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            else
                System.out.println("Dr. Chaz will have " + (M - N) + " pieces of chicken left over!");
        }else
        {
            if(N - M == 1)
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            else
                System.out.println("Dr. Chaz needs " + (N - M) + " more pieces of chicken!");
        }
    }
}
