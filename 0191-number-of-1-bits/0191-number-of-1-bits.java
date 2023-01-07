public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        // copy original value
        int num = n;
        int count = 0;

        while(num != 0){
            //checking if last bit is 1, then increment count
            if( (num & 1) == 1){
                count++;
            }
            num = num >>> 1; //right shift the bit by 1
        }
        return count;
    }
}