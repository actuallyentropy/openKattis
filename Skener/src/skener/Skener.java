package skener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Skener 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String initData = input.readLine();
        String[] data = initData.split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int newRows = Integer.parseInt(data[2]);
        int newCols = Integer.parseInt(data[3]);
        
        String text = "";
        for(int i = 0; i < rows; i++)
        {
            text += input.readLine();
        }
        
        String result = "";
        
        for(int i = 0; i < rows; i++)
        {            
            String segment = "";
            
            for(int j = 0; j < cols; j++)
            {
                for(int k = 0; k < newCols; k++)
                {
                    segment += text.substring(i * cols, (i * cols) + cols).charAt(j);
                }
            }
            
            for(int j = 0; j < newRows; j++)
            {
                System.out.println(segment);
            }
        }
        
    } 
}
