package anewalphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ANewAlphabet 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> letters = new ArrayList<>();
        for(char i = 'a'; i <= 'z'; i++)
        {
            letters.add(i);
        }
        
        String[] key = {"@", "8", "(", "|)", "3", "#", "6",
          "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]",
          "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/",
          "\\/\\/", "}{", "`/", "2"};
        
        String phrase = input.readLine();
        String translation = "";
        
        for(int i = 0; i < phrase.length(); i++)
        {
            if(letters.contains(Character.toLowerCase(phrase.charAt(i))))            
                translation += key[letters.indexOf(Character.toLowerCase(phrase.charAt(i)))];
            else
                translation += phrase.charAt(i);
        }
        
        System.out.println(translation);
    }
}
