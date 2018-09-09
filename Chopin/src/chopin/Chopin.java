package chopin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chopin 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 1; i <= 6; i++)
        {
            String data = input.readLine();
            
            if(data == null)
                break;
            
            String[] parts = data.split(" ");
            System.out.print("Case " + i + ": ");
            
            if(parts[0].equals("A#"))
            {
                System.out.println("Bb " + parts[1]);
            }else if(parts[0].equals("Bb"))
            {
                System.out.println("A# " + parts[1]);
            }else if(parts[0].equals("C#"))
            {
                System.out.println("Db " + parts[1]);
            }else if(parts[0].equals("Db"))
            {
                System.out.println("C# " + parts[1]);
            }else if(parts[0].equals("D#"))
            {
                System.out.println("Eb " + parts[1]);
            }else if(parts[0].equals("Eb"))
            {
                System.out.println("D# " + parts[1]);
            }else if(parts[0].equals("F#"))
            {
                System.out.println("Gb " + parts[1]);
            }else if(parts[0].equals("Gb"))
            {
                System.out.println("F# " + parts[1]);
            }else if(parts[0].equals("G#"))
            {
                System.out.println("Ab " + parts[1]);
            }else if(parts[0].equals("Ab"))
            {
                System.out.println("G# " + parts[1]);
            }else
            {
                System.out.println("UNIQUE");
            }
        }
    }
}
