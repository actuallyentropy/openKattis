package prsteni;

import java.util.Scanner;

public class Prsteni 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numCases = input.nextInt();
        int A = input.nextInt();
        
        for(int i = 0; i < numCases - 1; i++)
        {
            int tempA = A;
            int B = input.nextInt();
            
            for(int j = B; j > 0; j--)
            {
                if(tempA % j == 0 && B % j == 0 && B != 1 && j != 1)
                {
                    tempA = tempA / j;
                    B = B / j;
                    j = B+1;                    
                }                 
            }           
            System.out.println(tempA + "/" + B);
        }
    }
}
