/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Datum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        
        SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = fr.parse("2009-" + month + "-" + day);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int solution = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(solution)
        {
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
        }
    }
    
}
