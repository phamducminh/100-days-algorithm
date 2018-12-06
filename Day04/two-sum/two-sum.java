// Runtime: 57 ms, faster than 10.43% of Java online submissions for Two Sum.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        
        return result;
    }
}

// Runtime: 7 ms, faster than 59.74% of Java online submissions for Two Sum.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                result[0] = i;
                result[1] = map.get(diff);
                break;
            }
        }
        
        return result;
    }
}