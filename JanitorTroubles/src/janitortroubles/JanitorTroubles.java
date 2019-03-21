package janitortroubles;

import java.util.Scanner;

public class JanitorTroubles 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        
        double semi = (a + b + c + d) / 2;
        double result = Math.sqrt((semi - a) * (semi - b) * (semi - c) * (semi - d));
        
        System.out.println(result);
    }
}
