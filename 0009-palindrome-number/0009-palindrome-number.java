class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int revNum = 0;
        
        int num = x;
        // for negative values
        if(num<0){
            return false;
        }
        // checking digit of num
        while(num != 0){
            int rem = num%10;   //last digit
            revNum = revNum*10 + rem;   //adding in rev
            num /= 10;      // reduce the num 
        }
        //checking palindrome
        return originalNum == revNum;
    }
}