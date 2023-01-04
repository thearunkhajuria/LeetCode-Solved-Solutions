//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
        String word = str; // store original string in word
        int len = word.length()-1; // value of length of string
        
        // travese word from reverse side 
        // for loop->from last character (length of word) to 0
        
        // stores each character in reverse word string
        String revWord = "";
        for(int i = len ; i >= 0 ; i--){
             revWord += word.charAt(i);
        }
        // returns reverse word
        return revWord;
        
    }
}