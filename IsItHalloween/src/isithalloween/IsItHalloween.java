package isithalloween;

import java.util.Scanner;

public class IsItHalloween 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       String month = input.next();
       int day = input.nextInt();
       
       if((month.equals("OCT") && day == 31) || (month.equals("DEC") && day == 25))
           System.out.println("yup");
       else
           System.out.println("nope");
    }
}
