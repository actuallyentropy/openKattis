package greedilyincreasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GreedilyIncreasing 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input.readLine();
        String[] data = input.readLine().split(" ");
        ArrayList<Integer> greedy = new ArrayList<>();
        greedy.add(Integer.parseInt(data[0]));
        
        for(int i = 1; i < data.length; i++)
        {
            if(Integer.parseInt(data[i]) > greedy.get(greedy.size() - 1))
                greedy.add(Integer.parseInt(data[i]));
        }
        
        System.out.println(greedy.size());
        
        for(int i = 0; i < greedy.size(); i++)
        {
            System.out.print(greedy.get(i) + " ");
        }
    }
}
