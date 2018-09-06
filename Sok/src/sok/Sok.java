package sok;

import java.util.Scanner;

public class Sok 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int orange = input.nextInt();
        int apple = input.nextInt();
        int pineapple = input.nextInt();
        int orangeR = input.nextInt();
        int appleR = input.nextInt();
        int pineappleR = input.nextInt();
        
        double smallest = (double)orange / orangeR;
        
        if((double)pineapple / pineappleR < smallest)
            smallest = (double) pineapple / pineappleR;
        
        if((double)apple / appleR < smallest)
            smallest = (double) apple / appleR;
        
        double orangeL = orange - (orangeR * smallest);
        double appleL = apple - (appleR * smallest);
        double pineappleL = pineapple - (pineappleR * smallest);
        
        System.out.println(orangeL + " " + appleL + " " + pineappleL);
    }
}
