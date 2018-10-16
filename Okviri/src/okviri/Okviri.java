package okviri;

import java.util.Scanner;

public class Okviri 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      String phrase = input.next();
      
      char[][] frame = new char[(5 * phrase.length()) - (phrase.length() - 1)][5];
      
      for(int i = 0; i < frame.length; i++)
      {
          for(int j = 0; j < 5; j++)
          {
              frame[i][j] = '.';
          }
      }
      
      int state = 1;
      
      for(int i = 2, curr = 0; i < frame.length; i+= 4, curr++)
      {
          frame[i][2] = phrase.charAt(curr);
          
          if(state == 3)
          {
              state = 1;
              frame[i][0] = '*';
              frame[i][4] = '*';
              frame[i - 2][2] = '*';
              frame[i + 2][2] = '*';
              frame[i + 1][3] = '*';
              frame[i - 1][3] = '*';
              frame[i + 1][1] = '*';
              frame[i - 1][1] = '*';
          }else
          {
              state++;
              
              frame[i][0] = '#';
              frame[i][4] = '#';
              frame[i + 1][3] = '#';
              frame[i - 1][3] = '#';
              frame[i + 1][1] = '#';
              frame[i - 1][1] = '#';
              
              if(frame[i - 2][2] != '*')
                  frame[i - 2][2] = '#';
              if(frame[i + 2][2] != '*')
                  frame[i + 2][2] = '#';
          }
      }
      
      for(int i = 0; i < 5; i++)
      {
          for(int j = 0; j < frame.length; j++)
          {
              System.out.print(frame[j][i]);
          }
          
          System.out.println("");
      }
    }
}
