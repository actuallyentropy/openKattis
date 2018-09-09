package triangleornaments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleOrnaments 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        double L = 0;
        
        for(int i = 0; i < numCases; i++)
        {
            String[] raw = input.readLine().split(" ");
            
            double A = Double.parseDouble(raw[0]);
            double B = Double.parseDouble(raw[1]);
            double C = Double.parseDouble(raw[2]);
            double halfC = C / 2;
            
            if(A < B)
            {
                double temp = A;
                A = B;
                B = temp;
            }
            
            //Get the angle opposite B
            double BAngle = Math.acos((((A * A) + (C * C)) - (B * B)) / (2 * A * C));
            //Get the line running down the middle using law of cosines which perfectly divides C in half due to the fixed point
            double midLine = Math.sqrt(((A * A) + (halfC * halfC)) -  (2 * A * halfC * Math.cos(BAngle))); 
            //Law of cosines for the angle opposite the part of C connecting to the longer line
            double CAngle = Math.acos((((A * A) + (midLine * midLine)) - (halfC * halfC)) / (2 * A * midLine));
            //Get the angle between the outside of the triangle and the rod, which we know together with the half-c angle is 90 degrees
            double largerAngle = (Math.PI / 2) - CAngle;
            //Translate it all into a rectangle and get the angle of a smaller triangle below our larger one
            double innerAngle = largerAngle - BAngle;
            //Get the length of the adjacent of the smaller triangle from that inner angle, and double it since we only accounted for half of C
            double width = 2 * halfC * Math.cos(innerAngle);
            L += width;
        }
        
        System.out.println(L);
    }
}
