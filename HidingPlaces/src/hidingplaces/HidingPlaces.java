package hidingplaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

class sortValue implements Comparator<String>
{   
    @Override
    public int compare(String x, String y)
    {
        return x.substring(1).compareTo(y.substring(1));
    }
}

class sortLetter implements Comparator<String>
{
    @Override
    public int compare(String x, String y)
    {
        if(x.charAt(1) == y.charAt(1))
        {
            return x.substring(0, 1).compareTo(y.substring(0, 1));
        }else
        {
            return -1;
        }
    }
}

public class HidingPlaces 
{
    public static void recursiveHide(int[][] board, int numSteps, int x, int y)
    {
        if(numSteps < board[x][y])
            board[x][y] = numSteps;
        else
            return;
                
        if(x + 1 < 8 && y + 2 < 8)
            recursiveHide(board, numSteps + 1, x + 1, y + 2);
        
        if(x + 1 < 8 && y - 2 >= 0)
            recursiveHide(board, numSteps + 1, x + 1, y - 2);
        
        if(x - 1 >= 0 && y + 2 < 8)
            recursiveHide(board, numSteps + 1, x - 1, y + 2);
        
        if(x - 1 >= 0 && y - 2 >= 0)
            recursiveHide(board, numSteps + 1, x - 1, y - 2);
        
        if(x - 2 >= 0 && y + 1 < 8)
            recursiveHide(board, numSteps + 1, x - 2, y + 1);
        
        if(x - 2 >= 0 && y - 1 >= 0)
            recursiveHide(board, numSteps + 1, x - 2, y - 1);
        
        if(x + 2 < 8 && y + 1 < 8)
            recursiveHide(board, numSteps + 1, x + 2, y + 1);
        
        if(x + 2 < 8 && y - 1 >= 0)
            recursiveHide(board, numSteps + 1, x + 2, y - 1);
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);       
        
        int numCases = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < numCases; i++)
        {
            String pos = input.nextLine();
            int x = ((int)pos.charAt(0)) - 97;
            int y = Integer.parseInt(pos.substring(1)) - 1;
                        
            int[][] board = new int[8][8];
        
            for(int j = 0; j < 8; j++)
            {
                for(int k = 0; k < 8; k++)
                {
                    board[j][k] = Integer.MAX_VALUE;
                }
            }
            
            recursiveHide(board, 0, x, y);
            
            int max = 0;
            
            for(int j = 0; j < 8; j++)
            {
                for(int k = 0; k < 8; k++)
                {
                    if(board[j][k] > max && board[j][k] != Integer.MAX_VALUE)
                        max = board[j][k];
                }
            }
            
            System.out.print(max + " ");
            
            LinkedList<String> results = new LinkedList<>();
            
            for(int j = 0; j < 8; j++)
            {
                for(int k = 0; k < 8; k++)
                {
                    if(board[j][k] == max)
                    {
                        results.add(((char)(j + 97)) + "" + (k + 1));
                    }
                }
            }
            
            Collections.sort(results, new sortValue());
            Collections.sort(results, new sortLetter());
            
            for(String space : results)
                System.out.print(space + " ");
            
            System.out.println("");
        }
    }
}
