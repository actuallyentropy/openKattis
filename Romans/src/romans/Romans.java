package romans;

import java.util.Scanner;

public class Romans 
{
    public static void main(String[] args) 
    {
       double english = new Scanner(System.in).nextDouble();
       
       System.out.println(Math.round(english * (1000 * (5280.0/4854.0))));
    }
}
