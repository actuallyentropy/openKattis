package anotherbrick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherBrick 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String[] inits = input.readLine().split(" ");
       int h = Integer.parseInt(inits[0]);
       int w = Integer.parseInt(inits[1]);
       String[] bricks = input.readLine().split(" ");
       int currH = 0;
       int currW = 0;
       int i = 0;
       
       while(true)
       {
           if(currH == h)
           {
               System.out.println("YES");
               return;
           }
           
           if(i >= bricks.length)
           {
               System.out.println("NO");
               return;
           }          
           
           currW += Integer.parseInt(bricks[i]);
           
           if(currW > w)
           {
               System.out.println("NO");
               return;
           }
           
           if(currW == w)
           {
               currW = 0;
               currH++;
           }
           
           i++;
       }
    }
}
