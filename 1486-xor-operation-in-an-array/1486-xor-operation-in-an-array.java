class Solution {
    public int xorOperation(int n, int start) {
        
        // array for storing value of start+2*i
        // int[] nums = new int[n];
        
        int ans = 0;
        
        for(int i = 0 ; i < n ; i++){
            
            // using nums array
//             nums[i] = start + 2 * i;
//             ans ^= nums[i];
            
            // without using nums array
            // xor directly with the value for each iteration
            ans ^= start + 2 * i;
            
        }
        
        return ans;
    }
}