package sumsquareddigits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSquaredDigits 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String[] data = input.readLine().split(" ");
           int solution = 0;
           
           int n = Integer.parseInt(data[2]);
           
           while(n != 0)
           {
               solution += Math.pow(n % Integer.parseInt(data[1]), 2);
               n = n / Integer.parseInt(data[1]);
           }
           
           System.out.println(data[0] + " " + solution);
       }
    }
}
