package musicalscales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class MusicalScales 
{
    static String[] getScale(String[] notes, int start)
    {
        String[] scale = new String[8];
        
        scale[0] = notes[start];
        start = (start + 2) % 12;
        scale[1] = notes[start];
        start = (start + 2) % 12;
        scale[2] = notes[start];
        start = (start + 1) % 12;
        scale[3] = notes[start];
        start = (start + 2) % 12;
        scale[4] = notes[start];
        start = (start + 2) % 12;
        scale[5] = notes[start];
        start = (start + 2) % 12;
        scale[6] = notes[start];
        start = (start + 1) % 12;
        scale[7] = notes[start];
        
        return scale;
    }
    
    public static void main(String[] args) throws IOException 
    {
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        Vector<String[]> scales = new Vector<>();
        
        for(int i = 0; i < notes.length; i++)
        {
            scales.add(getScale(notes, i));
        }
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input.readLine();      
        String[] data = input.readLine().split(" ");
        int numFound = 0;
        
        for(int i = 0; i < scales.size(); i++)
        {
            boolean found = true;
            
            for(int j = 0; j < data.length; j++)
            {
                if(!Arrays.asList(scales.get(i)).contains(data[j]))
                {
                    found = false;
                }
            }
            
            if(found)
            {
                numFound++;
                System.out.print(notes[i] + " ");
            }
        }
        
        if(numFound == 0)
            System.out.println("none");
    }
}
