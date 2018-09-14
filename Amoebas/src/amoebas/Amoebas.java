package amoebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amoebas 
{
    public static void recursEliminate(char[][] grid, boolean[][] inUse, int currentX, int currentY)
    {
        if(inUse[currentX][currentY] || grid[currentX][currentY] == '.')
            return;
        
        inUse[currentX][currentY] = true;
                
        if(currentX > 0)
        {
            recursEliminate(grid, inUse, currentX - 1, currentY);
            
            if(currentY > 0)
                recursEliminate(grid, inUse, currentX - 1, currentY - 1);
            
            if(currentY < grid[currentX].length - 1)
                recursEliminate(grid, inUse, currentX - 1, currentY + 1);
        }
        
        if(currentX < grid.length - 1)
        {
            recursEliminate(grid, inUse, currentX + 1, currentY);
            
            if(currentY > 0)
                recursEliminate(grid, inUse, currentX + 1, currentY - 1);
            
            if(currentY < grid[currentX].length - 1)
                recursEliminate(grid, inUse, currentX  + 1, currentY + 1);

        }
        
        if(currentY > 0)
            recursEliminate(grid, inUse, currentX, currentY - 1);
            
        if(currentY < grid[currentX].length - 1)
            recursEliminate(grid, inUse, currentX, currentY + 1);
    }
    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] inits = input.readLine().split(" ");
        int xRange = Integer.parseInt(inits[1]);
        int yRange = Integer.parseInt(inits[0]);
        int total = 0;
        
        char[][] grid = new char[xRange][yRange];
        boolean[][] inUse = new boolean[xRange][yRange];
        
        for(int i = 0; i < yRange; i++)
        {
            for(int j = 0; j < xRange; j++)
            {
                grid[j][i] = (char)input.read();
            }        
            input.read();
        }
        
        for(int i = 0; i < yRange; i++)
        {
            for(int j = 0; j < xRange; j++)
            {
                if(grid[j][i] == '#' && !inUse[j][i])
                {
                    total++;
                    recursEliminate(grid, inUse, j, i);
                }
            }           
        }
        
        System.out.println(total);
    }
}
