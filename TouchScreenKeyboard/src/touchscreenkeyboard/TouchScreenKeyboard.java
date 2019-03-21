package touchscreenkeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TouchScreenKeyboard 
{
    public static class Word 
    {
        public String word;
        public int distance;
        
        public Word(String w, int d)
        {
            word = w;
            distance = d;
        }
    }
    
    public static void main(String[] args) throws IOException 
    {
       char [][] keys = {{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}, {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'}, {'z', 'x', 'c', 'v', 'b', 'n', 'm'}};
       int [][] distanceMap = new int[26][26];
          
       for(int i = 0; i < 3; i++)
       {
           for(int j = 0; j < keys[i].length; j++)
           {
               int from = ((int)keys[i][j]) - 97;
               
               for(int k = 0; k < 3; k++)
               {
                   for(int l = 0; l < keys[k].length; l++)
                   {
                       int to = ((int) keys[k][l]) - 97;
                       int distance = Math.abs(i - k) + Math.abs(j - l);
                       
                       distanceMap[from][to] = distance;
                   }
               }
           }
       }
       
       //int testX = ((int)'w') - 97;
       //int testY = ((int)'z') - 97;
       
       //System.out.println(distanceMap[testX][testY]);
       
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       int numCases = Integer.parseInt(input.readLine());
       
       for(int i = 0; i < numCases; i++)
       {
           String[] values = input.readLine().split(" ");
           String base = values[0];
           int numToTest = Integer.parseInt(values[1]);
           Word[] vals = new Word[numToTest];
           
           for(int j = 0; j < numToTest; j++)
           {
               String testValue = input.readLine();
               int distance = 0;
               
               for(int k = 0; k < testValue.length(); k++)
               {
                   int from = (int)base.charAt(k) - 97;
                   int to = (int)testValue.charAt(k) - 97;
                   distance += distanceMap[from][to];
               }
               
               vals[j] = new Word(testValue, distance);
           }
           
           for(int j = 0; j < numToTest - 1; j++)
           {
               if(vals[j].distance > vals[j + 1].distance || (vals[j].distance == vals[j + 1].distance && vals[j].word.compareTo(vals[j + 1].word) > 0))
               {
                   Word temp = new Word(vals[j].word, vals[j].distance);
                   vals[j] = vals[j + 1];
                   vals[j + 1] = temp;
                   j = -1;
               }
           }
           
           for(int j = 0; j < numToTest; j++)
           {
               System.out.println(vals[j].word + " " + vals[j].distance);
           }
       }
    }    
}
