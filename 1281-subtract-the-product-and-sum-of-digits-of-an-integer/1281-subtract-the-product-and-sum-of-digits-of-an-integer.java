class Solution {
    public int subtractProductAndSum(int n) {

        // copy original value
        int num = n;

        // initialzing sum and product
        int sum = 0;
        int prod = 1; // can't be zero

        while(num > 0){
            int digit = num % 10; //extracting last digit

            prod *= digit;  // prod = prod * digit (for each digit)
            sum += digit;   // sum = sum + digit

            num /= 10;  // shrinking num
        }
        return prod-sum;  // difference of prod and sum
    }
}