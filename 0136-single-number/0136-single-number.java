class Solution {
    public int singleNumber(int[] nums) {
        
        // -- Logic--
        //1. For checking duplicates
        // any num XOR with same num gives 0 (3^3 = 0)
        //2. for checking single number
        //any num XOR with 0 gives same num (3^0 = 3)

        int singleNum = 0;
        // Opeators follow Associative rule, so XOR order doesn't matter
        // here each element of nums(array) is XOR with singleNum

        for(int n : nums){
            singleNum ^=  n;
        }

        return singleNum;

    }
}