package chanukah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chanukah 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String[] data = input.readLine().split(" ");
           int n = Integer.parseInt(data[1]);
           int result = (n * (n + 1)) / 2;
           result += n;
           System.out.println(data[0] + " " + result);
       }
    }
}
