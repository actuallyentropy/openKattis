package weakvertices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeakVertices 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
            int count = Integer.parseInt(input.readLine());
            
            if(count == -1)
                break;

            String[][] matrix = new String[count][count];
             boolean[] strong = new boolean[count];

            for(int i = 0; i < count; i++)
            {
                matrix[i] = input.readLine().split(" ");
            }

            for(int j = 0; j < count; j++)
            {
                if(strong[j])
                    continue;
                
                for(int i = 0; i < count; i++)
                {                   
                    if(matrix[i][j].equals("1"))
                    {
                        for(int k = 0; k < count; k++)
                        {
                            if(matrix[k][i].equals("1"))
                            {
                                if(matrix[j][k].equals("1"))
                                {
                                    strong[i] = true;
                                    strong[j] = true;
                                    strong[k] = true;
                                    break;
                                }
                            }
                        }
                    }
                    
                    if(strong[j])
                        break;
                }
            }
            
            for(int i = 0; i < count; i++)
            {
                if(!strong[i])
                    System.out.print(i + " ");
            }
            
            System.out.println("");
       }
    }
}
