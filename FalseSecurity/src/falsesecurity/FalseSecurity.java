package falsesecurity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FalseSecurity 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        //Determine conditionally if one of the four special characters in use, to save time on array searches later
        //If not, just do math to it
        
        String[] morseKey = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", 
            "--..", "..--", ".-.-", "---.", "----"};
                
        while(true)
        {
            String encoded = input.readLine();
            
            if(encoded == null)
                break;
            
            String morse = "";
            StringBuilder digits = new StringBuilder("");
            
            for(int i = 0; i < encoded.length(); i++)
            {
                switch(encoded.charAt(i))
                {
                    case '_': morse += morseKey[26];
                    digits.append(Integer.toString(morseKey[26].length()));
                    break;
                    case ',': morse += morseKey[27];
                    digits.append(Integer.toString(morseKey[27].length()));
                    break;
                    case '.': morse += morseKey[28];
                    digits.append(Integer.toString(morseKey[28].length()));
                    break;
                    case '?': morse += morseKey[29];
                    digits.append(Integer.toString(morseKey[29].length()));
                    break;
                    default: morse += morseKey[(int)(encoded.charAt(i)) - 65];
                    digits.append(morseKey[(int)(encoded.charAt(i)) - 65].length());
                    break;
                } 
            }
            
            String reversal = digits.reverse().toString();
            String decoded = "";
            int i = 0;
            int j = 0;
            
            while(i < morse.length())
            {
                String segment = morse.substring(i, i + (Integer.parseInt(Character.toString(reversal.charAt(j)))));                
                int index = 0;
                
                for(int k = 0; k < morseKey.length; k++)
                {
                    if(morseKey[k].equals(segment))
                    {
                        index = k;
                        break;
                    }
                }
                
                switch(index)
                {
                    case 26: decoded += "_";
                    break;
                    case 27: decoded += ",";
                    break;
                    case 28: decoded += ".";
                    break;
                    case 29: decoded += "?";
                    break;
                    default: decoded += (char)(index + 65);
                }
                
                i += (Integer.parseInt(Character.toString(reversal.charAt(j))));
                j++;
            }
            
            System.out.println(decoded);
        }
    }
}
