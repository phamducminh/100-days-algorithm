// https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 3) {
            return (n == 3 | n == 1);
        }
        
        while (n >= 3) {
            if (n % 3 != 0) return false;
            else n /= 3;
        }
        
        return n == 1;
    }
}