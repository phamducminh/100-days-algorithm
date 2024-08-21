// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        
        // [rob1, rob2, n, n+1,...]
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        
        return rob2;
    }
}