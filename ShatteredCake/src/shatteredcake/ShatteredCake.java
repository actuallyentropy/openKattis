package shatteredcake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShatteredCake 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int width = Integer.parseInt(input.readLine());
       int pieces = Integer.parseInt(input.readLine());
       
       int runningArea = 0;
       
       for(int i = 0; i < pieces; i++)
       {
           String[] part = input.readLine().split(" ");
           runningArea += Integer.parseInt(part[0]) * Integer.parseInt(part[1]);
       }
       
       int solution = runningArea / width;
       System.out.println(solution);
    }
}
