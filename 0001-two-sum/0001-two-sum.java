class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // creating an array of size 2 for storing sum values
        
        int [] arr = new int[2];

        for(int i = 0 ; i < nums.length ; i++){
           for(int j = i+1 ; j < nums.length ; j++){
               // if sum of i and j index == target 
               // then assign the values in arr else increment i&j
               if(nums[i]+nums[j] == target){
                   arr[0] = i;
                   arr[1] = j;
               }
           }
       }
       return arr;

    }
}