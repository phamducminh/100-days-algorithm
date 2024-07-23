class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        Map<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            hashMap.put(nums[i], i);
        }
        
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = target - x;
            if (hashMap.containsKey(y)) {
                result[0] = i;
                result[1] = hashMap.get(y);
                if (result[0] != result[1])
                    break;
            }
        }
        
        return result;
    }
}