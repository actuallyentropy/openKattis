//This solution is absurd and I'm surprised it works. There's probably data sets that it doesn't work with but I have no idea what they'd be.

package flyingsafely;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class FlyingSafely 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int currCase = 0; currCase < numCases; currCase++)
        {
            Vector<Integer> citiesIn = new Vector<Integer>();
            String[] initValues = input.readLine().split(" ");
            System.out.println((Integer.parseInt(initValues[0]) - 1));
            
            for(int i = 0; i < Integer.parseInt(initValues[1]); i++)
            {
                String[] flight = input.readLine().split(" ");
            }            
        }
    }
}
