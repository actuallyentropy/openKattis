package prozor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prozor 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] inits = input.readLine().split(" ");
        int R = Integer.parseInt(inits[0]);
        int S = Integer.parseInt(inits[1]);
        int K = Integer.parseInt(inits[2]);
        
        char[][] picture = new char[R][S];
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < S; j++)
            {
                //System.out.println("adding new character");
                picture[i][j] = (char)input.read();
            }
            input.read();
            //System.out.println("Breaking");
        }
        
        int highest = 0;
        int highestX = 0;
        int highestY = 0;
        
        for(int x = 0; x <= R - K; x++)
        {
            for(int y = 0; y <= S - K; y++)
            {
                int flies = 0;
                
                for(int i = x+1; i < x + 1 + K - 2; i++)
                {
                    for(int j = y+1; j < y + 1 + K - 2; j++)
                    {
                        if(picture[i][j] == '*')
                            flies++;
                    }
                }
                
                if(flies > highest)
                {
                    highest = flies;
                    highestX = x;
                    highestY = y;
                } 
            }
        }
        
        picture[highestX][highestY] = '+';
        picture[highestX + K - 1][highestY] = '+';
        picture[highestX][highestY + K - 1] = '+';
        picture[highestX + K - 1][highestY + K - 1] = '+';
        
        for(int i = 1; i < K - 1; i++)
        {
            picture[highestX + i][highestY] = '|';
            picture[highestX][highestY + i] = '-';
            picture[highestX + K - 1][highestY + i] = '-';
            picture[highestX + i][highestY + K - 1] = '|';
        }
        
        
        System.out.println(highest);
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < S; j++)
            {
                System.out.print(picture[i][j]);
            }
            System.out.println("");
        }
    }
}
