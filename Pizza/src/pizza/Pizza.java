package pizza;

import java.util.Scanner;

public class Pizza 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        
        double whole = Math.PI * R * R;
        double sub = Math.PI * (R - C) * (R - C);
        double result = sub / whole * 100;
        
        System.out.println(result);
    }
}
