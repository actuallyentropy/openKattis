package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman 
{
    public static void main(String[] args) throws IOException 
    {
        boolean[] hasLetters = new boolean[26];
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String word = input.readLine();
       String alphabetPerm = input.readLine();
       int total = 0;
       
       for(int i = 0; i < word.length(); i++)
       {
           if(!hasLetters[word.charAt(i) - 65])
           {
               total++;        
               hasLetters[word.charAt(i) - 65] = true;
           }
       }
       
       int bad = 0;
       int good = 0;
       
       for(int i = 0; i < 26; i++)
       {
          if(!hasLetters[alphabetPerm.charAt(i) - 65])
              bad++;
          else
              good++;
          
          if(good == total)
          {
              System.out.println("WIN");
              return;
          }
          
          if(bad == 10)
          {
              System.out.println("LOSE");
              return;
          }
       }
       
       System.out.println("WIN");
    }
}
