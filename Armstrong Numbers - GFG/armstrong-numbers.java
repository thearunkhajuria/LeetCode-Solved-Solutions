//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        // storing n into original number and temp
        int originalNumber = n;
        int temp = n;
        
        // finding armstrong number of temp (3 digits)
        int sum = 0; // stores sum of cubes of each digits
        while(temp > 0){
            int digit = temp % 10; // extracting last digit
            sum += Math.pow(digit,3); //finding cubes and adding
            temp /= 10; // shrinking last digit of temp
        }
        // checking armstrong or not
        if(originalNumber == sum){
            return "Yes";
        }
        else{
            return "No";
        }
        
    }
}