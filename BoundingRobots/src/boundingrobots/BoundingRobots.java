package boundingrobots;

import java.util.Scanner;

public class BoundingRobots 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            int roomX = input.nextInt();
            int roomY = input.nextInt();
            
            if(roomX == 0 && roomY == 0)
                break;
            
            int steps = input.nextInt();
            
            int robotThinkX = 0;
            int robotThinkY = 0;
            int robotX = 0;
            int robotY = 0;
            
            for(int i = 0; i < steps; i++)
            {
                char direction = input.next().charAt(0);
                int distance = input.nextInt();
                
                if(direction == 'u')
                {
                    robotThinkY += distance;
                    
                    if(robotY + distance > roomY - 1)
                        robotY = roomY - 1;
                    else
                        robotY += distance;
                }
                
                else if(direction == 'd')
                {
                    robotThinkY -= distance;
                    
                    if(robotY - distance < 0)
                        robotY = 0;
                    else
                        robotY -= distance;
                }
                
                else if(direction == 'l')
                {
                    robotThinkX -= distance;
                    
                    if(robotX - distance < 0)
                        robotX = 0;
                    else
                        robotX -= distance;
                } else
                {
                    robotThinkX += distance;
                    
                    if(robotX + distance > roomX - 1)
                        robotX = roomX - 1;
                    else
                        robotX += distance;
                }
            }
            
            System.out.println("Robot thinks " + robotThinkX + " " + robotThinkY);
            System.out.println("Actually at " + robotX + " " + robotY + "\n\n");
        }
    }
}
