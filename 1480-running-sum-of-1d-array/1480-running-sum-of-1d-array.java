class Solution {

    public int[] runningSum(int[] nums) {

        // Solution 2: Optimized (and without new array for sum)
        
        int[] arr = nums;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr; 
            
        /*
        // Solution 1 : Brute-Force
        
        // copy values
        int[] arr = nums;
        int N = arr.length; // stores length of array

        // creating new array for running sum 
        int[] runSum = new int[N];

        // storing 0th index
        runSum[0] = arr[0];

        // assigning other values and finding running sum
        for(int i = 1 ; i < N ; i++){
            runSum[i] = runSum[i-1] + arr[i];
        }
        
      return runSum; 
      */
    }

}