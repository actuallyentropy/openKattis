package mirror;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mirror 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(input.readLine());
        
        for(int currCase = 1; currCase <= numTests; currCase++)
        {
            System.out.println("Test " + currCase);
            
            String[] values = input.readLine().split(" ");
            char[][] image = new char[Integer.parseInt(values[0])][Integer.parseInt(values[1])];
            
            for(int i = Integer.parseInt(values[0]) - 1; i >= 0; i--)
            {
                for(int j = Integer.parseInt(values[1]) - 1; j >= 0; j--)
                {
                    image[i][j] = (char)input.read();
                }
                input.read();
            }
            
            for(int i = 0; i < Integer.parseInt(values[0]); i++)
            {
                for(int j = 0; j < Integer.parseInt(values[1]); j++)
                {
                    System.out.print(image[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
