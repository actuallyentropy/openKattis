package jabuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jabuke 
{
    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        double result = x1 * (y2 - y3);
        result = result + (x2 * (y3 - y1));
        result = result + (x3 * (y1 - y2));
        return Math.abs(result) / 2;
    }
    
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       String[] coords1 = input.readLine().split(" ");
       String[] coords2 = input.readLine().split(" ");
       String[] coords3 = input.readLine().split(" ");
       
       double x1 = Float.parseFloat(coords1[0]);
       double y1 = Float.parseFloat(coords1[1]);
       double x2 = Float.parseFloat(coords2[0]);
       double y2 = Float.parseFloat(coords2[1]);
       double x3 = Float.parseFloat(coords3[0]);
       double y3 = Float.parseFloat(coords3[1]);
       double area = triangleArea(x1, y1, x2, y2, x3, y3);     
       int numCases = Integer.parseInt(input.readLine());
       
       System.out.println(area);
       
       int total = 0;
       
       for(int i = 0; i < numCases; i++)
       {
           String[] point = input.readLine().split(" ");
           double px = Float.parseFloat(point[0]);
           double py = Float.parseFloat(point[1]);
           
           double check = triangleArea(px, py, x1, y1, x2, y2) + triangleArea(px, py, x1, y1, x3, y3) + triangleArea(px, py, x2, y2, x3, y3);
           
           if(check == area)
               total++;
       }
       
       System.out.println(total);
    }
}
