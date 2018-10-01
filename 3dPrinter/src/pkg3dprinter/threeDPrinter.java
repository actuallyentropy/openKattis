package pkg3dprinter;

import java.util.Scanner;

public class threeDPrinter 
{
    public static void main(String[] args) 
    {
        int numJobs = new Scanner(System.in).nextInt();
        
        int printers = 1;
        int days = 1;
        
        while(printers < numJobs)
        {
            printers = printers * 2;
            days++;
        }
        
        System.out.println(days);
    }
}
