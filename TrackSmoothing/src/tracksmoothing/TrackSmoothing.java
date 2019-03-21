package tracksmoothing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrackSmoothing 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int numCases = Integer.parseInt(input.readLine());
       
       for(int curr = 0; curr < numCases; curr++)
       {
           double total = 0;
           
           String[] initValues = input.readLine().split(" ");
           int minRadius = Integer.parseInt(initValues[0]);
           int numPoints = Integer.parseInt(initValues[1]);
           
           int firstX, firstY;
           
           
           String[] firsts = input.readLine().split(" ");
           firstX = Integer.parseInt(firsts[0]);
           firstY = Integer.parseInt(firsts[1]);
           int lastX = firstX;
           int lastY = firstY;
           
           for(int i = 0; i < numPoints - 1; i++)
           {
               String[] points = input.readLine().split(" ");
               int currX = Integer.parseInt(points[0]);
               int currY = Integer.parseInt(points[1]);
               
               total += Math.sqrt(Math.pow(currX - lastX, 2) + (Math.pow(currY - lastY, 2)));
               
               lastX = currX;
               lastY = currY;
           }
           
           total += Math.sqrt(Math.pow(lastX - firstX, 2) + (Math.pow(lastY - firstY, 2)));
           
           double circumference = minRadius * Math.PI * 2;
           double result = (total - circumference) / total;
                      
           if(total < circumference)
               System.out.println("Not possible");
           else
               System.out.println(result);
       }
    }
}
