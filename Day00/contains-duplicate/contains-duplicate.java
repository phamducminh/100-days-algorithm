// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctSet = new HashSet<>();
        int n = nums.length;
        boolean result = false;
        for (int i = 0; i < n; i++) {
            int value = nums[i];
            if (!distinctSet.contains(value)) {
                distinctSet.add(value);
            } else {
                result = true;
                break;
            }
        }
        
        return result;
    }
}