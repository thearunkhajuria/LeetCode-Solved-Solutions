//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int origNum = n;
        int revNum = 0;
        
        //for negative values(edge case)
        if(n<0)
        {
            n = -n;
        }        
        // for palindrome 
        while(n > 0){
            int rem = n%10; //last digit of n
            revNum = revNum*10 + rem;   //adding into revNum
            n /= 10;    //reduce n
        }
        //checking palindrome or not
        if(origNum == revNum){
            return "Yes";
        }else{
            return "No";
        }
        
    }
}