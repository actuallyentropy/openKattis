package nineknights;

import java.util.Scanner;

public class NineKnights 
{
    static boolean checkValid(boolean[][] board, int x, int y)
    {      
        if(!board[x][y])
            return true;
        
        if(x < 4)
        {
            if(x < 3)
            {
                if(y > 0)
                    if(board[x+2][y-1])
                        return false;
                if(y < 4)
                    if(board[x+2][y+1])
                        return false;
            }
            
            if(y < 3)
                if(board[x+1][y+2])
            
            if(y > 1)
                if(board[x+1][y-2])
                    return false;
        }
        
        if(x > 0)
        {
            if(x > 1)
            {
                if(y > 0)
                    if(board[x-2][y-1])
                        return false;
                if(y < 4)
                    if(board[x-2][y+1])
                        return false;
            }
            
            if(y < 3)
            {
                if(board[x-1][y+2])
                    return false;
            }
            
            if(y > 1)
                if(board[x-1][y-2])
                    return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        boolean[][] board = new boolean[5][5];
        int knights = 0;
        
        for(int i = 0; i < 5; i++)
        {
            String line = input.nextLine();
            
            for(int j = 0; j < line.length(); j++)
            {
                if(line.charAt(j) == 'k')
                {
                    board[i][j] = true;
                    knights += 1;
                }
            }
        }
        
        if(knights != 9)
        {
            System.out.println("invalid");
            return;
        }
                
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(!checkValid(board, i, j))
                {
                    System.out.println("invalid");
                    return;
                }
            }
        }
        
        System.out.println("valid");
    }
}
