package karte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Karte 
{
    static void checkCard(boolean[][] suits, int index, int value)
    {
        if(suits[index][value])
        {
            System.out.println("GRESKA");
            System.exit(0);
        }else
            suits[index][value] = true;
    }
    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String cards = input.readLine();
        boolean[][] suits = new boolean[4][13];
        
        for(int i = 0; i < cards.length(); i+=3)
        {
            char suite = cards.charAt(i);
            int value = Integer.parseInt(cards.substring(i+1, i+3)) - 1;
            
            switch(suite)
            {
                case 'P': checkCard(suits, 0, value);
                break;
                case 'K': checkCard(suits, 1, value);
                break;
                case 'H': checkCard(suits, 2, value);
                break;
                case 'T': checkCard(suits, 3, value);
                break;
            }          
        }
        
        for(int i = 0; i < 4; i++)
        {
            int missing = 0;
            
            for(int j = 0; j < 13; j++)
            {
                if(!suits[i][j])
                    missing++;
            }
            
            System.out.print(missing + " ");
        }
    }
}
