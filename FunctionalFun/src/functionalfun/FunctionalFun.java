package functionalfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FunctionalFun 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           String test = input.readLine();
           
           if(test == null)
               break;
           
           String[] domain = test.split(" ");
           String[] codomain = input.readLine().split(" ");
           
           HashMap<String, Boolean> domainInUse = new HashMap<>();
           HashMap<String, Boolean> codomainInUse = new HashMap<>();
           
           boolean function = true;
           boolean injective = true;
           
           int numMappings = Integer.parseInt(input.readLine());
           
           for(int i = 0; i < numMappings; i++)
           {
               String[] mapping = input.readLine().split(" ");
               
               if(domainInUse.containsKey(mapping[0]))
                   function = false;
               else
                   domainInUse.put(mapping[0], true);
               
               if(codomainInUse.containsKey(mapping[2]))
                   injective = false;
               else
                   codomainInUse.put(mapping[2], true);
           }
           
           if(!function)
               System.out.println("not a function");
           else if(injective && codomainInUse.size() == codomain.length - 1)
               System.out.println("bijective");
           else if(injective)
               System.out.println("injective");
           else if(codomainInUse.size() == codomain.length - 1)
               System.out.println("surjective");
           else
               System.out.println("neither injective nor surjective");
       }
    }
}
