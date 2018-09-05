package zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;

public class Zoo 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int caseNumber = 0;
        
        while(true)
        {
            caseNumber++;
            
            int numAnimals = Integer.parseInt(input.readLine());
            
            if(numAnimals == 0)
                break;
            
            System.out.println("List " + caseNumber + ":");
            Map<String, Integer> animalCount = new HashMap<String, Integer>();
            
            for(int i = 0; i < numAnimals; i++)
            {
                String fullAnimal = input.readLine();
                String[] animalWords = fullAnimal.split(" ");
                String animal = animalWords[animalWords.length-1].toLowerCase();
                
                if(animalCount.containsKey(animal))
                    animalCount.replace(animal, animalCount.get(animal) + 1);
                else
                    animalCount.put(animal, 1);
            }
            
            Set<Map.Entry<String, Integer> > animalSet = animalCount.entrySet();
            
            Vector<String> animalsSorted = new Vector<>();
            
            for(Map.Entry<String, Integer> animal : animalSet)
            {
                animalsSorted.add(animal.getKey() + " | " + animal.getValue());
            }           
            
            Collections.sort(animalsSorted);
            
            for(String animal : animalsSorted)
                System.out.println(animal);
        }
    }
}
