// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/565/
class Solution {
    public int hammingWeight(int n) {
        int count;
        for (count = 0; n != 0; count++) {
            n &= n - 1;
        }
        return count;
    }
}