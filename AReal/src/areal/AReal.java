package areal;

import java.util.Scanner;

public class AReal 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double sqrFt = input.nextDouble();
        
        double side = Math.sqrt(sqrFt);
        System.out.println((side * 4));
    }
}
