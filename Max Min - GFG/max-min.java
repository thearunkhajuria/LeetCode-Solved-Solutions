//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        // copying original data
        int arr[] = A;
        int maxNum = 0;
        int minNum = 0;
        
        // traverse the array for finding min and max number
        
        for(int i = 0 ; i < N-1 ; i++){

            // for minimum number
            if(arr[i] < minNum){
                minNum = arr[i];
            }
            
            // for maximum number
            if(arr[i] >  maxNum){
                maxNum = arr[i];
            }
        }
        
        // sum of minimum and maximum
        return minNum + maxNum;
        
    }
}
