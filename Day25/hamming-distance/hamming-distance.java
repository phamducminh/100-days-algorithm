// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
class Solution {
    public int hammingDistance(int x, int y) {
        int count;
        int n = x ^ y;
        for (count = 0; n != 0; count++) {
            n &= n - 1;
        }
        return count;
    }
}