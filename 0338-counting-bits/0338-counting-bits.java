class Solution {
    public int[] countBits(int n) {
        
        // my approach
        /* solution is that we have to count no. of 1 for each
            value of i, and store count for every i in ans array
        */
        
        // creating array (ans) of n+1 size
        int[] ans = new int[n+1];
        
        
        for(int i = 0 ; i <= n ; i++){
            
            int cBits = 0; // counting no of 1 bits for every i
            int temp = i;  // copy value of i 
            
            while(temp!=0){
                // if bit is 1 then only increment to countBits
                if( (temp & 1) == 1){
                    cBits++;
                }
                temp = temp >> 1;   //shrinking temp 
            }

            //storing in ans
            ans[i] = cBits; // storing countBits for each value of i
        }
        return ans;  // returns answer i.e. ans array
    }
}