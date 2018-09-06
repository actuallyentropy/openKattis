package whatdoesthefoxsay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class WhatDoesTheFoxSay 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int currCase = 0; currCase < numCases; currCase++)
        {
            String[] original = input.readLine().split(" ");
            boolean[] goodSounds = new boolean[original.length];
            
            while(true)
            {
                String[] sound = input.readLine().split(" ");
                
                if(sound[0].equals("what"))
                    break;
                
                for(int i = 0; i < original.length; i++)
                {
                    if(original[i].equals(sound[2]))
                        goodSounds[i] = true;
                }
            }
            
            for(int i = 0; i < original.length; i++)
            {
                if(!goodSounds[i])
                    System.out.print(original[i] + " ");
            }
        }
    }
}
