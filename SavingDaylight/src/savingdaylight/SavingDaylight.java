package savingdaylight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SavingDaylight 
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
            
            String[] firstTime = data[data.length - 2].split(":");
            String[] secondTime = data[data.length - 1].split(":");
            
            int riseHour = Integer.parseInt(firstTime[0]);
            int riseMinute = Integer.parseInt(firstTime[1]);
            
            int setHour = Integer.parseInt(secondTime[0]);
            int setMinute = Integer.parseInt(secondTime[1]);
            
            int totalHours = setHour-riseHour;
            int totalMinutes;
            
            if(setMinute < riseMinute)
            {
                totalHours--;
                totalMinutes = 60 - (riseMinute - setMinute);
            }else
                totalMinutes = setMinute - riseMinute;
            
            System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + totalHours + " hours " + totalMinutes + " minutes");
        }
    }
}
