package relocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Relocation 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String rawInit = input.readLine();
       String[] splitInit = rawInit.split(" ");
       int N = Integer.parseInt(splitInit[0]);
       int Q = Integer.parseInt(splitInit[1]);
       
       int[] compLocations = new int[N];
       String rawCompInit = input.readLine();
       String[] compInit = rawCompInit.split(" ");
       
       for(int i = 0; i < compInit.length; i++)
       {
           compLocations[i] = Integer.parseInt(compInit[i]);
       }
       
       for(int i = 0; i < Q; i++)
       {
           String[] request = input.readLine().split(" ");
           
           if(request[0].equals("1"))
           {
               compLocations[Integer.parseInt(request[1]) - 1] = Integer.parseInt(request[2]);
           }else
           {
               System.out.println(Math.abs(compLocations[Integer.parseInt(request[1]) - 1] - compLocations[Integer.parseInt(request[2]) - 1]));
           }
       }
    }
}
