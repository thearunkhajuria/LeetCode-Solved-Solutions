//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        
        long gcd =  gcd(A,B); // calling gcd function
        long lcm = (A * B) / gcd(A,B);
        
        // Long type array for storing lcm and gcd 
        Long[] ans = {lcm , gcd};
        return ans;
    }
    
    // function for finding gcd of two numbers
    static long gcd (long a , long b){
        
        if(a == 0){
            return b;
        }
     
        return gcd(b % a , a); //recursive call
    }
   
    
};