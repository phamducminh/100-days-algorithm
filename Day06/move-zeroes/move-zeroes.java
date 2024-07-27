// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (i < nums.length) {
            if (nums[i] == 0) {
                while (j < nums.length) {
                    if (nums[j] == 0) {
                        j++;
                    }
                    else {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
                i++;
            } else {
                j = ++i;
            }
        }
    }
}