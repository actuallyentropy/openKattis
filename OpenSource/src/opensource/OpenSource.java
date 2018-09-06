package opensource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class OpenSource 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String data = input.readLine();
        Map<String, Integer> students = new HashMap<>();
        Vector<String> projects = new Vector<>();
        Vector<Integer> projectVals = new Vector<>();
        int projectIndex = -1;
        
        while(true)
        {            
            if(data.equals("0"))
                break;
            
            if(data.equals("1"))
            {
                for(int i = 1; i < projects.size(); i++)
                {
                    if(projects.get(i).compareTo(projects.get(i-1)) < 0)
                    {
                        String temp = projects.get(i-1);
                        int tempVal = projectVals.get(i-1);
                        projects.set(i-1, projects.get(i));
                        projectVals.set(i-1, projectVals.get(i));
                        projects.set(i, temp);
                        projectVals.set(i, tempVal);
                        i = 0;
                    }
                }
                
                
                for(int i = 1; i < projects.size(); i++)
                {
                    if(projectVals.get(i) > projectVals.get(i - 1))
                    {
                        String temp = projects.get(i-1);
                        int tempVal = projectVals.get(i-1);
                        projects.set(i-1, projects.get(i));
                        projectVals.set(i-1, projectVals.get(i));
                        projects.set(i, temp);
                        projectVals.set(i, tempVal);
                        i = 0;
                    }
                }
                

                for(int i = 0; i < projects.size(); i++)
                {
                    System.out.println(projects.get(i) + " " + projectVals.get(i));
                }
                
                students.clear();
                projects.clear();
                projectVals.clear();
                projectIndex = -1;
                data = input.readLine();
            }
            
            if(data.charAt(0) >= 'A' && data.charAt(0) <= 'Z')
            {
                projects.add(data);
                projectVals.add(0);
                projectIndex += 1;
                
                while(true)
                {
                    data = input.readLine();
                    
                    if(data.charAt(0) > 'z' || data.charAt(0) < 'a')
                    {
                        break;
                    }
                    
                    if(students.containsKey(data))
                    {
                        int studentProject = students.get(data);
                        
                        if(studentProject != projectIndex && studentProject != -1)
                        {
                            projectVals.set(studentProject, projectVals.get(studentProject) - 1);
                            students.replace(data, -1);
                        }
                    }else
                    {
                        students.put(data, projectIndex);
                        projectVals.set(projectIndex, projectVals.get(projectIndex) + 1);
                    }
                }
            }
        }
    }
}
