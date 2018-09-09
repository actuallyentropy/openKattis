package rationalsequence2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class RationalSequence2 
{    
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int currCase = 0; currCase < numCases; currCase++)
        {
            String[] raw = input.readLine().split(" ");
            String[] pq = raw[1].split("/");
            
            int p = Integer.parseInt(pq[0]);
            int q = Integer.parseInt(pq[1]);
            LinkedList<Integer> paths = new LinkedList<>();
            
            while(p != 1 || q != 1)
            {   
                if(p > q)
                {
                    paths.push(2);
                    p -= q;
                }
                else
                {
                    paths.push(1);
                    q -= p;
                }                
            }
            
            int index = 0;
            
            for(int i = 0; i < paths.size(); i++)
            {
                index = (2 * index) + paths.get(i);
            }
            
            System.out.println(raw[0] + " " + (index + 1));
        }
    }
}
