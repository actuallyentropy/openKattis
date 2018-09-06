package prva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prva 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] init = input.readLine().split(" ");
        
        int R = Integer.parseInt(init[0]);
        int C = Integer.parseInt(init[1]);
        
        char[][] puzzle = new char[R][C];
        
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                puzzle[i][j] = (char)input.read();
            }
            
            input.read();
        }
                
        String current = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        
        for(int i = 0; i < R; i++)
        {        
            String tryString = "";
                    
            for(int j = 0; j < C; j++)
            {
                if(puzzle[i][j] == '#' || j == C-1)
                {
                    if(j == C - 1 && puzzle[i][j] != '#')
                        tryString += puzzle[i][j];
                    
                    if(tryString.length() > 1 && current.compareTo(tryString) > 0)
                        current = tryString;
                    tryString = "";
                }else
                {
                    tryString += puzzle[i][j];
                }
            }
        }
        
        for(int i = 0; i < C; i++)
        {        
            String tryString = "";
                    
            for(int j = 0; j < R; j++)
            {
                if(puzzle[j][i] == '#' || j == R-1)
                {
                    if(j == R - 1 && puzzle[j][i] != '#')
                        tryString += puzzle[j][i];
                    
                    if(tryString.length() > 1 && current.compareTo(tryString) > 0)
                        current = tryString;
                    
                    tryString = "";
                }else
                {
                    tryString += puzzle[j][i];
                }
            }
        }
        
        System.out.println(current);
    }
}
