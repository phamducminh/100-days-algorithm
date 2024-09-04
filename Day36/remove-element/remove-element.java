// https://leetcode.com/problems/remove-element/description/
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[r] == val) {
                r--;
            } else if (nums[l] != val) {
                l++;
            } else {
                nums[l] = nums[r];
                nums[r] = val;
                l++;
                r--;
            }
        }
        return l++;
    }
}