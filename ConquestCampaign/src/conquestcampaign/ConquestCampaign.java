package conquestcampaign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConquestCampaign 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String[] inits = input.readLine().split(" ");
       
       int rows = Integer.parseInt(inits[0]);
       int cols = Integer.parseInt(inits[1]);
       int weak = Integer.parseInt(inits[2]);
       
       boolean[][] territory = new boolean[cols][rows];
       
       int totalPossible = rows * cols;
       int unique = 0;
       
       for(int i = 0; i < weak; i++)
       {
           String[] coords = input.readLine().split(" ");
           
           if(!territory[Integer.parseInt(coords[1]) - 1][Integer.parseInt(coords[0]) - 1])
               unique++;
           
           territory[Integer.parseInt(coords[1]) - 1][Integer.parseInt(coords[0]) - 1] = true;
       }
              
       if(unique >= totalPossible)
       {
           System.out.println(1);
           return;
       }
       
       int days = 1;
       
       while(true)
       {
           days++;
           
           boolean contFlag = true;
           boolean[][] recent = new boolean[cols][rows];
           
           for(int i = 0; i < cols; i++)
           {
               for(int j = 0; j < rows; j++)
               {                   
                   if(!territory[i][j])
                   {
                       if((i > 0 && territory[i - 1][j] && !recent[i - 1][j]) || 
                               (i < cols - 1 && territory[i + 1][j] && !recent[i + 1][j]) || 
                               (j > 0 && territory[i][j - 1] && !recent[i][j - 1]) || 
                               (j < rows - 1 && territory[i][j+1] && !recent[i][j + 1]))
                       {
                           territory[i][j] = true;
                           recent[i][j] = true;
                       }else
                       {
                           contFlag = false;
                       }
                   }
               }
           }
           
           if(contFlag)
               break;
       }
       
       System.out.println(days);
    }
}
