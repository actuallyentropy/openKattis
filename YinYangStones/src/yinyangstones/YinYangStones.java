package yinyangstones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YinYangStones 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sequence = input.readLine();
        boolean keepTesting = true;
        int whiteTotal = 0;
        int blackTotal = 0;
        
        for(int i = 0; i < sequence.length(); i++)
        {
            if(sequence.charAt(i) == 'W')
                whiteTotal++;
            else
                blackTotal++;
        }
        
        if(whiteTotal == blackTotal)
            System.out.println("1");
        else
            System.out.println("0");
    }           
}
