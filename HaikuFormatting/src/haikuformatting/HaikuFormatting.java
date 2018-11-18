package haikuformatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HaikuFormatting 
{
    static boolean isVowel(char toTest)
    {
        return toTest == 'a' || toTest == 'e' || toTest == 'i' || toTest == 'o' || toTest == 'u';
    }
    
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String rawData = input.readLine();
    }
}
