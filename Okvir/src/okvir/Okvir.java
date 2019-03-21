package okvir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Okvir 
{
    public static char getCharacter(boolean state)
    {
        if(state)
            return '#';
        else
            return '.';
    }
    
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String[] wordData = input.readLine().split(" ");
       String[] frameData = input.readLine().split(" ");
       int numWords = Integer.parseInt(wordData[0]);
       String[] words = new String[numWords];
       
       for(int i = 0; i < numWords; i++)
       {
           words[i] = input.readLine();
       }
       
       int height = Integer.parseInt(frameData[0]) + numWords + Integer.parseInt(frameData[3]);
       int width = Integer.parseInt(frameData[1]) + Integer.parseInt(wordData[1]) + Integer.parseInt(frameData[2]);
       
       boolean currentChar = true;
       
       for(int i = 0; i < height; i++)
       {
           if(i % 2 == 0)
               currentChar = true;
           else
               currentChar = false;
           
           for(int j = 0; j < width; j++)
           {
               if(j >= Integer.parseInt(frameData[1]) && j < Integer.parseInt(frameData[1]) + Integer.parseInt(wordData[1]))
               {
                   if(i >= Integer.parseInt(frameData[0]) && i < Integer.parseInt(frameData[0]) + numWords)
                   {
                       System.out.print(words[i - Integer.parseInt(frameData[0])].charAt(j - Integer.parseInt(frameData[1])));
                   }else
                   {
                       System.out.print(getCharacter(currentChar));
                   }                  
                   currentChar = !currentChar;
               }else
               {
                   System.out.print(getCharacter(currentChar));
                   currentChar = !currentChar;
               }
           }
                 
           System.out.println("");
       }
    }
}
