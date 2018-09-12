package tetration;

import java.util.Scanner;

public class Tetration 
{
    public static void main(String[] args) 
    {
        double input = new Scanner(System.in).nextDouble();
        double solution = Math.pow(input, 1/input);
        System.out.println(solution);
    }
}