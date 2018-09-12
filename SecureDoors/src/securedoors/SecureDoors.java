package securedoors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SecureDoors 
{
    public static void main(String[] args) throws IOException 
    {
        HashMap<String, Boolean> users = new HashMap<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            String[] log = input.readLine().split(" ");
            
            if(log[0].equals("entry"))
            {
                if(users.containsKey(log[1]))
                {
                    if(users.get(log[1]))
                        System.out.println(log[1] + " entered (ANOMALY)");
                    else
                        System.out.println(log[1] + " entered");
                }else
                {
                    System.out.println(log[1] + " entered");                   
                }
                
                users.put(log[1], true);
            }else
            {
                if(users.containsKey(log[1]))
                {
                    if(!users.get(log[1]))
                        System.out.println(log[1] + " exited (ANOMALY)");
                    else
                        System.out.println(log[1] + " exited");
                }else
                {
                    System.out.println(log[1] + " exited (ANOMALY)");
                }
                
                users.put(log[1], false);
            }
        }
    }
}
