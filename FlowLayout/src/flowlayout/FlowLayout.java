package flowlayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowLayout 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           int maxWidth = Integer.parseInt(input.readLine());
           
           if(maxWidth == 0)
               break;
           
           int currentWidth = 0;
           int totalWidth = 0;
           int currentHeight = 0;
           int currentTallest = 0;
           
           while(true)
           {
               String[] dimensions = input.readLine().split(" ");
               
               if(dimensions[0].equals("-1"))
                   break;
               
               if(currentWidth + Integer.parseInt(dimensions[0]) > maxWidth)
               {
                   currentWidth = Integer.parseInt(dimensions[0]);
                   currentHeight = currentHeight + currentTallest;
                   currentTallest = Integer.parseInt(dimensions[1]);
               }else
               {
                   currentWidth = currentWidth + Integer.parseInt(dimensions[0]);
                   
                   if(currentWidth > totalWidth)
                       totalWidth = currentWidth;
                   
                   if(Integer.parseInt(dimensions[1]) > currentTallest)
                   {
                       currentTallest = Integer.parseInt(dimensions[1]);
                   }
               }
           }
           
           currentHeight = currentHeight + currentTallest;
           System.out.println(totalWidth + " x " + currentHeight);
           
       }
    }
}
