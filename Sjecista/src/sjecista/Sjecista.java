package sjecista;

import java.util.Scanner;

public class Sjecista 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int vertices = input.nextInt();
       int result = ((vertices * (vertices - 1)) * (vertices - 2) *(vertices - 3)) / 24;
       
       System.out.println(result);
    }
}
