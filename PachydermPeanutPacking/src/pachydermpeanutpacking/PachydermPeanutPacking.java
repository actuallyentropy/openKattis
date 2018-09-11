package pachydermpeanutpacking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PachydermPeanutPacking 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            int numBoxes = Integer.parseInt(input.readLine());
            
            if(numBoxes == 0)
                break;
            
            ArrayList<Box> boxes = new ArrayList<>();
            
            for(int i = 0; i < numBoxes; i++)
            {
                String[] boxInfo = input.readLine().split(" ");
                boxes.add(new Box(Double.parseDouble(boxInfo[0]), Double.parseDouble(boxInfo[1]), Double.parseDouble(boxInfo[2]), Double.parseDouble(boxInfo[3]), boxInfo[4]));
            }
            
            int numPeanuts = Integer.parseInt(input.readLine());
            
            for(int i = 0; i < numPeanuts; i++)
            {
                String[] peanut = input.readLine().split(" ");               
                boolean inBox = false;
                
                for(Box box : boxes)
                {
                    if(box.checkContains(Double.parseDouble(peanut[0]), Double.parseDouble(peanut[1])))
                    {
                        String size = box.getSize();
                        
                        if(peanut[2].equals(size))
                        {
                            System.out.println(peanut[2] + " correct");
                        }else
                        {
                            System.out.println(peanut[2] + " " + size);
                        }
                        
                        inBox = true;
                        break;
                    }
                }
                
                if(!inBox)
                    System.out.println(peanut[2] + " floor");
            }
            
            System.out.println("");
        }
    }
}
