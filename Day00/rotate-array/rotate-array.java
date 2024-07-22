// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        
        k %= n;
        int d = 0;
        for (int i = n - k; i < n; i++) {
            temp[d++] = nums[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[d++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}