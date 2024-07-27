// Runtime: 11 ms, faster than 25.53% of Java online submissions for Single Number.
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]);
                map.put(nums[i], ++value);
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            int key = ((Integer) pair.getKey()).intValue();
            int value = ((Integer) pair.getValue()).intValue();

            if (value == 1) {
                result = key;
                break;
            }
        }
        
        return result;
    }

    public int singleNumber2(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        
        return result;
    }
}