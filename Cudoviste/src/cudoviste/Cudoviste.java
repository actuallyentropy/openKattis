package cudoviste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cudoviste 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] initVals = input.readLine().split(" ");
        char[][] map = new char[Integer.parseInt(initVals[0])][Integer.parseInt(initVals[1])];
        
        
        for(int i = 0; i < Integer.parseInt(initVals[0]); i++)
        {
            for(int j = 0; j < Integer.parseInt(initVals[1]); j++)
            {
                map[i][j] = (char)input.read();
            }
            input.read();
        }
        
        int spots[] = new int [5];
        
        for(int i = 0; i < Integer.parseInt(initVals[0]) - 1; i++)
        {
            for(int j = 0; j < Integer.parseInt(initVals[1]) - 1; j++)
            {
                if(map[i][j] != '#' && map[i+1][j] != '#' && map[i][j+1] != '#' && map[i+1][j+1] != '#')
                {
                    int numSquashed = 0;
                
                    if(map[i][j] == 'X')
                        numSquashed++;
                    if(map[i+1][j] == 'X')
                        numSquashed++;
                    if(map[i][j+1] == 'X')
                        numSquashed++;
                    if(map[i+1][j+1] == 'X')
                        numSquashed++;
                    
                    spots[numSquashed]++;
                }
            }
        }
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println(spots[i]);
        }
    }
}
