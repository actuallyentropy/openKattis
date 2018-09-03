/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lexie
 */
public class DRM 
{

    public static void main(String[] args) throws IOException 
    {
        /*
        int test = (int)'Z';
        test -= 65;
        System.out.println(test);
        */
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String data = input.readLine();
        
        StringBuilder section1 = new StringBuilder(data.substring(0, data.length() / 2));
        StringBuilder section2 = new StringBuilder(data.substring(data.length() / 2));
        
        int section1Key = 0;
        int section2Key = 0;
        
        for(int i = 0; i < section1.length(); i++)
        {
            int toAdd = (int)section1.charAt(i);
            toAdd -= 65;
            section1Key += toAdd;
            toAdd = (int)section2.charAt(i);
            toAdd -= 65;
            section2Key+= toAdd;
        }
        
        String result = "";
        
        for(int i = 0; i < section1.length(); i++)
        {
            int toChange1 = (int)section1.charAt(i);
            toChange1 -= 65;
            toChange1 = (toChange1 + section1Key) % 26;
            
            int toChange2 = (int)section2.charAt(i);
            toChange2 -= 65;
            toChange2 = (toChange2 + section2Key) % 26;
            
            int resultChar = (toChange1 + toChange2) % 26;
            resultChar += 65;
            result += (char)(resultChar);
        }
        
        System.out.println(result);
    }
    
}
