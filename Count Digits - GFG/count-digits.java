//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        // code here        
        // Solution  : Using while loop
        // Time complexity : O(n)
        
        int temp = N;
        
        int count = 0;  // counts the no. of digits in temp
          
        while(temp > 0){
            int digit = temp % 10; // extracts last digit
    
            // check if digit is dividing num evenly then count++
            // if digit != 0(True) then only it will check for even
            if(digit!=0  && N % digit == 0)
            {
                count += 1;
            }
            temp /= 10;
        }
        return count;
        
    }
}