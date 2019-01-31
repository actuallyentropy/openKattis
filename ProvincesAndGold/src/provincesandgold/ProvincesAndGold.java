package provincesandgold;

import java.util.Scanner;

public class ProvincesAndGold 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int power = 0;
       power += input.nextInt() * 3;
       power += input.nextInt() * 2;
       power += input.nextInt();
       
       if(power >=8)
           System.out.println("Province or Gold");
       else if(power >= 6)
           System.out.println("Duchy or Gold");
       else if (power >= 5)
           System.out.println("Duchy or Silver");
       else if (power >= 3)
           System.out.println("Estate or Silver");
       else if(power >= 2)
           System.out.println("Estate or Copper");
       else
           System.out.println("Copper");
           
    }
}
