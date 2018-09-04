package dicegame;

import java.util.Scanner;

public class DiceGame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int g1 = input.nextInt();
        int g2 = input.nextInt();
        int g3 = input.nextInt();
        int g4 = input.nextInt();
        
        int e1 = input.nextInt();
        int e2 = input.nextInt();
        int e3 = input.nextInt();
        int e4 = input.nextInt();
        
        double gAverage = ((g1 + g2) / 2.0) + ((g3 + g4) / 2.0);
        double eAverage = ((e1 + e2) / 2.0) + ((e3 + e4) / 2.0);
                
        if(gAverage > eAverage)
        {
            System.out.println("Gunnar");
        }else if (eAverage > gAverage)
        {
            System.out.println("Emma");
        }else
        {
            System.out.println("Tie");
        }
    }
}
