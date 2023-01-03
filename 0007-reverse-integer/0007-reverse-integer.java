class Solution {
    public int reverse(int x) {
        
        // storing x in temp
        int temp = x;

        // for negative values
        boolean negativeFlag = false;
        if(temp < 0){
            negativeFlag = true;
            temp = -temp;
        }
        // finding reverseNum
        long reverseNum = 0;
        while(temp > 0){
            int digit = temp % 10; // extracting last digit of temp
            reverseNum = reverseNum*10 + digit; //appending last digit and storing in reverseNum
            temp /= 10; //shrinking last digit of temp
        }
        // for negative reassign
        if(negativeFlag){
            reverseNum = -reverseNum;
        }
        // returnig Reverse Number
        if(reverseNum >= -Math.pow(2,31) && reverseNum <= Math.pow(2,31)-1)         {
            return (int)reverseNum;
        }
        else{
            return 0;
        }
        
        
    }
}