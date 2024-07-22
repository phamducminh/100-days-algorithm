// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        
        if (length <= 1) {
            return length;
        }
        
        int j = 0;
        
        for (int i = 0; i < length - 1; ++i) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        
        nums[j++] = nums[length - 1];
        
        return j;
        
    }
}