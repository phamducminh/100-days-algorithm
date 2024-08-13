// https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/
class Solution {
    
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] newArray = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int factor = (int)(Math.random() * (i + 1));
            newArray[i] = newArray[factor];
            newArray[factor] = nums[i];
        }
        
        return newArray;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */