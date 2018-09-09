package rationalsequence3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class RationalSequence3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        
        for(int currCase = 0; currCase < numCases; currCase++)
        {
            System.out.print(input.nextInt() + " ");
            
            long pos = input.nextLong() - 1;
            LinkedList<Long> positions = new LinkedList<>();
            
            while(pos != 0)
            {
                positions.add(pos);
                pos = (pos - 1) / 2;
            }
            
            positions.add((long)0);
            
            long p = 1;
            long q = 1;
            
            for(int i = positions.size() - 1; i > 0; i--)
            {
                if((positions.get(i) * 2) + 1 == positions.get(i-1))
                {
                    q += p;
                }else
                {
                    p += q;
                }
            }
            
            System.out.println(p + "/" + q);
        }
    }
}
