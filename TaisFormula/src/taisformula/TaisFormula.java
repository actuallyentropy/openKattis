package taisformula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaisFormula 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numReads = Integer.parseInt(input.readLine());
       
       double total = 0;
       String[] first = input.readLine().split(" ");
       int lastTime = Integer.parseInt(first[0]);
       double lastRead = Double.parseDouble(first[1]);
       
       for(int i = 0; i < numReads - 1; i++)
       {
           String[] vals = input.readLine().split(" ");
           int time = Integer.parseInt(vals[0]);
           double read = Double.parseDouble(vals[1]);
           
           total += ((read + lastRead) / 2.0) * (time - lastTime);
           lastTime = time;
           lastRead = read;
       }
       
       total = total / 1000;
       
       System.out.println(total);
    }
}
