// 9. Palindrome Number : https://leetcode.com/problems/palindrome-number/description/

/* Given an integer x, return true if x is a palindrome , and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:

-231 <= x <= 231 - 1
*/

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
//Runtime 9 ms Beats 97.42% Memory 42 MB Beats 69.24%
