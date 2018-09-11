package tsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tsp 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCities = Integer.parseInt(input.readLine());
        ArrayList<Double> cityX = new ArrayList<>();
        ArrayList<Double> cityY = new ArrayList<>();
        
        for(int i = 0; i < numCities; i++)
        {
            String[] data = input.readLine().split(" ");
            cityX.add(Double.parseDouble(data[0]));
            cityY.add(Double.parseDouble(data[1]));
        }
        
        int citiesVisited = 0;
        int currentCity = 0;
        
        while(citiesVisited < numCities)
        {
            System.out.println(currentCity);
            double shortestDistance = Double.MAX_VALUE;
            int shortestDistanceIndex = 0;
            
            for(int i = 0; i < cityX.size(); i++)
            {
                if(i != currentCity && cityX.get(i) != -1)
                {
                    double distance = Math.sqrt(Math.pow(cityX.get(i) - cityX.get(currentCity), 2) + Math.pow(cityY.get(i) - cityY.get(currentCity), 2));
                    if(distance < shortestDistance)
                    {
                        shortestDistance = distance;
                        shortestDistanceIndex = i;
                    }
                }
            }
            
            cityX.set(currentCity, -1.0);
            cityY.set(currentCity, -1.0);
            
            currentCity = shortestDistanceIndex;
            citiesVisited++;
        }
    }
}
