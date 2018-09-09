package pauleigon;

import java.util.Scanner;

public class Pauleigon 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int p = input.nextInt(); 
        int q = input.nextInt();
        
        int total = p + q;
        
        
        int loops = total / n;        
        
        if(loops % 2 == 0)
        {
            System.out.println("paul");
        }else
            System.out.println("opponent");
    }
}
