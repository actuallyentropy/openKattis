package mosquito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mosquito 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String raw = input.readLine();
            
            if(raw == null)
                break;  
            
            String[] data = raw.split(" ");
            int mosquitos = Integer.parseInt(data[0]);
            int pupae = Integer.parseInt(data[1]);
            int larvae = Integer.parseInt(data[2]);
            int eggRate = Integer.parseInt(data[3]);
            int larvaeRate = Integer.parseInt(data[4]);
            int pupaeRate = Integer.parseInt(data[5]);
            int weeks = Integer.parseInt(data[6]);
            
            for(int i = 0; i < weeks; i++)
            {
                int newLarvae = mosquitos * eggRate;
                mosquitos = pupae / pupaeRate;
                pupae = larvae / larvaeRate;
                larvae = newLarvae;
            }
            
            System.out.println(mosquitos);
        }
    }
}
