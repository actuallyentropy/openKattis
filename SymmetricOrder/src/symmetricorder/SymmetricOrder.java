package symmetricorder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class SymmetricOrder 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int caseNum = 0;
        
        while(true)
        {
            int numStrings = Integer.parseInt(input.readLine());
            
            if(numStrings == 0)
                break;
            
            caseNum++;
            System.out.println("SET " + caseNum);
            
            Vector<String> secondSet = new Vector<>();
            
            for(int i = 0; i < numStrings; i++)
            {
                if(i % 2 == 0)
                {
                    System.out.println(input.readLine());
                }else
                    secondSet.add(input.readLine());
            }
            
            for(int i = secondSet.size() - 1; i >= 0; i--)
            {
                System.out.println(secondSet.get(i));
            }
        }
    }
}
