package peg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peg 
{
    static int available(char[][] board, int x, int y)
    {
        int total = 0;
        
        if(board[x][y] != 'o')
            return 0;
        
        if(x > 1)
        {
            if(board[x - 1][y] == 'o' && board[x - 2][y] == '.')
                total++;
        }
        
        if(x < 5)
        {
            if(board[x + 1][y] == 'o' && board[x + 2][y] == '.')
                total++;
        }
        
        if(y > 1)
        {
            if(board[x][y - 1] == 'o' && board[x][y - 2] == '.')
                total++;
        }
        
        if(y < 5)
        {
            if(board[x][y + 1] == 'o' && board[x][y + 2] == '.')
                total++;
        }
        
        return total;
    }
    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char[][] board = new char[7][7];
        
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                board[i][j] =  (char) input.read();
            }
            
            input.read();
        }
        
        int totalLegal = 0;
        
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                totalLegal += available(board, i, j);
            }
        }
        
        System.out.println(totalLegal);
    }
}
