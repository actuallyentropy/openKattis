package epigdanceoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Epigdanceoff 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       String[] inits = input.readLine().split(" ");
       int rowCount = Integer.parseInt(inits[0]);
       String[] rows = new String[rowCount];
       
       for(int i = 0; i < rowCount; i++)
       {
           rows[i] = input.readLine();
       }
       
       int total = 1;
       
       for(int i = 0; i < Integer.parseInt(inits[1]); i++)
       {
           boolean increment = true;
           
           for(int j = 0; j < rowCount; j++)
           {
               if(rows[j].charAt(i) == '$')
                   increment = false;
           }
           
           if(increment)
               total++;
       }
       
       System.out.println(total);
    }
}
