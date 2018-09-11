package savingforretirement;

import java.util.Scanner;

public class SavingForRetirement 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int bobAge = input.nextInt();
        int bobRetirement = input.nextInt();
        int bobFundsPerYear = input.nextInt();
        int aliceAge = input.nextInt();
        int aliceFundsPerYear = input.nextInt();
        int bobFund = 0;
        int aliceFund = 0;
        
        while(bobAge < bobRetirement)
        {
            bobFund += bobFundsPerYear;
            bobAge++;
        }
        
        while(aliceFund <= bobFund)
        {
            aliceFund += aliceFundsPerYear;
            aliceAge++;
        }
        
        System.out.println(aliceAge);
    }
}
