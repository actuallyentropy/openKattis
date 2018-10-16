package funhouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunHouse 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int currHouse = 0;
       
       while(true)
       {
           currHouse++;
           String[] houseData = input.readLine().split(" ");
           
           if(houseData[0].equals("0"))
               break;
           
           char[][] house = new char[Integer.parseInt(houseData[0])][Integer.parseInt(houseData[1])];
           int direction = 2;
           int x = 0;
           int y = 0;
           
           for(int i = 0; i < Integer.parseInt(houseData[1]); i++)
           {
               for(int j = 0; j < Integer.parseInt(houseData[0]); j++)
               {
                   house[j][i] = (char) input.read();
                   
                   if(house[j][i] == '*')
                   {
                       x = j;
                       y = i;
                       
                       if(j == 0)
                           direction = 1;
                       else if(i == 0)
                           direction = 0;
                       else if(j == Integer.parseInt(houseData[0]) - 1)
                           direction = 3;
                   }
               }
               input.read();
           }
                      
           while(house[x][y] != 'x')
           {
               if(direction == 0)
                    y++;
                if(direction == 1)
                    x++;
                if(direction == 2)
                    y--;
                if(direction == 3)
                    x--;
                
                if(house[x][y] == '/')
                {
                   switch (direction) {
                       case 2:
                           direction = 1;
                           break;
                       case 1:
                           direction = 2;
                           break;
                       case 0:
                           direction = 3;
                           break;
                       case 3:
                           direction = 0;
                           break;
                       default:
                           break;
                   }
                }
                
                if(house[x][y] == '\\')
                {
                   switch (direction) {
                       case 2:
                           direction = 3;
                           break;
                       case 1:
                           direction = 0;
                           break;
                       case 0:
                           direction = 1;
                           break;
                       case 3:
                           direction = 2;
                           break;
                       default:
                           break;
                   }
                }
           }
           
           house[x][y] = '&';
           
           System.out.println("HOUSE " + currHouse);
           
           for(int i = 0; i < Integer.parseInt(houseData[1]); i++)
           {
               for(int j = 0; j < Integer.parseInt(houseData[0]); j++)
               {
                   System.out.print(house[j][i]);
               }
               System.out.println("");
           }
       }
    }
}
