package convexpolygonarea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvexPolygonArea 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String[] rawValues = input.readLine().split(" ");
           
           int[] x = new int[(rawValues.length - 1) / 2];
           int[] y = new int[(rawValues.length - 1) / 2];
           
           for(int j = 1; j < rawValues.length; j += 2)
           {
               x[j / 2] = Integer.parseInt(rawValues[j]);
               y[j / 2] = Integer.parseInt(rawValues[j + 1]);
           }
           
           double total1 = 0;
           double total2 = 0;
           
           for(int j = 0; j < x.length - 1; j++)
           {
               total1 += x[j] * y[j + 1];
               total2 += y[j] * x[j + 1];
           }
           
           total1 += x[x.length - 1] * y[0];
           total2 += y[y.length - 1] * x[0];
           
           double result = (Math.abs(total1 - total2)) / 2;
           
           System.out.println(result);
       }
    }
}
