package synchronizinglists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class SynchronizingLists 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String raw = input.readLine();
            
            if(raw.equals("0"))
                break;
            
            int numCases = Integer.parseInt(raw);
            LinkedList<Integer> firstSet = new LinkedList<>();
            LinkedList<Integer> secondSet = new LinkedList<>();
            
            for(int i = 0; i < numCases; i++)
            {
                firstSet.add(Integer.parseInt(input.readLine()));
            }
            
            for(int i = 0; i < numCases; i++)
            {
                secondSet.add(Integer.parseInt(input.readLine()));
            }
            
            LinkedList<Integer> firstSorted = (LinkedList<Integer>)firstSet.clone();
            LinkedList<Integer> secondSorted = (LinkedList<Integer>)secondSet.clone();
            
            Collections.sort(firstSorted);
            Collections.sort(secondSorted);
            
            int[] solution = new int[numCases];
            
            for(int i = 0; i < firstSorted.size(); i++)
            {
                solution[firstSet.indexOf(firstSorted.get(i))] = secondSorted.get(i);
            }
            
            for(int i = 0; i < numCases; i++)
            {
                System.out.println(solution[i]);
            }
            
            System.out.println("");
        }
    }
}
