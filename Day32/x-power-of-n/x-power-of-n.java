// https://leetcode.com/explore/interview/card/top-interview-questions-medium/113/math/818/ 
class Solution {
    private double helper(double x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        
        double res = helper(x * x, n / 2);
        return (n % 2 == 0) ? res : x * res;
    }
    
    public double myPow(double x, int n) {
        double res = helper(x, Math.abs(n));
        return n >= 0 ? res : (1 / res);
    }
}