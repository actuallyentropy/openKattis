package ostgotska;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ostgotska 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String[] words = input.readLine().split(" ");
        int numOccurences = 0;
        
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length() - 1; j++)
            {
                if(words[i].charAt(j) == 'a' && words[i].charAt(j+1) == 'e')
                {
                    numOccurences++;
                    break;
                }
            }
        }
        
        double per = (double)(numOccurences) / words.length;
        
        if(per >= 0.4)
            System.out.println("dae ae ju traeligt va");
        else
            System.out.println("haer talar vi rikssvenska");
    }
}
