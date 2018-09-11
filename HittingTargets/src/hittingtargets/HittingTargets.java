package hittingtargets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HittingTargets 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
        int numTargets = Integer.parseInt(input.readLine());
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        
        for(int i = 0; i < numTargets; i++)
        {
            String[] data = input.readLine().split(" ");
            
            if(data[0].equals("circle"))
                circles.add(new Circle(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])));
            else
                rectangles.add(new Rectangle(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])));
        }
        
        int numShots = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numShots; i++)
        {
            int numHit = 0;
            
            String[] shot = input.readLine().split(" ");

            for(Circle circle : circles)
            {
                if(circle.checkHit(Integer.parseInt(shot[0]), Integer.parseInt(shot[1])))
                    numHit++;
            }
            
            for(Rectangle rectangle : rectangles)
            {
                if(rectangle.checkHit(Integer.parseInt(shot[0]), Integer.parseInt(shot[1])))
                    numHit++;
            }
            
            System.out.println("" + numHit);
        }       
    }
}
