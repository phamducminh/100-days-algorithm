// https://leetcode.com/explore/interview/card/top-interview-questions-medium/113/math/816/
class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}