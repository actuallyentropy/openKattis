package empleh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empleh 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String[] whiteBuffer = input.readLine().split(" ");
       String[] whiteMoves;
       if(whiteBuffer.length != 1)
           whiteMoves = whiteBuffer[1].split(",");
       else
           whiteMoves = new String[0];
       String[] blackBuffer = input.readLine().split(" ");
       String[] blackMoves;
       if(blackBuffer.length != 1)
           blackMoves = blackBuffer[1].split(",");
       else
           blackMoves = new String[0];
       
       char[][] moves = new char[8][8];
              
       for(int i = 0; i < whiteMoves.length; i++)
       {
           if(whiteMoves[i].length() == 3)
           {
               int x = whiteMoves[i].charAt(1) - 97;
               int y = Integer.parseInt(whiteMoves[i].substring(2)) - 1;
               moves[x][y] = whiteMoves[i].charAt(0);
           }else
           {       
               int x = whiteMoves[i].charAt(0) - 97;
               int y = Integer.parseInt(whiteMoves[i].substring(1)) - 1;         
               moves[x][y] = 'P';
           }
       }
       
       for(int i = 0; i < blackMoves.length; i++)
       {
           if(blackMoves[i].length() == 3)
           {
               int x = blackMoves[i].charAt(1) - 97;
               int y = Integer.parseInt(blackMoves[i].substring(2)) - 1;
               moves[x][y] = Character.toLowerCase(blackMoves[i].charAt(0));
           }else
           {
               int x = blackMoves[i].charAt(0) - 97;
               int y = Integer.parseInt(blackMoves[i].substring(1)) - 1;           
               moves[x][y] = 'p';
           }
       }
       
       boolean currentColor = false;
       
       for(int i = 7; i >= 0; i--)
       {
           System.out.println("+---+---+---+---+---+---+---+---+");
           for(int j = 0; j < 8; j++)
           {
               System.out.print("|");
               
               if(currentColor)
                   if(moves[j][i] != 0)
                       System.out.print(":" + moves[j][i] + ":");
                   else
                       System.out.print(":::");
               else
                   if(moves[j][i] != 0)
                       System.out.print("." + moves[j][i] + ".");
                   else
                       System.out.print("...");
               
               currentColor = !currentColor;
           }
           currentColor = !currentColor;
           System.out.println("|");
       }
       System.out.println("+---+---+---+---+---+---+---+---+");
    }
}
